package com.aa.apauto.sabrewebservices.core;

import org.opentravel.ota._2003._05.ErrorType;
import org.opentravel.ota._2003._05.ErrorsType;
import org.opentravel.ota._2003._05.OTAPingRQ;
import org.opentravel.ota._2003._05.OTAPingRS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceIOException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.aa.apauto.sabrewebservices.callback.PingHeaderCallback;
import com.aa.apauto.sabrewebservices.configuration.SwsConfiguration;
import com.aa.apauto.sabrewebservices.configuration.SwsHttpComponentsMessageSender;

@Service
public class PingService {

	private static final Logger logger = LoggerFactory.getLogger(PingService.class);
	private WebServiceTemplate swsWebServiceTemplate;
	private SwsConfiguration swsConfiguration;
	private PingHeaderCallback pingHeaderCallback;
	private OTAPingRQ pingRequest;
	
	public PingService(@Qualifier("soapPingMarshaller") Jaxb2Marshaller marshaller, SwsHttpComponentsMessageSender messageSender,
                       SwsConfiguration swsConfiguration, PingHeaderCallback pingHeaderCallback, @Qualifier("pingRequest")OTAPingRQ pingRequest ) {
		super();
		this.swsConfiguration = swsConfiguration;
		this.pingHeaderCallback = pingHeaderCallback;
		swsWebServiceTemplate = new WebServiceTemplate();
		swsWebServiceTemplate.setMarshaller(marshaller);
		swsWebServiceTemplate.setUnmarshaller(marshaller);
		swsWebServiceTemplate.setMessageSender(messageSender);
		this.pingRequest = pingRequest;
		System.out.println("Pinging Sesion");
		System.out.println(this.pingRequest.getEchoData());
		System.out.println("closing Sesion");
	}
	 public OTAPingRS executePing(Security sessionToPing) {
		OTAPingRS result = null;
		
		pingHeaderCallback.setSessionToPing(sessionToPing);

		logger.debug("Starting ping for token: {}", sessionToPing.getBinarySecurityToken());
		try {
			result = (OTAPingRS) swsWebServiceTemplate.marshalSendAndReceive(swsConfiguration.getSwsApigeeServiceUrl(),
					pingRequest, pingHeaderCallback);
		}
		catch (WebServiceIOException webserviceException) {
			logger.warn(
					"Invoking executePing marshalSendAndReceive with direct sws url as the apigee url returned WebServiceIOException");
			swsWebServiceTemplate.marshalSendAndReceive(swsConfiguration.getSwsDirectServiceUrl(),
					pingRequest, pingHeaderCallback);
		}catch (Exception e) {
			logger.error("Error in ping for token: " + sessionToPing.getBinarySecurityToken(), e);
			ErrorsType errorsType = new ErrorsType();
			ErrorType errorType = new ErrorType();
			errorType.setShortText(e.getMessage());
			errorsType.getError().add(errorType);
			result = new OTAPingRS();
			result.setErrors(errorsType);
		}

		if (null != result && result.getErrors() == null) {
			logger.debug("Successful ping for token: {}", sessionToPing.getBinarySecurityToken());
		}

		return result;
	}

}
