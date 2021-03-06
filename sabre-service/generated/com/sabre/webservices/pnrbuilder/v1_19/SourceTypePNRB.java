//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information on the source of a request. This is from the OTA xsd.
 *             
 * 
 * <p>Java class for SourceType.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceType.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestorID" type="{http://webservices.sabre.com/pnrbuilder/v1_19}RequestorID.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="BookingChannel" type="{http://webservices.sabre.com/pnrbuilder/v1_19}BookingChannel.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="TTYRecordLocator" type="{http://webservices.sabre.com/pnrbuilder/v1_19}TTYRecordLocatorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OAC" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OACType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BookingSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AgentSine" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ISOCountry" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CountryCode" /&gt;
 *       &lt;attribute name="ISOCurrency" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" /&gt;
 *       &lt;attribute name="AgentDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AirlineVendorID" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AirlineCode" /&gt;
 *       &lt;attribute name="AirportCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AirportCode" /&gt;
 *       &lt;attribute name="FirstDepartPoint" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TerminalID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HomePseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PrimeHostID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType.PNRB", propOrder = {
    "requestorID",
    "bookingChannel",
    "ttyRecordLocator",
    "oac"
})
public class SourceTypePNRB {

    @XmlElement(name = "RequestorID")
    protected RequestorIDPNRB requestorID;
    @XmlElement(name = "BookingChannel")
    protected BookingChannelPNRB bookingChannel;
    @XmlElement(name = "TTYRecordLocator")
    protected List<TTYRecordLocatorType> ttyRecordLocator;
    @XmlElement(name = "OAC")
    protected OACType oac;
    @XmlAttribute(name = "BookingSource")
    protected String bookingSource;
    @XmlAttribute(name = "AgentSine")
    protected String agentSine;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "ISOCountry")
    protected String isoCountry;
    @XmlAttribute(name = "ISOCurrency")
    protected String isoCurrency;
    @XmlAttribute(name = "AgentDutyCode")
    protected String agentDutyCode;
    @XmlAttribute(name = "AirlineVendorID")
    protected String airlineVendorID;
    @XmlAttribute(name = "AirportCode")
    protected String airportCode;
    @XmlAttribute(name = "FirstDepartPoint")
    protected String firstDepartPoint;
    @XmlAttribute(name = "SourceSystem")
    protected String sourceSystem;
    @XmlAttribute(name = "TerminalID")
    protected String terminalID;
    @XmlAttribute(name = "HomePseudoCityCode")
    protected String homePseudoCityCode;
    @XmlAttribute(name = "PrimeHostID")
    protected String primeHostID;

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorIDPNRB }
     *     
     */
    public RequestorIDPNRB getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorIDPNRB }
     *     
     */
    public void setRequestorID(RequestorIDPNRB value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link BookingChannelPNRB }
     *     
     */
    public BookingChannelPNRB getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelPNRB }
     *     
     */
    public void setBookingChannel(BookingChannelPNRB value) {
        this.bookingChannel = value;
    }

    /**
     * Gets the value of the ttyRecordLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttyRecordLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTTYRecordLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTYRecordLocatorType }
     * 
     * 
     */
    public List<TTYRecordLocatorType> getTTYRecordLocator() {
        if (ttyRecordLocator == null) {
            ttyRecordLocator = new ArrayList<TTYRecordLocatorType>();
        }
        return this.ttyRecordLocator;
    }

    /**
     * Gets the value of the oac property.
     * 
     * @return
     *     possible object is
     *     {@link OACType }
     *     
     */
    public OACType getOAC() {
        return oac;
    }

    /**
     * Sets the value of the oac property.
     * 
     * @param value
     *     allowed object is
     *     {@link OACType }
     *     
     */
    public void setOAC(OACType value) {
        this.oac = value;
    }

    /**
     * Gets the value of the bookingSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingSource(String value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the agentSine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSine() {
        return agentSine;
    }

    /**
     * Sets the value of the agentSine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSine(String value) {
        this.agentSine = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the isoCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountry() {
        return isoCountry;
    }

    /**
     * Sets the value of the isoCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountry(String value) {
        this.isoCountry = value;
    }

    /**
     * Gets the value of the isoCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCurrency() {
        return isoCurrency;
    }

    /**
     * Sets the value of the isoCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCurrency(String value) {
        this.isoCurrency = value;
    }

    /**
     * Gets the value of the agentDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    /**
     * Sets the value of the agentDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDutyCode(String value) {
        this.agentDutyCode = value;
    }

    /**
     * Gets the value of the airlineVendorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineVendorID() {
        return airlineVendorID;
    }

    /**
     * Sets the value of the airlineVendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineVendorID(String value) {
        this.airlineVendorID = value;
    }

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * Gets the value of the firstDepartPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDepartPoint() {
        return firstDepartPoint;
    }

    /**
     * Sets the value of the firstDepartPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDepartPoint(String value) {
        this.firstDepartPoint = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the homePseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePseudoCityCode() {
        return homePseudoCityCode;
    }

    /**
     * Sets the value of the homePseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePseudoCityCode(String value) {
        this.homePseudoCityCode = value;
    }

    /**
     * Gets the value of the primeHostID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeHostID() {
        return primeHostID;
    }

    /**
     * Sets the value of the primeHostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeHostID(String value) {
        this.primeHostID = value;
    }

}
