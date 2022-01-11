package com.aa.apauto.sabrewebservices.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class CallbackConfig {

    @Value("${apauto.swsservice.partyid.to}")
    private String partyIDTo;

    @Value("${apauto.swsservice.partyid.from}")
    private String partyIDFrom;

    @Value("${apauto.swsservice.domain}")
    private String swsDomain;

    @Value("${apauto.swsservice.organization}")
    private String swsOrganization;

    @Value("${apauto.swsservice.password}")
    private String swsPassword;

    @Value("${apauto.swsservice.username}")
    private String swsUsername;


    public String getPartyIDTo() {
        return partyIDTo;
    }

    public String getPartyIDFrom() {
        return partyIDFrom;
    }

    public String getSwsDomain() {
        return swsDomain;
    }

    public String getSwsOrganization() {
        return swsOrganization;
    }

    public String getSwsPassword() {
        return swsPassword.trim();
    }

    public String getSwsUsername() {
        return swsUsername;
    }


}
