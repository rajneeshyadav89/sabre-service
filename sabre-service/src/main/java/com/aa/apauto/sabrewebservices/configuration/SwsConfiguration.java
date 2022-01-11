package com.aa.apauto.sabrewebservices.configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.opentravel.ota._2003._05.OTAPingRQ;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;

import com.aa.apauto.sabrewebservices.session.WebServiceSession;
@Configuration
@Service
public class SwsConfiguration {

	@Value("${apauto.swsservice.queue.size}")
	private int swsQueueSize;
	
	@Value("${apauto.swsservice.apigeeUrl}")
	private String swsApigeeServiceUrl;

	@Value("${apauto.swsservice.directSabreUrl}")
	private String swsDirectServiceUrl;

	@Value("${apauto.swsservice.city.code}")
	private String swsCityCode;
	@Value("${apauto.swsservice.apikey}")
	private String apiKey;

	public String getApiKey() {
		return apiKey;
	}

	
	@Bean(name = "sessionMarshaller")
	public Jaxb2Marshaller getSessionJaxbMarshaller() throws Exception {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.aa.apauto.sabrewebservices.stub.sessioncreate.service:com.aa.apauto.sabrewebservices.stub.sessionclose.service:com.aa.apauto.sabrewebservices.stub.common:com.aa.apauto.sabrewebservices.stub.soap");
        return marshaller;
    }
	
	@Bean(name = "pingMarshaller")
	public Jaxb2Marshaller getPingJaxbMarshaller() throws Exception {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.aa.apauto.sabrewebservices.stub.sessionrefresh.service:com.aa.apauto.sabrewebservices.stub.common:com.aa.apauto.sabrewebservices.stub.soap");
        return marshaller;
    }
	
	@Bean(name = "soapMarshaller")
	public Jaxb2Marshaller getSoapJaxbMarshaller() throws Exception {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.aa.apauto.sabrewebservices.stub.sessioncreate.service:com.aa.apauto.sabrewebservices.stub.common:com.aa.apauto.sabrewebservices.stub.soap");
        return marshaller;
    }
	
	@Bean(name = "soapPingMarshaller")
	public Jaxb2Marshaller getSoapPingJaxbMarshaller() throws Exception {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.aa.apauto.sabrewebservices.stub.sessionrefresh.service:com.aa.apauto.sabrewebservices.stub.common:com.aa.apauto.sabrewebservices.stub.soap");
        return marshaller;
    }

	@Bean(name = "sabreCommandMarshaller")
	public Jaxb2Marshaller getSabreCommandJaxbMarshaller() throws Exception {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.aa.apauto.sabrewebservices.stub.sabrecommand.service:com.aa.apauto.sabrewebservices.stub.common:com.aa.apauto.sabrewebservices.stub.soap");
		return marshaller;
	}
	
	//Jaxb2Marshaller is not thread safe. So cannot use singleton bean
	public Jaxb2Marshaller getTripSearchJaxbMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.aa.apauto.sabrewebservices.stub.tripsearch.service:com.aa.apauto.sabrewebservices.stub.common:com.aa.apauto.sabrewebservices.stub.soap");
		return marshaller;
	}

	@Bean(name = "pingRequest")
	public OTAPingRQ getDetails() throws Exception {
		OTAPingRQ pingrequest = new OTAPingRQ();
		pingrequest.setEchoData("Pinging session...");
		pingrequest.setVersion("1.0.0");
        return pingrequest;
    }

	public int getSwsQueueSize() {
		return swsQueueSize;
	}

	public String getSwsCityCode() {
		return swsCityCode;
	}


	public String getSwsApigeeServiceUrl() {
		return swsApigeeServiceUrl;
	}

	public String getSwsDirectServiceUrl() {
		return swsDirectServiceUrl;
	}

	public String getTripConversationId() {
		String conversationId = "raptor" + "@aa.com";
		if(WebServiceSession.get("CLIENT_ID") != null) {
			return WebServiceSession.get("CLIENT_ID") + "-" + conversationId;
		}
 		return conversationId.trim();
	}
	
	public String getMessageId() {
		if(WebServiceSession.get("TRANSACTION_ID") != null) {
			return (String)WebServiceSession.get("TRANSACTION_ID");
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddhhmmss");
			StringBuffer buffer = new StringBuffer(sdf.format(new Date()));
			buffer.append("-");
			buffer.append(RandomStringUtils.randomAlphanumeric(8));
			return buffer.toString().trim();
		}
	}


}
