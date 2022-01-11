package com.aa.apauto.sabrewebservices.interceptors;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;

import org.ebxml.namespaces.messageheader.MessageHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapMessage;

import com.aa.apauto.sabrewebservices.configuration.SwsConfiguration;

@Service
public class TripSearchInterceptor extends BaseInterceptor implements ClientInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(TripSearchInterceptor.class);
	private static final String HEADER_NS = "http://www.ebxml.org/namespaces/messageHeader";
	private static final String HEADER_LOCAL_NAME = "MessageHeader";
	private static final QName headerQName = new QName(HEADER_NS, HEADER_LOCAL_NAME);
	private SwsConfiguration swsConfiguration;

	public TripSearchInterceptor(SwsConfiguration swsConfiguration) {
		super();
		this.swsConfiguration = swsConfiguration;
	}

	@Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
		logRequestResponse("Trip SearchRequest", messageContext.getRequest());
		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		try {
			MessageHeader header = extractMessageHeaderFromMessageContext(messageContext);

			if (!isTripSearchRS(header)) {
				throw new UnsupportedOperationException("This interceptors works with Trip_SearchRQ only");
			}
			logRequestResponse("Trip Search Response", messageContext.getResponse());

		} catch (NullPointerException e) {
			logger.error("Error occurred during retrieving Trip Search", e);
		}
		return true;

	}

	boolean isTripSearchRS(MessageHeader header) {
		return header.getAction().equalsIgnoreCase("Trip_SearchRS")
				|| header.getAction().equalsIgnoreCase("Trip_SearchRQ");
	}

	MessageHeader extractMessageHeaderFromMessageContext(MessageContext messageContext) {
		SoapMessage message = (SoapMessage) messageContext.getResponse();
		Source headerSource = message.getSoapHeader().examineHeaderElements(headerQName).next().getSource();
		return (MessageHeader) swsConfiguration.getTripSearchJaxbMarshaller().unmarshal(headerSource);
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
