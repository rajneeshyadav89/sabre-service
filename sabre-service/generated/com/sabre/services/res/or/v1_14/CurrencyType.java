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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="dual" type="{http://services.sabre.com/res/or/v1_14}AlphaLength3" /&gt;
 *       &lt;attribute name="mOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyType")
public class CurrencyType {

    @XmlAttribute(name = "dual")
    protected String dual;
    @XmlAttribute(name = "mOverride")
    protected Boolean mOverride;

    /**
     * Gets the value of the dual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDual() {
        return dual;
    }

    /**
     * Sets the value of the dual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDual(String value) {
        this.dual = value;
    }

    /**
     * Gets the value of the mOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMOverride() {
        return mOverride;
    }

    /**
     * Sets the value of the mOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMOverride(Boolean value) {
        this.mOverride = value;
    }

}
