//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.triprecord;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides address
 * 				information.
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressLine" type="{http://webservices.sabre.com/triprecord}string1to60" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://webservices.sabre.com/triprecord}string1to60" minOccurs="0"/&gt;
 *         &lt;element name="PostalCd" type="{http://webservices.sabre.com/triprecord}string1to16" minOccurs="0"/&gt;
 *         &lt;element name="StateCode" type="{http://webservices.sabre.com/triprecord}string1to8" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://webservices.sabre.com/triprecord}string2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://webservices.sabre.com/triprecord}UpdateAttributes"/&gt;
 *       &lt;attribute name="LocationTypeCode" type="{http://webservices.sabre.com/triprecord}string1to3" /&gt;
 *       &lt;attribute name="AddressUsageTypeCode" type="{http://webservices.sabre.com/triprecord}string1to3" /&gt;
 *       &lt;attribute name="Attention" type="{http://webservices.sabre.com/triprecord}string1to40" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressLine",
    "cityName",
    "postalCd",
    "stateCode",
    "countryCode"
})
public class AddressType {

    @XmlElement(name = "AddressLine")
    protected List<String> addressLine;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "PostalCd")
    protected String postalCd;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "LocationTypeCode")
    protected String locationTypeCode;
    @XmlAttribute(name = "AddressUsageTypeCode")
    protected String addressUsageTypeCode;
    @XmlAttribute(name = "Attention")
    protected String attention;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "Action")
    protected UpdateActions action;

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<String>();
        }
        return this.addressLine;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the postalCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCd() {
        return postalCd;
    }

    /**
     * Sets the value of the postalCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCd(String value) {
        this.postalCd = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the locationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTypeCode() {
        return locationTypeCode;
    }

    /**
     * Sets the value of the locationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTypeCode(String value) {
        this.locationTypeCode = value;
    }

    /**
     * Gets the value of the addressUsageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressUsageTypeCode() {
        return addressUsageTypeCode;
    }

    /**
     * Sets the value of the addressUsageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressUsageTypeCode(String value) {
        this.addressUsageTypeCode = value;
    }

    /**
     * Gets the value of the attention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttention() {
        return attention;
    }

    /**
     * Sets the value of the attention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttention(String value) {
        this.attention = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateActions }
     *     
     */
    public UpdateActions getAction() {
        if (action == null) {
            return UpdateActions.NONE;
        } else {
            return action;
        }
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateActions }
     *     
     */
    public void setAction(UpdateActions value) {
        this.action = value;
    }

}
