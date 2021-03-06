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
 * Basic Property Information
 * 
 * <p>Java class for HotelInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TierLabels" type="{http://services.sabre.com/res/or/v1_14}TierLabels" minOccurs="0"/&gt;
 *         &lt;element name="LocationInfo" type="{http://services.sabre.com/res/or/v1_14}LocationInfo" minOccurs="0"/&gt;
 *         &lt;element name="Amenities" type="{http://services.sabre.com/res/or/v1_14}Amenities" minOccurs="0"/&gt;
 *         &lt;element name="PropertyTypeInfo" type="{http://services.sabre.com/res/or/v1_14}PropertyTypeInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HotelCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeContext"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="SABRE"/&gt;
 *             &lt;enumeration value="GLOBAL"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="GlobalChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SabreRating" type="{http://services.sabre.com/res/or/v1_14}RatingType" /&gt;
 *       &lt;attribute name="CurrencyCode" type="{http://services.sabre.com/res/or/v1_14}LodgingCurrencyCodeType" /&gt;
 *       &lt;attribute name="ChainName" type="{http://services.sabre.com/res/or/v1_14}StringLength0to500" /&gt;
 *       &lt;attribute name="BrandName" type="{http://services.sabre.com/res/or/v1_14}StringLength0to500" /&gt;
 *       &lt;attribute name="SupplierChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SourceHotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfoType", propOrder = {
    "tierLabels",
    "locationInfo",
    "amenities",
    "propertyTypeInfo"
})
public class HotelInfoType {

    @XmlElement(name = "TierLabels")
    protected TierLabels tierLabels;
    @XmlElement(name = "LocationInfo")
    protected LocationInfo locationInfo;
    @XmlElement(name = "Amenities")
    protected Amenities amenities;
    @XmlElement(name = "PropertyTypeInfo")
    protected PropertyTypeInfo propertyTypeInfo;
    @XmlAttribute(name = "HotelCode", required = true)
    protected String hotelCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "GlobalChainCode")
    protected String globalChainCode;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "SabreRating")
    protected String sabreRating;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandName")
    protected String brandName;
    @XmlAttribute(name = "SupplierChainCode")
    protected String supplierChainCode;
    @XmlAttribute(name = "SourceHotelCode")
    protected String sourceHotelCode;
    @XmlAttribute(name = "Ordinal")
    protected Integer ordinal;

    /**
     * Gets the value of the tierLabels property.
     * 
     * @return
     *     possible object is
     *     {@link TierLabels }
     *     
     */
    public TierLabels getTierLabels() {
        return tierLabels;
    }

    /**
     * Sets the value of the tierLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierLabels }
     *     
     */
    public void setTierLabels(TierLabels value) {
        this.tierLabels = value;
    }

    /**
     * Gets the value of the locationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfo }
     *     
     */
    public LocationInfo getLocationInfo() {
        return locationInfo;
    }

    /**
     * Sets the value of the locationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfo }
     *     
     */
    public void setLocationInfo(LocationInfo value) {
        this.locationInfo = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link Amenities }
     *     
     */
    public Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amenities }
     *     
     */
    public void setAmenities(Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the propertyTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyTypeInfo }
     *     
     */
    public PropertyTypeInfo getPropertyTypeInfo() {
        return propertyTypeInfo;
    }

    /**
     * Sets the value of the propertyTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyTypeInfo }
     *     
     */
    public void setPropertyTypeInfo(PropertyTypeInfo value) {
        this.propertyTypeInfo = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * Gets the value of the globalChainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalChainCode() {
        return globalChainCode;
    }

    /**
     * Sets the value of the globalChainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalChainCode(String value) {
        this.globalChainCode = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the sabreRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSabreRating() {
        return sabreRating;
    }

    /**
     * Sets the value of the sabreRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSabreRating(String value) {
        this.sabreRating = value;
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
     * Gets the value of the chainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * Sets the value of the chainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the supplierChainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierChainCode() {
        return supplierChainCode;
    }

    /**
     * Sets the value of the supplierChainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierChainCode(String value) {
        this.supplierChainCode = value;
    }

    /**
     * Gets the value of the sourceHotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceHotelCode() {
        return sourceHotelCode;
    }

    /**
     * Sets the value of the sourceHotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceHotelCode(String value) {
        this.sourceHotelCode = value;
    }

    /**
     * Gets the value of the ordinal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdinal(Integer value) {
        this.ordinal = value;
    }

}
