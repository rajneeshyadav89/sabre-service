package com.aa.apauto.sabrewebservices.core;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceIOException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.aa.apauto.sabrewebservices.callback.TripSearchHeaderCallback;
import com.aa.apauto.sabrewebservices.configuration.SwsConfiguration;
import com.aa.apauto.sabrewebservices.configuration.SwsHttpComponentsMessageSender;
import com.aa.apauto.sabrewebservices.interceptors.TripSearchInterceptor;
import com.sabre.webservices.triprecord.SearchType;
import com.sabre.webservices.triprecord.TripSearchRQ;
import com.sabre.webservices.triprecord.TripSearchRS;

@Service
public class TripSearchService {
	private static final Logger logger = LoggerFactory.getLogger(TripSearchService.class);

	private SwsConfiguration swsConfiguration;
	private TripSearchInterceptor tripSearchInterceptor;
	private TripSearchHeaderCallback tripSearchHeaderCallback;
	private SessionPool sessionPool;
	private SwsHttpComponentsMessageSender messageSender;

	public TripSearchService(SwsHttpComponentsMessageSender messageSender, TripSearchHeaderCallback tripSearchHeaderCallback,
			TripSearchInterceptor tripSearchInterceptor, SwsConfiguration swsConfiguration, SessionPool sessionPool) {
		super();
		this.tripSearchHeaderCallback = tripSearchHeaderCallback;
		this.tripSearchInterceptor = tripSearchInterceptor;
		this.swsConfiguration = swsConfiguration;
		this.sessionPool = sessionPool;
		this.messageSender = messageSender;
	}

	public TripSearchRS executeTripSearchService(String pnr) throws Exception {
		String conversationId = UUID.randomUUID().toString();
		TripSearchRS tripSearchRS = null;
		try {
			Security security = sessionPool.getFromPool(conversationId);
			tripSearchHeaderCallback.setSession(security);
			logger.debug("Getting TripSearchRS for pnr {}", pnr);
			tripSearchRS = invokeTripSearchService(pnr);
		} catch (Exception e) {
			//TODO Need to propagate specific exceptions depending on client needs
			logger.error("Error in executeTripSearchService for pnr: {}", pnr, e);
		} finally {
			sessionPool.returnToPool(conversationId, false);
		}
		return tripSearchRS;
	}
	
	private WebServiceTemplate createWebserviceTemplate() throws Exception {
		WebServiceTemplate swsWebServiceTemplate = new WebServiceTemplate();
		//Jaxb2Marshaller is not thread safe. Hence creating instance every time.
		Jaxb2Marshaller marshaller = swsConfiguration.getTripSearchJaxbMarshaller();
		swsWebServiceTemplate.setMarshaller(marshaller);
		swsWebServiceTemplate.setUnmarshaller(marshaller);
		swsWebServiceTemplate.setMessageSender(messageSender);
		return swsWebServiceTemplate;
	}

	private TripSearchRS invokeTripSearchService(String pnr) throws Exception {
		List<ClientInterceptor> interceptors = new ArrayList<>();
		interceptors.add(tripSearchInterceptor);
		WebServiceTemplate swsWebServiceTemplate = createWebserviceTemplate();
		swsWebServiceTemplate.setInterceptors(interceptors.toArray(new ClientInterceptor[0]));
		TripSearchRS tripSearchRS = null;
		try {
			tripSearchRS = (TripSearchRS) swsWebServiceTemplate.marshalSendAndReceive(
					swsConfiguration.getSwsApigeeServiceUrl(), getReservationCreateRequestBody(pnr),
					tripSearchHeaderCallback);
		} catch (WebServiceIOException webserviceException) {
			logger.warn(
					"Invoking executeTripSearchService marshalSendAndReceive with direct sws url as the apigee url returned WebServiceIOException for pnr: {}",
					pnr);
			try {
				tripSearchRS = (TripSearchRS) swsWebServiceTemplate.marshalSendAndReceive(
						swsConfiguration.getSwsDirectServiceUrl(), getReservationCreateRequestBody(pnr),
						tripSearchHeaderCallback);
			} catch (Exception e) {
				logger.error(
						"executeTripSearchService marshalSendAndReceive with direct sws url failed for pnr: {}",
						pnr, e);
			}
		}
		return tripSearchRS;
	}

	private TripSearchRQ getReservationCreateRequestBody(String pnr) {
		TripSearchRQ requestBody = new TripSearchRQ();
		TripSearchRQ.ReadRequests readRequests = new TripSearchRQ.ReadRequests();
		TripSearchRQ.ReadRequests.ReservationReadRequest reservationReadRequest = new TripSearchRQ.ReadRequests.ReservationReadRequest();

		TripSearchRQ.ReadRequests.ReservationReadRequest.LocatorCriteria locatorCriteria = new TripSearchRQ.ReadRequests.ReservationReadRequest.LocatorCriteria();
		TripSearchRQ.ReadRequests.ReservationReadRequest.LocatorCriteria.Locator locator = new TripSearchRQ.ReadRequests.ReservationReadRequest.LocatorCriteria.Locator();
		locator.setId(pnr);
		locatorCriteria.getLocator().add(locator);
		reservationReadRequest.setLocatorCriteria(locatorCriteria);

		TripSearchRQ.ReadRequests.ReservationReadRequest.PosCriteria posCriteria = new TripSearchRQ.ReadRequests.ReservationReadRequest.PosCriteria();
		posCriteria.setAirlineCode("AA");
		reservationReadRequest.setPosCriteria(posCriteria);

		TripSearchRQ.ReadRequests.ReservationReadRequest.ReturnOptions returnOptions = new TripSearchRQ.ReadRequests.ReservationReadRequest.ReturnOptions();
		returnOptions.setViewName("Default");
		returnOptions.setResponseFormat("STL");
		returnOptions.setMaxItemsReturned("10");

		returnOptions.setSearchType(SearchType.BOTH);
		TripSearchRQ.ReadRequests.ReservationReadRequest.ReturnOptions.SubjectAreas subAreas = new TripSearchRQ.ReadRequests.ReservationReadRequest.ReturnOptions.SubjectAreas();

		subAreas.getSubjectArea().add("NAME");
		returnOptions.setSubjectAreas(subAreas);
		reservationReadRequest.setReturnOptions(returnOptions);

		readRequests.setReservationReadRequest(reservationReadRequest);

		requestBody.setVersion("4.3.0");
		requestBody.setReadRequests(readRequests);

		return requestBody;
	}
}
