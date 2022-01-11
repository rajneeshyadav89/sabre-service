package com.aa.apauto.sabrewebservices.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

import com.aa.apauto.sabrewebservices.core.SessionPool;
import com.aa.apauto.sabrewebservices.core.ThreadSessionPoolId;

@Service
public class SessionPoolInterceptor extends BaseInterceptor implements ClientInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(SessionPoolInterceptor.class);
	private SessionPool sessionPool;

	public SessionPoolInterceptor(SessionPool sessionPool) {
		super();
		this.sessionPool = sessionPool;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext) {
		String sessionPoolId = ThreadSessionPoolId.get();
		logger.debug("Conversation-Id before return it to pool: {}", sessionPoolId);
		sessionPool.returnToPool(sessionPoolId, false);

		logRequestResponse("Response", messageContext.getResponse());

		return true;
	}

	@Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
		logRequestResponse("Request", messageContext.getRequest());

		return true;
	}

	@Override
	public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
		logger.error("Error in SessionPoolInterceptor ");
		logRequestResponse("Request", messageContext.getRequest());
		logRequestResponse("Response", messageContext.getResponse());
		return false;
	}

	@Override
	public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
		/**
		 * No implementation required
		 */
	}
}
