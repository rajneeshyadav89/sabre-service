//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceQuoteOptions.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceQuoteOptions.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://webservices.sabre.com/pnrbuilder/v1_19}PriceQuoteStatus.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://webservices.sabre.com/pnrbuilder/v1_19}PriceQuoteType.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="CustomDetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResultType" type="{http://webservices.sabre.com/pnrbuilder/v1_19}PriceQuoteResultType.PNRB" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PqNumber" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="TravelItinerary" type="{http://webservices.sabre.com/pnrbuilder/v1_19}PriceQuoteTravelItinerary.PNRB" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceQuoteOptions.PNRB", propOrder = {
    "status",
    "type",
    "customDetails",
    "resultType",
    "pqNumber",
    "travelItinerary"
})
public class PriceQuoteOptionsPNRB {

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected PriceQuoteStatusPNRB status;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected PriceQuoteTypePNRB type;
    @XmlElement(name = "CustomDetails")
    protected List<String> customDetails;
    @XmlElement(name = "ResultType")
    @XmlSchemaType(name = "string")
    protected PriceQuoteResultTypePNRB resultType;
    @XmlElement(name = "PqNumber")
    protected List<BigInteger> pqNumber;
    @XmlElement(name = "TravelItinerary")
    protected PriceQuoteTravelItineraryPNRB travelItinerary;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteStatusPNRB }
     *     
     */
    public PriceQuoteStatusPNRB getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteStatusPNRB }
     *     
     */
    public void setStatus(PriceQuoteStatusPNRB value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteTypePNRB }
     *     
     */
    public PriceQuoteTypePNRB getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteTypePNRB }
     *     
     */
    public void setType(PriceQuoteTypePNRB value) {
        this.type = value;
    }

    /**
     * Gets the value of the customDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomDetails() {
        if (customDetails == null) {
            customDetails = new ArrayList<String>();
        }
        return this.customDetails;
    }

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteResultTypePNRB }
     *     
     */
    public PriceQuoteResultTypePNRB getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteResultTypePNRB }
     *     
     */
    public void setResultType(PriceQuoteResultTypePNRB value) {
        this.resultType = value;
    }

    /**
     * Gets the value of the pqNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pqNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPqNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getPqNumber() {
        if (pqNumber == null) {
            pqNumber = new ArrayList<BigInteger>();
        }
        return this.pqNumber;
    }

    /**
     * Gets the value of the travelItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteTravelItineraryPNRB }
     *     
     */
    public PriceQuoteTravelItineraryPNRB getTravelItinerary() {
        return travelItinerary;
    }

    /**
     * Sets the value of the travelItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteTravelItineraryPNRB }
     *     
     */
    public void setTravelItinerary(PriceQuoteTravelItineraryPNRB value) {
        this.travelItinerary = value;
    }

}
