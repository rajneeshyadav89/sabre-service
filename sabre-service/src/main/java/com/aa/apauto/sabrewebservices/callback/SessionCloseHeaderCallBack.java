package com.aa.apauto.sabrewebservices.callback;

import org.ebxml.namespaces.messageheader.MessageHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.soap.SoapHeader;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.aa.apauto.sabrewebservices.configuration.CallbackConfig;
import com.aa.apauto.sabrewebservices.configuration.MessageHeaderFactory;
import com.aa.apauto.sabrewebservices.configuration.SwsConfiguration;
import com.aa.apauto.sabrewebservices.constants.SWSConstants;


@Service
public class SessionCloseHeaderCallBack extends BaseHeaderCallback {
	private static final Logger logger = LoggerFactory.getLogger(SessionCloseHeaderCallBack.class);
	private Jaxb2Marshaller sessionMarshaller;
	private Security security;


	public SessionCloseHeaderCallBack( @Qualifier("sessionMarshaller") Jaxb2Marshaller sessionMarshaller,
			MessageHeaderFactory messageHeaderFactory, CallbackConfig callbackConfig,
			SwsConfiguration swsConfiguration) {
		super(messageHeaderFactory, swsConfiguration, callbackConfig);
		this.sessionMarshaller = sessionMarshaller;
		this.messageHeaderFactory = messageHeaderFactory;
		this.callbackConfig = callbackConfig;
		this.swsConfiguration = swsConfiguration;
	}


	public void setSessionToClose(Security sessionToClose) {
		logger.info("Setting session to Close {} ",sessionToClose.getBinarySecurityToken());
		this.security = sessionToClose;
	}

	public String getActionString() {
		return SWSConstants.SESSION_CLOSE_ACTION;
	}

	public void marshallHeader(MessageHeader header, SoapHeader soapHeaderElement) {
		sessionMarshaller.marshal(header, soapHeaderElement.getResult());
		sessionMarshaller.marshal(security, soapHeaderElement.getResult());
	}
}
