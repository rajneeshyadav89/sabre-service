//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.triprecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO2Value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CO2Value"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PerSegment" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="PerParty" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="PerPassenger" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="DistanceInMiles" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CO2Value")
public class CO2Value {

    @XmlAttribute(name = "PerSegment")
    protected Long perSegment;
    @XmlAttribute(name = "PerParty")
    protected Long perParty;
    @XmlAttribute(name = "PerPassenger")
    protected Long perPassenger;
    @XmlAttribute(name = "DistanceInMiles")
    protected Integer distanceInMiles;

    /**
     * Gets the value of the perSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPerSegment() {
        return perSegment;
    }

    /**
     * Sets the value of the perSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPerSegment(Long value) {
        this.perSegment = value;
    }

    /**
     * Gets the value of the perParty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPerParty() {
        return perParty;
    }

    /**
     * Sets the value of the perParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPerParty(Long value) {
        this.perParty = value;
    }

    /**
     * Gets the value of the perPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPerPassenger() {
        return perPassenger;
    }

    /**
     * Sets the value of the perPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPerPassenger(Long value) {
        this.perPassenger = value;
    }

    /**
     * Gets the value of the distanceInMiles property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanceInMiles() {
        return distanceInMiles;
    }

    /**
     * Sets the value of the distanceInMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanceInMiles(Integer value) {
        this.distanceInMiles = value;
    }

}
