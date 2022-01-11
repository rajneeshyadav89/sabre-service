//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the person traveling. Gender - the gender of the customer,
 *                 if needed. BirthDate - Date of Birth. Currency - the preferred currency in which monetary amounts should
 *                 be returned.
 *             
 * 
 * <p>Java class for AirTravelerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirTravelerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustLoyalty" type="{http://services.sabre.com/res/or/v1_14}CustLoyaltyType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="PassengerTypeQuantity" type="{http://services.sabre.com/res/or/v1_14}PassengerTypeQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="TravelerRefNumber" type="{http://services.sabre.com/res/or/v1_14}TravelerRefNumberType"/&gt;
 *         &lt;element name="FlightSegmentRPHs" type="{http://services.sabre.com/res/or/v1_14}FlightSegmentRPHsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="currencyCode" type="{http://services.sabre.com/res/or/v1_14}AlphaLength3" /&gt;
 *       &lt;attribute name="passengerTypeCode" use="required" type="{http://services.sabre.com/res/or/v1_14}AlphaLength3" /&gt;
 *       &lt;attribute name="accompaniedByInfant" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirTravelerType", propOrder = {
    "custLoyalty",
    "passengerTypeQuantity",
    "travelerRefNumber",
    "flightSegmentRPHs"
})
public class AirTravelerType {

    @XmlElement(name = "CustLoyalty")
    protected List<CustLoyaltyType> custLoyalty;
    @XmlElement(name = "PassengerTypeQuantity")
    protected PassengerTypeQuantityType passengerTypeQuantity;
    @XmlElement(name = "TravelerRefNumber", required = true)
    protected TravelerRefNumberType travelerRefNumber;
    @XmlElement(name = "FlightSegmentRPHs")
    protected FlightSegmentRPHsType flightSegmentRPHs;
    @XmlAttribute(name = "currencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "passengerTypeCode", required = true)
    protected String passengerTypeCode;
    @XmlAttribute(name = "accompaniedByInfant")
    protected Boolean accompaniedByInfant;

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustLoyaltyType }
     * 
     * 
     */
    public List<CustLoyaltyType> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<CustLoyaltyType>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /**
     * Sets the value of the passengerTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public void setPassengerTypeQuantity(PassengerTypeQuantityType value) {
        this.passengerTypeQuantity = value;
    }

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerRefNumberType }
     *     
     */
    public TravelerRefNumberType getTravelerRefNumber() {
        return travelerRefNumber;
    }

    /**
     * Sets the value of the travelerRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerRefNumberType }
     *     
     */
    public void setTravelerRefNumber(TravelerRefNumberType value) {
        this.travelerRefNumber = value;
    }

    /**
     * Gets the value of the flightSegmentRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentRPHsType }
     *     
     */
    public FlightSegmentRPHsType getFlightSegmentRPHs() {
        return flightSegmentRPHs;
    }

    /**
     * Sets the value of the flightSegmentRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentRPHsType }
     *     
     */
    public void setFlightSegmentRPHs(FlightSegmentRPHsType value) {
        this.flightSegmentRPHs = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the accompaniedByInfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccompaniedByInfant() {
        return accompaniedByInfant;
    }

    /**
     * Sets the value of the accompaniedByInfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedByInfant(Boolean value) {
        this.accompaniedByInfant = value;
    }

}
