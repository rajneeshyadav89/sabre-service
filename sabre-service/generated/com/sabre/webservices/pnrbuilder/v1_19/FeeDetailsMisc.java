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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FeeDetails.Misc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDetails.Misc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Base" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Equiv" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TotalTax" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Amount" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" use="required" type="{http://webservices.sabre.com/pnrbuilder/v1_19}StringLength1to3" /&gt;
 *       &lt;attribute name="description" type="{http://webservices.sabre.com/pnrbuilder/v1_19}StringLength1to21" /&gt;
 *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDetails.Misc", propOrder = {
    "base",
    "equiv",
    "totalTax",
    "total",
    "effectiveDate"
})
@XmlSeeAlso({
    FeeDetailsTotal.class
})
public class FeeDetailsMisc {

    @XmlElement(name = "Base")
    protected Amount base;
    @XmlElement(name = "Equiv")
    protected Amount equiv;
    @XmlElement(name = "TotalTax")
    protected Amount totalTax;
    @XmlElement(name = "Total")
    protected Amount total;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "code", required = true)
    protected String code;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "quantity")
    protected Integer quantity;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBase(Amount value) {
        this.base = value;
    }

    /**
     * Gets the value of the equiv property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getEquiv() {
        return equiv;
    }

    /**
     * Sets the value of the equiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setEquiv(Amount value) {
        this.equiv = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotalTax(Amount value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotal(Amount value) {
        this.total = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

}
