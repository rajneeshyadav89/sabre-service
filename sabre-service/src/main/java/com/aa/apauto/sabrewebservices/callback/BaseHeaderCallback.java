package com.aa.apauto.sabrewebservices.callback;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.TransformerException;

import org.ebxml.namespaces.messageheader.Description;
import org.ebxml.namespaces.messageheader.MessageData;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpComponentsConnection;

import com.aa.apauto.sabrewebservices.configuration.CallbackConfig;
import com.aa.apauto.sabrewebservices.configuration.MessageHeaderFactory;
import com.aa.apauto.sabrewebservices.configuration.SwsConfiguration;

public abstract class BaseHeaderCallback implements WebServiceMessageCallback {

    private static final Logger logger = LoggerFactory.getLogger(BaseHeaderCallback.class);

    protected MessageHeaderFactory messageHeaderFactory;
    protected SwsConfiguration swsConfiguration;
    protected CallbackConfig callbackConfig;
    protected BaseHeaderCallback(MessageHeaderFactory messageHeaderFactory,
                                    SwsConfiguration swsConfiguration, CallbackConfig callbackConfig) {

        this.messageHeaderFactory = messageHeaderFactory;
        this.swsConfiguration = swsConfiguration;
        this.callbackConfig = callbackConfig;
    }
    @Override
    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
    	//header made as method level variable as concurrancy issue occured.
    	MessageHeader header = messageHeaderFactory.getMessageHeader(getActionString(), callbackConfig.getPartyIDFrom(), callbackConfig.getPartyIDTo());
        header.setConversationId(swsConfiguration.getTripConversationId());

        MessageData mData = new MessageData();
        mData.setMessageId(swsConfiguration.getMessageId());
        mData.setTimestamp((new Date()).toString());
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar date2 = null;
        try {
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            logger.error("Exception while Ping the session getting newXMLGregorianCalendar", e);
            throw new TransformerException(e);
        }
        mData.setTimeToLive(date2.normalize());
        header.setMessageData(mData);
        header.setDuplicateElimination("");
        Description desc = new Description();
        desc.setValue("somedescription");
        header.getDescription().add(desc);
        SoapHeader soapHeaderElement = ((SoapMessage) message).getSoapHeader();
        marshallHeader(header,soapHeaderElement);

        TransportContext context = TransportContextHolder.getTransportContext();
        HttpComponentsConnection connection = (HttpComponentsConnection) context.getConnection();
        connection.getHttpPost().addHeader("x-api-key", swsConfiguration.getApiKey());
        connection.getHttpPost().addHeader("serviceVersion", "1.0.1");
    }

    public abstract String getActionString();
    public abstract void marshallHeader(MessageHeader header, SoapHeader soapHeaderElement);
}
