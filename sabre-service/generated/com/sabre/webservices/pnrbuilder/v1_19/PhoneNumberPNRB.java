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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * each phone field can have up to 62 chars
 * 
 *                 The
 *                 formats for phone numbers are:
 * 
 *                 * add phone contact
 * 
 *                 9(area code)(phone
 *                 number)-(code)
 *                 9212-123-1234-A
 * 
 *                 * insert phone field as a specific line
 * 
 *                 9(line # to insert at)/(area
 *                 code)-(prefix)-(number)-(phone location)
 * 
 *                 * insert phone field and
 *                 make it the first number in the
 *                 field
 * 
 *                 90/(area
 *                 code)-(prefix)-(number)-(phone location)
 *                 90/202-675-6543-A
 * 
 *                 *
 *                 add phone
 *                 contact and include city code that is
 *                 outside of your area
 * 
 *                 9/(city
 *                 code)(area code)(phone number)-(code)
 *                 9/BOS616-123-1234-A
 * 
 *                 *
 *                 change
 *                 phone field to new number
 * 
 *                 9(line #)¤(area
 *                 code)-(prefix)-(number)-(phone location)
 *                 92¤415-991-0220-A
 * 
 *                 * change
 *                 city code in phone field
 * 
 *                 9(line #)¤(new city code) 92¤LON
 * 
 *                 * delete
 *                 specific line number in the phone field
 * 
 *                 9(line #)¤ 92¤
 * 
 *                 * delete a
 *                 range of phone fields
 * 
 *                 9(first line # in range)-(last line # in
 *                 range)¤ 92-3¤
 *             
 * 
 * <p>Java class for PhoneNumber.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneNumber.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Location" type="{http://webservices.sabre.com/pnrbuilder/v1_19}PhoneLocationType.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="TJRCityCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="CityCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
 *       &lt;attribute name="op" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OperationType.PNRB" /&gt;
 *       &lt;attribute name="index" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Numeric0to99999" /&gt;
 *       &lt;attribute name="elementId" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AssociationMatrixID.PNRB" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneNumber.PNRB", propOrder = {
    "location",
    "tjrCityCode",
    "cityCode",
    "extension",
    "number"
})
@XmlSeeAlso({
    PhoneHistoryType.class
})
public class PhoneNumberPNRB {

    @XmlElement(name = "Location")
    @XmlSchemaType(name = "string")
    protected PhoneLocationTypePNRB location;
    @XmlElement(name = "TJRCityCode")
    protected String tjrCityCode;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Number")
    protected String number;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "op")
    protected OperationTypePNRB op;
    @XmlAttribute(name = "index")
    protected Integer index;
    @XmlAttribute(name = "elementId")
    protected String elementId;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneLocationTypePNRB }
     *     
     */
    public PhoneLocationTypePNRB getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneLocationTypePNRB }
     *     
     */
    public void setLocation(PhoneLocationTypePNRB value) {
        this.location = value;
    }

    /**
     * Gets the value of the tjrCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTJRCityCode() {
        return tjrCityCode;
    }

    /**
     * Sets the value of the tjrCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTJRCityCode(String value) {
        this.tjrCityCode = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementId(String value) {
        this.elementId = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
