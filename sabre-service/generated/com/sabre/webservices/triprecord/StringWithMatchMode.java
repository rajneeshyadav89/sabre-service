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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for StringWithMatchMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringWithMatchMode"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://webservices.sabre.com/triprecord&gt;string1to255"&gt;
 *       &lt;attribute name="MatchMode" type="{http://webservices.sabre.com/triprecord}MatchMode" default="EXACT" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringWithMatchMode", propOrder = {
    "value"
})
public class StringWithMatchMode {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "MatchMode")
    protected MatchMode matchMode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the matchMode property.
     * 
     * @return
     *     possible object is
     *     {@link MatchMode }
     *     
     */
    public MatchMode getMatchMode() {
        if (matchMode == null) {
            return MatchMode.EXACT;
        } else {
            return matchMode;
        }
    }

    /**
     * Sets the value of the matchMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchMode }
     *     
     */
    public void setMatchMode(MatchMode value) {
        this.matchMode = value;
    }

}
