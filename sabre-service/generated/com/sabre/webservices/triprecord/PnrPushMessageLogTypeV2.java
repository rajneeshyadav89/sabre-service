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
 * <p>Java class for PnrPushMessageLogTypeV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrPushMessageLogTypeV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservices.sabre.com/triprecord}PnrPushMessageLogType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncrementalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrPushMessageLogTypeV2", propOrder = {
    "incrementalIndicator",
    "messageSource"
})
public class PnrPushMessageLogTypeV2
    extends PnrPushMessageLogType
{

    @XmlElement(name = "IncrementalIndicator")
    protected String incrementalIndicator;
    @XmlElement(name = "MessageSource")
    protected String messageSource;

    /**
     * Gets the value of the incrementalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementalIndicator() {
        return incrementalIndicator;
    }

    /**
     * Sets the value of the incrementalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementalIndicator(String value) {
        this.incrementalIndicator = value;
    }

    /**
     * Gets the value of the messageSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSource() {
        return messageSource;
    }

    /**
     * Sets the value of the messageSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSource(String value) {
        this.messageSource = value;
    }

}
