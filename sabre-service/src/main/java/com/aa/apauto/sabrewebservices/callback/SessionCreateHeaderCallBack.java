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
public class SessionCreateHeaderCallBack extends BaseHeaderCallback {
    private Jaxb2Marshaller sessionMarshaller;
    
    public SessionCreateHeaderCallBack(MessageHeaderFactory messageHeaderFactory, @Qualifier("soapMarshaller") Jaxb2Marshaller sessionMarshaller,
                                       CallbackConfig callbackConfig, SwsConfiguration swsConfiguration) {
        super(messageHeaderFactory, swsConfiguration, callbackConfig);
        this.sessionMarshaller = sessionMarshaller;
    }

    private Security getCredentialsSecurity() {
        Security security = new Security();
        Security.UsernameToken usernameToken = new Security.UsernameToken();
        usernameToken.setDomain(callbackConfig.getSwsDomain());
        usernameToken.setOrganization(callbackConfig.getSwsOrganization());
        usernameToken.setPassword(callbackConfig.getSwsPassword());
        usernameToken.setUsername(callbackConfig.getSwsUsername());
        security.setUsernameToken(usernameToken);
        return security;
    }

    public String getActionString() {
        return SWSConstants.SESSION_CREATE_ACTION;
    }

    public void marshallHeader(MessageHeader header, SoapHeader soapHeaderElement) {
        sessionMarshaller.marshal(header, soapHeaderElement.getResult());
        sessionMarshaller.marshal(getCredentialsSecurity(), soapHeaderElement.getResult());
    }

}
