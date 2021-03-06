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


/**
 * <p>Java class for ClassOfServiceUpdate.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassOfServiceUpdate.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentNumber" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Numeric1to99"/&gt;
 *         &lt;element name="DepartureCity" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalCity" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ClassOfService" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="instantPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="journeyCarrierType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isAvailabilityBreak" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="cat5RequiresRebook" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassOfServiceUpdate.PNRB", propOrder = {
    "segmentNumber",
    "departureCity",
    "arrivalCity",
    "classOfService"
})
public class ClassOfServiceUpdatePNRB {

    @XmlElement(name = "SegmentNumber")
    @XmlSchemaType(name = "integer")
    protected int segmentNumber;
    @XmlElement(name = "DepartureCity")
    protected String departureCity;
    @XmlElement(name = "ArrivalCity")
    protected String arrivalCity;
    @XmlElement(name = "ClassOfService", required = true)
    protected String classOfService;
    @XmlAttribute(name = "instantPurchase")
    protected Boolean instantPurchase;
    @XmlAttribute(name = "journeyCarrierType")
    protected String journeyCarrierType;
    @XmlAttribute(name = "isAvailabilityBreak")
    protected Boolean isAvailabilityBreak;
    @XmlAttribute(name = "cat5RequiresRebook")
    protected Boolean cat5RequiresRebook;

    /**
     * Gets the value of the segmentNumber property.
     * 
     */
    public int getSegmentNumber() {
        return segmentNumber;
    }

    /**
     * Sets the value of the segmentNumber property.
     * 
     */
    public void setSegmentNumber(int value) {
        this.segmentNumber = value;
    }

    /**
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCity(String value) {
        this.departureCity = value;
    }

    /**
     * Gets the value of the arrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCity() {
        return arrivalCity;
    }

    /**
     * Sets the value of the arrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCity(String value) {
        this.arrivalCity = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the instantPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantPurchase() {
        return instantPurchase;
    }

    /**
     * Sets the value of the instantPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantPurchase(Boolean value) {
        this.instantPurchase = value;
    }

    /**
     * Gets the value of the journeyCarrierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyCarrierType() {
        return journeyCarrierType;
    }

    /**
     * Sets the value of the journeyCarrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyCarrierType(String value) {
        this.journeyCarrierType = value;
    }

    /**
     * Gets the value of the isAvailabilityBreak property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailabilityBreak() {
        return isAvailabilityBreak;
    }

    /**
     * Sets the value of the isAvailabilityBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailabilityBreak(Boolean value) {
        this.isAvailabilityBreak = value;
    }

    /**
     * Gets the value of the cat5RequiresRebook property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat5RequiresRebook() {
        return cat5RequiresRebook;
    }

    /**
     * Sets the value of the cat5RequiresRebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCat5RequiresRebook(Boolean value) {
        this.cat5RequiresRebook = value;
    }

}
