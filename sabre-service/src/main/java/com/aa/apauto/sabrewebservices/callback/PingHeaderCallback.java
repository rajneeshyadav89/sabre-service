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
public class PingHeaderCallback extends BaseHeaderCallback {
    private static final Logger logger = LoggerFactory.getLogger(PingHeaderCallback.class);
    private Jaxb2Marshaller sessionMarshaller;
    private Security sessionToPing;


    public PingHeaderCallback(@Qualifier("pingMarshaller")Jaxb2Marshaller sessionMarshaller, MessageHeaderFactory messageHeaderFactory,
                              SwsConfiguration swsConfiguration, CallbackConfig callbackConfig) {
        super(messageHeaderFactory, swsConfiguration, callbackConfig);
        this.sessionMarshaller = sessionMarshaller;
    }

    public void setSessionToPing(Security sessionToPing) {
        logger.info("Setting session to Ping {} ", sessionToPing.getBinarySecurityToken());
        this.sessionToPing = sessionToPing;
    }

    public String getActionString() {
        return SWSConstants.OTA_PING_ACTION;
    }

    public void marshallHeader(MessageHeader header, SoapHeader soapHeaderElement) {
        sessionMarshaller.marshal(header, soapHeaderElement.getResult());
        sessionMarshaller.marshal(sessionToPing, soapHeaderElement.getResult());
    }

}
