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
public class SabreCommandInterceptor extends BaseInterceptor implements ClientInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(SabreCommandInterceptor.class);
	private static final String HEADER_NS = "http://www.ebxml.org/namespaces/messageHeader";
	private static final String HEADER_LOCAL_NAME = "MessageHeader";
	private static final QName headerQName = new QName(HEADER_NS, HEADER_LOCAL_NAME);
	private Jaxb2Marshaller sessionMarshaller;

	public SabreCommandInterceptor(@Qualifier("sabreCommandMarshaller") Jaxb2Marshaller sessionMarshaller) {
		super();
		this.sessionMarshaller = sessionMarshaller;

	}

	@Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
		logRequestResponse("SabreCommand Request", messageContext.getRequest());
		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		try {
			MessageHeader header = extractMessageHeaderFromMessageContext(messageContext);

			if (!isGetSabreCommandRS(header)) {
				throw new UnsupportedOperationException("This interceptors works with Sabre command only");
			}
			logRequestResponse("Sabre Command Response", messageContext.getResponse());

		} catch (JAXBException | NullPointerException e) {
			logger.error("Error occurred during retrieving Sabre command response", e);
		}
		return true;

	}

	boolean isGetSabreCommandRS(MessageHeader header) {
		return header.getAction().equalsIgnoreCase("SabreCommandLLSRS");
	}

	MessageHeader extractMessageHeaderFromMessageContext(MessageContext messageContext) throws JAXBException {

		SoapMessage message = (SoapMessage) messageContext.getResponse();
		Source headerSource = message.getSoapHeader().examineHeaderElements(headerQName).next().getSource();
		return (MessageHeader) sessionMarshaller.unmarshal(headerSource);
	}

	public void setSessionMarshaller(Jaxb2Marshaller sessionMarshaller) {
		this.sessionMarshaller = sessionMarshaller;
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
