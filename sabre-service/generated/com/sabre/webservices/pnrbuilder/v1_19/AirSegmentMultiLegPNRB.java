//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AirSegmentMultiLeg.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSegmentMultiLeg.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineDesignator" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AirlineCode" minOccurs="0"/&gt;
 *         &lt;element name="AircraftTypeCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalDate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="MealCode1" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="MealCode2" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="MealCode3" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekIndicator" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeek" type="{http://webservices.sabre.com/pnrbuilder/v1_19}DayOfWeek" minOccurs="0"/&gt;
 *         &lt;element name="ElapsedTime" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="AirMilesFlown" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="SmokingPrefOfferedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OperatingAirlineDesignator" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AirlineCode" minOccurs="0"/&gt;
 *         &lt;element name="AirlineName" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="SegmentSpecialRequests" type="{http://webservices.sabre.com/pnrbuilder/v1_19}ItinerarySpecialRequests.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="PreReservedSeats" type="{http://webservices.sabre.com/pnrbuilder/v1_19}PreReservedSeats.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="FrequentFlyer" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Loyalty.PNRB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="segmentNumber" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Numeric0to99999" /&gt;
 *       &lt;attribute name="id" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
 *       &lt;attribute name="op" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OperationType.PNRB" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSegmentMultiLeg.PNRB", propOrder = {
    "airlineDesignator",
    "aircraftTypeCode",
    "departureDate",
    "departureTime",
    "arrivalDate",
    "arrivalTime",
    "mealCode1",
    "mealCode2",
    "mealCode3",
    "dayOfWeekIndicator",
    "dayOfWeek",
    "elapsedTime",
    "airMilesFlown",
    "smokingPrefOfferedIndicator",
    "operatingAirlineDesignator",
    "airlineName",
    "segmentSpecialRequests",
    "preReservedSeats",
    "frequentFlyer"
})
public class AirSegmentMultiLegPNRB {

    @XmlElement(name = "AirlineDesignator")
    protected String airlineDesignator;
    @XmlElement(name = "AircraftTypeCode")
    protected String aircraftTypeCode;
    @XmlElement(name = "DepartureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "DepartureTime")
    protected String departureTime;
    @XmlElement(name = "ArrivalDate")
    protected String arrivalDate;
    @XmlElement(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlElement(name = "MealCode1")
    protected String mealCode1;
    @XmlElement(name = "MealCode2")
    protected String mealCode2;
    @XmlElement(name = "MealCode3")
    protected String mealCode3;
    @XmlElement(name = "DayOfWeekIndicator")
    protected String dayOfWeekIndicator;
    @XmlElement(name = "DayOfWeek")
    @XmlSchemaType(name = "NMTOKEN")
    protected DayOfWeek dayOfWeek;
    @XmlElement(name = "ElapsedTime")
    protected String elapsedTime;
    @XmlElement(name = "AirMilesFlown")
    protected String airMilesFlown;
    @XmlElement(name = "SmokingPrefOfferedIndicator")
    protected Boolean smokingPrefOfferedIndicator;
    @XmlElement(name = "OperatingAirlineDesignator")
    protected String operatingAirlineDesignator;
    @XmlElement(name = "AirlineName")
    protected String airlineName;
    @XmlElement(name = "SegmentSpecialRequests")
    protected ItinerarySpecialRequestsPNRB segmentSpecialRequests;
    @XmlElement(name = "PreReservedSeats")
    protected PreReservedSeatsPNRB preReservedSeats;
    @XmlElement(name = "FrequentFlyer")
    protected LoyaltyPNRB frequentFlyer;
    @XmlAttribute(name = "segmentNumber")
    protected Integer segmentNumber;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "op")
    protected OperationTypePNRB op;

    /**
     * Gets the value of the airlineDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesignator() {
        return airlineDesignator;
    }

    /**
     * Sets the value of the airlineDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesignator(String value) {
        this.airlineDesignator = value;
    }

    /**
     * Gets the value of the aircraftTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftTypeCode() {
        return aircraftTypeCode;
    }

    /**
     * Sets the value of the aircraftTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftTypeCode(String value) {
        this.aircraftTypeCode = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the mealCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealCode1() {
        return mealCode1;
    }

    /**
     * Sets the value of the mealCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealCode1(String value) {
        this.mealCode1 = value;
    }

    /**
     * Gets the value of the mealCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealCode2() {
        return mealCode2;
    }

    /**
     * Sets the value of the mealCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealCode2(String value) {
        this.mealCode2 = value;
    }

    /**
     * Gets the value of the mealCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealCode3() {
        return mealCode3;
    }

    /**
     * Sets the value of the mealCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealCode3(String value) {
        this.mealCode3 = value;
    }

    /**
     * Gets the value of the dayOfWeekIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfWeekIndicator() {
        return dayOfWeekIndicator;
    }

    /**
     * Sets the value of the dayOfWeekIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfWeekIndicator(String value) {
        this.dayOfWeekIndicator = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setDayOfWeek(DayOfWeek value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElapsedTime(String value) {
        this.elapsedTime = value;
    }

    /**
     * Gets the value of the airMilesFlown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirMilesFlown() {
        return airMilesFlown;
    }

    /**
     * Sets the value of the airMilesFlown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirMilesFlown(String value) {
        this.airMilesFlown = value;
    }

    /**
     * Gets the value of the smokingPrefOfferedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingPrefOfferedIndicator() {
        return smokingPrefOfferedIndicator;
    }

    /**
     * Sets the value of the smokingPrefOfferedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingPrefOfferedIndicator(Boolean value) {
        this.smokingPrefOfferedIndicator = value;
    }

    /**
     * Gets the value of the operatingAirlineDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingAirlineDesignator() {
        return operatingAirlineDesignator;
    }

    /**
     * Sets the value of the operatingAirlineDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingAirlineDesignator(String value) {
        this.operatingAirlineDesignator = value;
    }

    /**
     * Gets the value of the airlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Sets the value of the airlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineName(String value) {
        this.airlineName = value;
    }

    /**
     * Gets the value of the segmentSpecialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ItinerarySpecialRequestsPNRB }
     *     
     */
    public ItinerarySpecialRequestsPNRB getSegmentSpecialRequests() {
        return segmentSpecialRequests;
    }

    /**
     * Sets the value of the segmentSpecialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinerarySpecialRequestsPNRB }
     *     
     */
    public void setSegmentSpecialRequests(ItinerarySpecialRequestsPNRB value) {
        this.segmentSpecialRequests = value;
    }

    /**
     * Gets the value of the preReservedSeats property.
     * 
     * @return
     *     possible object is
     *     {@link PreReservedSeatsPNRB }
     *     
     */
    public PreReservedSeatsPNRB getPreReservedSeats() {
        return preReservedSeats;
    }

    /**
     * Sets the value of the preReservedSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreReservedSeatsPNRB }
     *     
     */
    public void setPreReservedSeats(PreReservedSeatsPNRB value) {
        this.preReservedSeats = value;
    }

    /**
     * Gets the value of the frequentFlyer property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyPNRB }
     *     
     */
    public LoyaltyPNRB getFrequentFlyer() {
        return frequentFlyer;
    }

    /**
     * Sets the value of the frequentFlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyPNRB }
     *     
     */
    public void setFrequentFlyer(LoyaltyPNRB value) {
        this.frequentFlyer = value;
    }

    /**
     * Gets the value of the segmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentNumber() {
        return segmentNumber;
    }

    /**
     * Sets the value of the segmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentNumber(Integer value) {
        this.segmentNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTypePNRB }
     *     
     */
    public OperationTypePNRB getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTypePNRB }
     *     
     */
    public void setOp(OperationTypePNRB value) {
        this.op = value;
    }

}