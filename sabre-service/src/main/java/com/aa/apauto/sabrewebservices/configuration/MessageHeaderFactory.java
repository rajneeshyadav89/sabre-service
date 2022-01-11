package com.aa.apauto.sabrewebservices.configuration;

import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.ebxml.namespaces.messageheader.PartyId;
import org.ebxml.namespaces.messageheader.Service;
import org.ebxml.namespaces.messageheader.To;

@org.springframework.stereotype.Service
public class MessageHeaderFactory {

	public MessageHeader getMessageHeader(String actionString, String partyIdFrom, String partyIdTo) {

		MessageHeader header = new MessageHeader();
		header.setAction(actionString);
		header.setCPAId("AAO");
		header.setFrom(getFrom(partyIdFrom));
		header.setTo(getTo(partyIdTo));
		Service service = new Service();
		service.setValue(actionString);
		header.setService(service);

		return header;
	}

	private From getFrom(String partyIdFrom) {
		From from = new From();
		PartyId fromPartyId = new PartyId();
		fromPartyId.setValue(partyIdFrom);
		from.getPartyId().add(fromPartyId);
		return from;
	}

	private To getTo(String partyIdTo) {
		To to = new To();
		PartyId toPartyId = new PartyId();
		toPartyId.setValue(partyIdTo);
		to.getPartyId().add(toPartyId);
		return to;
	}

}
