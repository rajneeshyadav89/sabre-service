package com.aa.apauto.sabrewebservices.callback;

import org.ebxml.namespaces.messageheader.MessageHeader;
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
public class SabreCommandHeaderCallBack  extends BaseHeaderCallback {

    private Jaxb2Marshaller sessionMarshaller;
    private Security session;

    public SabreCommandHeaderCallBack(@Qualifier("sabreCommandMarshaller") Jaxb2Marshaller sessionMarshaller, MessageHeaderFactory messageHeaderFactory,
                                      SwsConfiguration swsConfiguration, CallbackConfig callbackConfig) {
        super(messageHeaderFactory, swsConfiguration, callbackConfig);
        this.sessionMarshaller = sessionMarshaller;

    }

    public void setSession(Security sessionToPing) {
        this.session = sessionToPing;
    }

    public String getActionString() {
        return SWSConstants.SABRE_COMMAND_ACTION;
    }

    @Override
    public void marshallHeader(MessageHeader header, SoapHeader soapHeaderElement) {
        sessionMarshaller.marshal(header, soapHeaderElement.getResult());
        sessionMarshaller.marshal(session, soapHeaderElement.getResult());
    }

}
