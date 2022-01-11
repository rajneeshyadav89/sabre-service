package com.aa.apauto.sabrewebservices.interceptors;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;

@Service
public class BaseInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(BaseInterceptor.class);

	protected void logRequestResponse(String messageType, WebServiceMessage message) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try {
			message.writeTo(outputStream);
			//String stream = outputStream.toString(StandardCharsets.UTF_8);
			//logger.info("{} from/to SWS: \n {}", messageType, stream);
		} catch (IOException e) {
			logger.error("Error printing SWS response: ", e);
		}
	}
}
