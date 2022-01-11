package com.aa.apauto.sabrewebservices.callback;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.soap.SoapHeader;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.aa.apauto.sabrewebservices.configuration.CallbackConfig;
import com.aa.apauto.sabrewebservices.configuration.MessageHeaderFactory;
import com.aa.apauto.sabrewebservices.configuration.SwsConfiguration;
import com.aa.apauto.sabrewebservices.constants.SWSConstants;

@Service
public class TripSearchHeaderCallback extends BaseHeaderCallback {
    private Security session;

    public TripSearchHeaderCallback(MessageHeaderFactory messageHeaderFactory,
                                    SwsConfiguration swsConfiguration, CallbackConfig callbackConfig) {
        super(messageHeaderFactory, swsConfiguration, callbackConfig);
    }

    public void setSession(Security sessionToPing) {
        this.session = sessionToPing;
    }

	public String getActionString() {
        return SWSConstants.TRIP_SEARCH_ACTION;
    }

    public void marshallHeader(MessageHeader header, SoapHeader soapHeaderElement) {
    	Jaxb2Marshaller marshaller = swsConfiguration.getTripSearchJaxbMarshaller();
    	marshaller.marshal(header, soapHeaderElement.getResult());
    	marshaller.marshal(session, soapHeaderElement.getResult());
    }

}
