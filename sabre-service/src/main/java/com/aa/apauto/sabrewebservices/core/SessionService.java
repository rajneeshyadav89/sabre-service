package com.aa.apauto.sabrewebservices.core;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2002._11.SessionCloseRQ;
import org.opentravel.ota._2002._11.SessionCreateRQ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceIOException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.aa.apauto.sabrewebservices.callback.SessionCloseHeaderCallBack;
import com.aa.apauto.sabrewebservices.callback.SessionCreateHeaderCallBack;
import com.aa.apauto.sabrewebservices.configuration.SwsConfiguration;
import com.aa.apauto.sabrewebservices.configuration.SwsHttpComponentsMessageSender;
import com.aa.apauto.sabrewebservices.interceptors.SessionCloseInterceptor;
import com.aa.apauto.sabrewebservices.interceptors.SessionCreateInterceptor;
import com.aa.apauto.sabrewebservices.session.WebServiceSession;

@Service
public class SessionService {
	private static final Logger logger = LoggerFactory.getLogger(SessionService.class);

	private WebServiceTemplate swsWebServiceTemplate;
	private SessionCreateHeaderCallBack sessionCreateHeaderCallback;
	private SessionCreateInterceptor sessionCreateInterceptor;
	private SessionCloseHeaderCallBack sessionCloseHeaderCallback;
	private SessionCloseInterceptor sessionCloseInterceptor;
	private SwsConfiguration swsConfiguration;

	public SessionService(@Qualifier("sessionMarshaller") Jaxb2Marshaller marshaller,
			SwsHttpComponentsMessageSender messageSender, SessionCreateHeaderCallBack sessionCreateHeaderCallback,
			SessionCreateInterceptor sessionCreateInterceptor, SessionCloseHeaderCallBack sessionCloseHeaderCallback,
			SessionCloseInterceptor sessionCloseInterceptor, SwsConfiguration swsConfiguration) {
		super();
		this.sessionCreateHeaderCallback = sessionCreateHeaderCallback;
		this.sessionCreateInterceptor = sessionCreateInterceptor;
		this.sessionCloseHeaderCallback = sessionCloseHeaderCallback;
		this.sessionCloseInterceptor = sessionCloseInterceptor;
		this.swsConfiguration = swsConfiguration;
		swsWebServiceTemplate = new WebServiceTemplate();
		swsWebServiceTemplate.setMarshaller(marshaller);
		swsWebServiceTemplate.setUnmarshaller(marshaller);
		swsWebServiceTemplate.setMessageSender(messageSender);
	}

	public boolean createSession(String clientID) {
		List<ClientInterceptor> interceptors = new ArrayList<>();
		interceptors.add(sessionCreateInterceptor);
		swsWebServiceTemplate.setInterceptors(interceptors.toArray(new ClientInterceptor[0]));

		try {
			swsWebServiceTemplate.marshalSendAndReceive(swsConfiguration.getSwsApigeeServiceUrl(),
					getSessionCreateRequestBody(), sessionCreateHeaderCallback);
		} catch (WebServiceIOException webserviceException) {
			logger.warn(
					"Invoking createSession marshalSendAndReceive with direct sws url as the apigee url returned WebServiceIOException for clientId: {}",
					clientID);
			swsWebServiceTemplate.marshalSendAndReceive(swsConfiguration.getSwsDirectServiceUrl(),
					getSessionCloseRequestBody(), sessionCloseHeaderCallback);
		} catch (Exception e) {
			logger.error("Session Could not be created for clientId: {}: ", clientID, e);
			return false;
		}

		return true;
	}

	private SessionCreateRQ getSessionCreateRequestBody() {
		SessionCreateRQ requestBody = new SessionCreateRQ();
		SessionCreateRQ.POS pos = new SessionCreateRQ.POS();
		SessionCreateRQ.POS.Source source = new SessionCreateRQ.POS.Source();
		source.setPseudoCityCode(swsConfiguration.getSwsCityCode());
		pos.setSource(source);
		requestBody.setPOS(pos);
		return requestBody;
	}

	public void closeSession(Security security, String clientID) {
		try {
			List<ClientInterceptor> interceptors = new ArrayList<>();
			interceptors.add(sessionCloseInterceptor);
			swsWebServiceTemplate.setInterceptors(interceptors.toArray(new ClientInterceptor[0]));
			sessionCloseHeaderCallback.setSessionToClose(security);
			WebServiceSession.set("CLIENT_ID", clientID);
			swsWebServiceTemplate.marshalSendAndReceive(swsConfiguration.getSwsApigeeServiceUrl(),
					getSessionCloseRequestBody(), sessionCloseHeaderCallback);
		} catch (WebServiceIOException webserviceException) {
			swsWebServiceTemplate.marshalSendAndReceive(swsConfiguration.getSwsDirectServiceUrl(),
					getSessionCloseRequestBody(), sessionCloseHeaderCallback);
		} catch (Exception e) {
			logger.error("Session Could not be closed", e);
		}
	}

	private SessionCloseRQ getSessionCloseRequestBody() {
		SessionCloseRQ requestBody = new SessionCloseRQ();
		SessionCloseRQ.POS pos = new SessionCloseRQ.POS();
		SessionCloseRQ.POS.Source source = new SessionCloseRQ.POS.Source();
		source.setPseudoCityCode(swsConfiguration.getSwsCityCode());
		pos.setSource(source);
		requestBody.setPOS(pos);
		return requestBody;
	}

}
