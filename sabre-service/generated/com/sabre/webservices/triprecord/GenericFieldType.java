//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.triprecord;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FirstName"/&gt;
 *     &lt;enumeration value="LastName"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="ProfileID"/&gt;
 *     &lt;enumeration value="ProfileDomain"/&gt;
 *     &lt;enumeration value="ReservationID"/&gt;
 *     &lt;enumeration value="ReservationDomain"/&gt;
 *     &lt;enumeration value="FlightNumber"/&gt;
 *     &lt;enumeration value="DepartureDate"/&gt;
 *     &lt;enumeration value="ArrivalDate"/&gt;
 *     &lt;enumeration value="DepartureAirport"/&gt;
 *     &lt;enumeration value="ArrivalAirport"/&gt;
 *     &lt;enumeration value="MarketingAirline"/&gt;
 *     &lt;enumeration value="OperatingAirline"/&gt;
 *     &lt;enumeration value="LoyaltyID"/&gt;
 *     &lt;enumeration value="LoyaltyDomain"/&gt;
 *     &lt;enumeration value="PhoneAreaCityCode"/&gt;
 *     &lt;enumeration value="PhoneNumber"/&gt;
 *     &lt;enumeration value="TripName"/&gt;
 *     &lt;enumeration value="ComponentFirstName"/&gt;
 *     &lt;enumeration value="ComponentLastName"/&gt;
 *     &lt;enumeration value="ComponentLoyaltyID"/&gt;
 *     &lt;enumeration value="ComponentLoyaltyDomain"/&gt;
 *     &lt;enumeration value="ComponentPhoneAreaCityCode"/&gt;
 *     &lt;enumeration value="ComponentPhoneNumber"/&gt;
 *     &lt;enumeration value="ComponentEmail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenericFieldType")
@XmlEnum
public enum GenericFieldType {

    @XmlEnumValue("FirstName")
    FIRST_NAME("FirstName"),
    @XmlEnumValue("LastName")
    LAST_NAME("LastName"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("ProfileID")
    PROFILE_ID("ProfileID"),
    @XmlEnumValue("ProfileDomain")
    PROFILE_DOMAIN("ProfileDomain"),
    @XmlEnumValue("ReservationID")
    RESERVATION_ID("ReservationID"),
    @XmlEnumValue("ReservationDomain")
    RESERVATION_DOMAIN("ReservationDomain"),
    @XmlEnumValue("FlightNumber")
    FLIGHT_NUMBER("FlightNumber"),
    @XmlEnumValue("DepartureDate")
    DEPARTURE_DATE("DepartureDate"),
    @XmlEnumValue("ArrivalDate")
    ARRIVAL_DATE("ArrivalDate"),
    @XmlEnumValue("DepartureAirport")
    DEPARTURE_AIRPORT("DepartureAirport"),
    @XmlEnumValue("ArrivalAirport")
    ARRIVAL_AIRPORT("ArrivalAirport"),
    @XmlEnumValue("MarketingAirline")
    MARKETING_AIRLINE("MarketingAirline"),
    @XmlEnumValue("OperatingAirline")
    OPERATING_AIRLINE("OperatingAirline"),
    @XmlEnumValue("LoyaltyID")
    LOYALTY_ID("LoyaltyID"),
    @XmlEnumValue("LoyaltyDomain")
    LOYALTY_DOMAIN("LoyaltyDomain"),
    @XmlEnumValue("PhoneAreaCityCode")
    PHONE_AREA_CITY_CODE("PhoneAreaCityCode"),
    @XmlEnumValue("PhoneNumber")
    PHONE_NUMBER("PhoneNumber"),
    @XmlEnumValue("TripName")
    TRIP_NAME("TripName"),
    @XmlEnumValue("ComponentFirstName")
    COMPONENT_FIRST_NAME("ComponentFirstName"),
    @XmlEnumValue("ComponentLastName")
    COMPONENT_LAST_NAME("ComponentLastName"),
    @XmlEnumValue("ComponentLoyaltyID")
    COMPONENT_LOYALTY_ID("ComponentLoyaltyID"),
    @XmlEnumValue("ComponentLoyaltyDomain")
    COMPONENT_LOYALTY_DOMAIN("ComponentLoyaltyDomain"),
    @XmlEnumValue("ComponentPhoneAreaCityCode")
    COMPONENT_PHONE_AREA_CITY_CODE("ComponentPhoneAreaCityCode"),
    @XmlEnumValue("ComponentPhoneNumber")
    COMPONENT_PHONE_NUMBER("ComponentPhoneNumber"),
    @XmlEnumValue("ComponentEmail")
    COMPONENT_EMAIL("ComponentEmail");
    private final String value;

    GenericFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenericFieldType fromValue(String v) {
        for (GenericFieldType c: GenericFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
