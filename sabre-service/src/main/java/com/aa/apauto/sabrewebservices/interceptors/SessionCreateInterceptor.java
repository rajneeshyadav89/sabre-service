package com.aa.apauto.sabrewebservices.interceptors;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;

import org.ebxml.namespaces.messageheader.MessageHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapMessage;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.aa.apauto.sabrewebservices.core.SessionPool;

@Service
public class SessionCreateInterceptor extends BaseInterceptor implements ClientInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(SessionCreateInterceptor.class);
	private static final String SECURITY_NS = "http://schemas.xmlsoap.org/ws/2002/12/secext";
	private static final String SECURITY_LOCAL_NAME = "Security";
	private static final QName securityQName = new QName(SECURITY_NS, SECURITY_LOCAL_NAME);

	private static final String HEADER_NS = "http://www.ebxml.org/namespaces/messageHeader";
	private static final String HEADER_LOCAL_NAME = "MessageHeader";
	private static final QName headerQName = new QName(HEADER_NS, HEADER_LOCAL_NAME);

	private Jaxb2Marshaller sessionMarshaller;
	private SessionPool sessionPool;

	public SessionCreateInterceptor(@Qualifier("soapMarshaller") Jaxb2Marshaller sessionMarshaller,
			SessionPool sessionPool) {
		super();
		this.sessionMarshaller = sessionMarshaller;
		this.sessionPool = sessionPool;
	}

	@Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
		logRequestResponse("Request", messageContext.getRequest());
		return true;
	}

	@SuppressWarnings("serial")
	@Override
	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		String token = null;
		Security security = null;
		try {
			security = extractSecurityFromMessageContext(messageContext);
			MessageHeader header = extractMessageHeaderFromMessageContext(messageContext);

			if (!header.getAction().equalsIgnoreCase("SessionCreateRS")) {
				throw new UnsupportedOperationException("This interceptors works with SessionCreateRQ only");
			}
			token = security.getBinarySecurityToken();
		} catch (JAXBException | NullPointerException e) {
			logger.error("Error occurred during retrieving session token", e);
		}

		logger.debug("Creating session object with token: {}", token);

		if (token == null) {
			throw new WebServiceClientException("Couldn't retrieve session token from message") {
			};
		}

		sessionPool.addToPool(security);

		logRequestResponse("Response", messageContext.getResponse());

		return true;
	}

	Security extractSecurityFromMessageContext(MessageContext messageContext) throws JAXBException {

		SoapMessage message = (SoapMessage) messageContext.getResponse();
		System.out.println(message);
		Source securitySource = message.getSoapHeader().examineHeaderElements(securityQName).next().getSource();
		System.out.println(securitySource);
		return (Security) sessionMarshaller.unmarshal(securitySource);
	}

	MessageHeader extractMessageHeaderFromMessageContext(MessageContext messageContext) throws JAXBException {

		SoapMessage message = (SoapMessage) messageContext.getResponse();
		Source headerSource = message.getSoapHeader().examineHeaderElements(headerQName).next().getSource();
		return (MessageHeader) sessionMarshaller.unmarshal(headerSource);
	}

	@Override
	public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
		return false;
	}

	@Override
	public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
		/**
		 * No implementation required
		 */
	}
}
