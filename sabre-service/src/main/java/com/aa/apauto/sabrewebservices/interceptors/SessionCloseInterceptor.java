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

@Service
public class SessionCloseInterceptor extends BaseInterceptor implements ClientInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(SessionCloseInterceptor.class);
	private static final String HEADER_NS = "http://www.ebxml.org/namespaces/messageHeader";
	private static final String HEADER_LOCAL_NAME = "MessageHeader";
	private static final QName headerQName = new QName(HEADER_NS, HEADER_LOCAL_NAME);
	private Jaxb2Marshaller sessionMarshaller;

	public SessionCloseInterceptor(@Qualifier("sessionMarshaller") Jaxb2Marshaller sessionMarshaller) {
		super();
		this.sessionMarshaller = sessionMarshaller;
	}

	@Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
		logRequestResponse("Session Close Request", messageContext.getRequest());
		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		logger.info("Returning Session");
		try {
			MessageHeader header = extractMessageHeaderFromMessageContext(messageContext);

			if (!isSessionCloseRS(header)) {
				throw new UnsupportedOperationException("This interceptors works with SessionCloseRQ only");
			}
			logRequestResponse("Session Close Response", messageContext.getResponse());

		} catch (JAXBException | NullPointerException e) {
			logger.error("Error occurred during retrieving session token", e);
		}
		return true;

	}

	boolean isSessionCloseRS(MessageHeader header) {
		return header.getAction().equalsIgnoreCase("SessionCloseRS");
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
