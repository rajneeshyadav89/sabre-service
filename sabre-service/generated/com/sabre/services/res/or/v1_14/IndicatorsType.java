//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndicatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetainFare" type="{http://services.sabre.com/res/or/v1_14}IndRequiredType" minOccurs="0"/&gt;
 *         &lt;element name="MinMaxStay" type="{http://services.sabre.com/res/or/v1_14}IndRequiredType" minOccurs="0"/&gt;
 *         &lt;element name="RefundPenalty" type="{http://services.sabre.com/res/or/v1_14}IndRequiredType" minOccurs="0"/&gt;
 *         &lt;element name="ResTicketing" type="{http://services.sabre.com/res/or/v1_14}IndRequiredType" minOccurs="0"/&gt;
 *         &lt;element name="TravelPolicy" type="{http://services.sabre.com/res/or/v1_14}IndRequiredType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorsType", propOrder = {
    "retainFare",
    "minMaxStay",
    "refundPenalty",
    "resTicketing",
    "travelPolicy"
})
public class IndicatorsType {

    @XmlElement(name = "RetainFare")
    protected IndRequiredType retainFare;
    @XmlElement(name = "MinMaxStay")
    protected IndRequiredType minMaxStay;
    @XmlElement(name = "RefundPenalty")
    protected IndRequiredType refundPenalty;
    @XmlElement(name = "ResTicketing")
    protected IndRequiredType resTicketing;
    @XmlElement(name = "TravelPolicy")
    protected IndRequiredType travelPolicy;

    /**
     * Gets the value of the retainFare property.
     * 
     * @return
     *     possible object is
     *     {@link IndRequiredType }
     *     
     */
    public IndRequiredType getRetainFare() {
        return retainFare;
    }

    /**
     * Sets the value of the retainFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndRequiredType }
     *     
     */
    public void setRetainFare(IndRequiredType value) {
        this.retainFare = value;
    }

    /**
     * Gets the value of the minMaxStay property.
     * 
     * @return
     *     possible object is
     *     {@link IndRequiredType }
     *     
     */
    public IndRequiredType getMinMaxStay() {
        return minMaxStay;
    }

    /**
     * Sets the value of the minMaxStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndRequiredType }
     *     
     */
    public void setMinMaxStay(IndRequiredType value) {
        this.minMaxStay = value;
    }

    /**
     * Gets the value of the refundPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link IndRequiredType }
     *     
     */
    public IndRequiredType getRefundPenalty() {
        return refundPenalty;
    }

    /**
     * Sets the value of the refundPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndRequiredType }
     *     
     */
    public void setRefundPenalty(IndRequiredType value) {
        this.refundPenalty = value;
    }

    /**
     * Gets the value of the resTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link IndRequiredType }
     *     
     */
    public IndRequiredType getResTicketing() {
        return resTicketing;
    }

    /**
     * Sets the value of the resTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndRequiredType }
     *     
     */
    public void setResTicketing(IndRequiredType value) {
        this.resTicketing = value;
    }

    /**
     * Gets the value of the travelPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link IndRequiredType }
     *     
     */
    public IndRequiredType getTravelPolicy() {
        return travelPolicy;
    }

    /**
     * Sets the value of the travelPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndRequiredType }
     *     
     */
    public void setTravelPolicy(IndRequiredType value) {
        this.travelPolicy = value;
    }

}
