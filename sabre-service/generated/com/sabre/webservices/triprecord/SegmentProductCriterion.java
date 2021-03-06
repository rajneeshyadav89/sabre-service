//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.triprecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentProductCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentProductCriterion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTime" type="{http://webservices.sabre.com/triprecord}DateCriterion" minOccurs="0"/&gt;
 *         &lt;element name="EndCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://webservices.sabre.com/triprecord}DateCriterion" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentProductCriterion", propOrder = {
    "startCityCode",
    "startDateTime",
    "endCityCode",
    "endDateTime",
    "statusCode",
    "source",
    "type",
    "vendorCode"
})
public class SegmentProductCriterion {

    @XmlElement(name = "StartCityCode")
    protected String startCityCode;
    @XmlElement(name = "StartDateTime")
    protected DateCriterion startDateTime;
    @XmlElement(name = "EndCityCode")
    protected String endCityCode;
    @XmlElement(name = "EndDateTime")
    protected DateCriterion endDateTime;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "VendorCode")
    protected String vendorCode;

    /**
     * Gets the value of the startCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartCityCode() {
        return startCityCode;
    }

    /**
     * Sets the value of the startCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartCityCode(String value) {
        this.startCityCode = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateCriterion }
     *     
     */
    public DateCriterion getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCriterion }
     *     
     */
    public void setStartDateTime(DateCriterion value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCityCode() {
        return endCityCode;
    }

    /**
     * Sets the value of the endCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCityCode(String value) {
        this.endCityCode = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateCriterion }
     *     
     */
    public DateCriterion getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCriterion }
     *     
     */
    public void setEndDateTime(DateCriterion value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

}
