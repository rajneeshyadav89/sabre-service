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
import javax.xml.bind.annotation.XmlType;


/**
 * Availability seat count for specific class code
 * 
 * <p>Java class for RdbAvailableSeatCountType.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RdbAvailableSeatCountType.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AvailableSeatCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RdbAvailableSeatCountType.PNRB", propOrder = {
    "classCode",
    "availableSeatCount"
})
public class RdbAvailableSeatCountTypePNRB {

    @XmlElement(name = "ClassCode", required = true)
    protected String classCode;
    @XmlElement(name = "AvailableSeatCount", required = true)
    protected String availableSeatCount;

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the availableSeatCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableSeatCount() {
        return availableSeatCount;
    }

    /**
     * Sets the value of the availableSeatCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableSeatCount(String value) {
        this.availableSeatCount = value;
    }

}