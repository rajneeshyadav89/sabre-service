package com.aa.apauto.sabrewebservices.core;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceIOException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.aa.apauto.sabrewebservices.callback.SabreCommandHeaderCallBack;
import com.aa.apauto.sabrewebservices.configuration.SwsConfiguration;
import com.aa.apauto.sabrewebservices.configuration.SwsHttpComponentsMessageSender;
import com.aa.apauto.sabrewebservices.interceptors.SabreCommandInterceptor;
import com.sabre.webservices.sabrexml._2003._07.SabreCommandLLSRQ;
import com.sabre.webservices.sabrexml._2003._07.SabreCommandLLSRS;

@Service
public class SabreCommandService {
	private static final Logger logger = LoggerFactory.getLogger(SabreCommandService.class);

	private SwsConfiguration swsConfiguration;
	private SabreCommandInterceptor sabreCommandInterceptor;
	private SabreCommandHeaderCallBack sabreCommandHeaderCallBack;
	private WebServiceTemplate swsWebServiceTemplate;
	private SessionPool sessionPool;

	public SabreCommandService(@Qualifier("sabreCommandMarshaller") Jaxb2Marshaller marshaller,
			SwsHttpComponentsMessageSender messageSender, SabreCommandHeaderCallBack sabreCommandHeaderCallBack,
			SabreCommandInterceptor sabreCommandInterceptor, SwsConfiguration swsConfiguration,
			SessionPool sessionPool) {
		super();
		this.sabreCommandHeaderCallBack = sabreCommandHeaderCallBack;
		this.sabreCommandInterceptor = sabreCommandInterceptor;
		this.swsConfiguration = swsConfiguration;
		this.sessionPool = sessionPool;
		swsWebServiceTemplate = new WebServiceTemplate();
		swsWebServiceTemplate.setMarshaller(marshaller);
		swsWebServiceTemplate.setUnmarshaller(marshaller);
		swsWebServiceTemplate.setMessageSender(messageSender);
	}

	public SabreCommandLLSRS executeSabreCommand(String sabreCommand) throws Exception {
		String conversationId = UUID.randomUUID().toString();
		Security security = sessionPool.getFromPool(conversationId);
		sabreCommandHeaderCallBack.setSession(security);
		SabreCommandLLSRS sabreCommandLLSRS = null;
		List<ClientInterceptor> interceptors = new ArrayList<>();
		interceptors.add(sabreCommandInterceptor);
		swsWebServiceTemplate.setInterceptors(interceptors.toArray(new ClientInterceptor[0]));
		SabreCommandLLSRQ sabreCommandLLSRQ = null;
		if (null != sabreCommand) {
			sabreCommandLLSRQ = getSabreCommandRequest(sabreCommand);
		}
		try {
			sabreCommandLLSRS = (SabreCommandLLSRS) swsWebServiceTemplate.marshalSendAndReceive(
					swsConfiguration.getSwsApigeeServiceUrl(), sabreCommandLLSRQ, sabreCommandHeaderCallBack);
		} catch (WebServiceIOException webserviceException) {
			logger.warn(
					"Invoking executeSabreCommand marshalSendAndReceive with direct sws url as the apigee url returned WebServiceIOException for request: {}",
					sabreCommand);
			swsWebServiceTemplate.marshalSendAndReceive(swsConfiguration.getSwsDirectServiceUrl(), sabreCommandLLSRQ,
					sabreCommandHeaderCallBack);
		} finally {
			sessionPool.returnToPool(conversationId, false);
		}
		return sabreCommandLLSRS;
	}

	private SabreCommandLLSRQ getSabreCommandRequest(String sabreCommand) {
		SabreCommandLLSRQ sabreCommandLLSRQ = new SabreCommandLLSRQ();
		SabreCommandLLSRQ.Request request = new SabreCommandLLSRQ.Request();
		request.setHostCommand(sabreCommand);
		sabreCommandLLSRQ.setRequest(request);
		return sabreCommandLLSRQ;
	}
}
