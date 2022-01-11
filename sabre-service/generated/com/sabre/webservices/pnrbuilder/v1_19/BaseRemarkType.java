//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BaseRemarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRemarkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DivideTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RecordLocator" type="{http://webservices.sabre.com/pnrbuilder/v1_19}RecordLocatorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRemarkType", propOrder = {
    "divideTimestamp",
    "recordLocator"
})
@XmlSeeAlso({
    DividedRemarkType.class,
    SplitToRemarkType.class,
    SplitFromRemarkType.class
})
public abstract class BaseRemarkType {

    @XmlElement(name = "DivideTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar divideTimestamp;
    @XmlElement(name = "RecordLocator")
    protected String recordLocator;

    /**
     * Gets the value of the divideTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDivideTimestamp() {
        return divideTimestamp;
    }

    /**
     * Sets the value of the divideTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDivideTimestamp(XMLGregorianCalendar value) {
        this.divideTimestamp = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordLocator(String value) {
        this.recordLocator = value;
    }

}