//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a rate plan in response
 * 
 * <p>Java class for RatePlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlanDescription" type="{http://services.sabre.com/res/or/v1_14}RatePlanDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanInclusions" type="{http://services.sabre.com/res/or/v1_14}RatePlanInclusionsType" minOccurs="0"/&gt;
 *         &lt;element name="MealsIncluded" type="{http://services.sabre.com/res/or/v1_14}MealsIncludedType" minOccurs="0"/&gt;
 *         &lt;element name="RateInfo" type="{http://services.sabre.com/res/or/v1_14}RateInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SupplierRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateAssured" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RateKey" type="{http://services.sabre.com/res/or/v1_14}SabreKeyType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanType", propOrder = {
    "ratePlanDescription",
    "ratePlanInclusions",
    "mealsIncluded",
    "rateInfo"
})
public class RatePlanType {

    @XmlElement(name = "RatePlanDescription")
    protected RatePlanDescriptionType ratePlanDescription;
    @XmlElement(name = "RatePlanInclusions")
    protected RatePlanInclusionsType ratePlanInclusions;
    @XmlElement(name = "MealsIncluded")
    protected MealsIncludedType mealsIncluded;
    @XmlElement(name = "RateInfo")
    protected RateInfoType rateInfo;
    @XmlAttribute(name = "RatePlanName")
    protected String ratePlanName;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "SupplierRatePlanCode")
    protected String supplierRatePlanCode;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "PrepaidIndicator")
    protected Boolean prepaidIndicator;
    @XmlAttribute(name = "RateAssured")
    protected String rateAssured;
    @XmlAttribute(name = "RateKey")
    protected String rateKey;

    /**
     * Gets the value of the ratePlanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanDescriptionType }
     *     
     */
    public RatePlanDescriptionType getRatePlanDescription() {
        return ratePlanDescription;
    }

    /**
     * Sets the value of the ratePlanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanDescriptionType }
     *     
     */
    public void setRatePlanDescription(RatePlanDescriptionType value) {
        this.ratePlanDescription = value;
    }

    /**
     * Gets the value of the ratePlanInclusions property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanInclusionsType }
     *     
     */
    public RatePlanInclusionsType getRatePlanInclusions() {
        return ratePlanInclusions;
    }

    /**
     * Sets the value of the ratePlanInclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanInclusionsType }
     *     
     */
    public void setRatePlanInclusions(RatePlanInclusionsType value) {
        this.ratePlanInclusions = value;
    }

    /**
     * Gets the value of the mealsIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link MealsIncludedType }
     *     
     */
    public MealsIncludedType getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * Sets the value of the mealsIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealsIncludedType }
     *     
     */
    public void setMealsIncluded(MealsIncludedType value) {
        this.mealsIncluded = value;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RateInfoType }
     *     
     */
    public RateInfoType getRateInfo() {
        return rateInfo;
    }

    /**
     * Sets the value of the rateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInfoType }
     *     
     */
    public void setRateInfo(RateInfoType value) {
        this.rateInfo = value;
    }

    /**
     * Gets the value of the ratePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * Sets the value of the ratePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }

    /**
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the supplierRatePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierRatePlanCode() {
        return supplierRatePlanCode;
    }

    /**
     * Sets the value of the supplierRatePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierRatePlanCode(String value) {
        this.supplierRatePlanCode = value;
    }

    /**
     * Gets the value of the ratePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * Sets the value of the ratePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * Gets the value of the prepaidIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * Sets the value of the prepaidIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrepaidIndicator(Boolean value) {
        this.prepaidIndicator = value;
    }

    /**
     * Gets the value of the rateAssured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateAssured() {
        return rateAssured;
    }

    /**
     * Sets the value of the rateAssured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateAssured(String value) {
        this.rateAssured = value;
    }

    /**
     * Gets the value of the rateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateKey() {
        return rateKey;
    }

    /**
     * Sets the value of the rateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateKey(String value) {
        this.rateKey = value;
    }

}
