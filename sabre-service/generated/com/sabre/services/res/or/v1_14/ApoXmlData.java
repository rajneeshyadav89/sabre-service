//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApoXmlData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApoXmlData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://services.sabre.com/res/or/v1_14}AncillaryServiceData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApoXmlData", propOrder = {
    "ancillaryServiceData"
})
public class ApoXmlData {

    @XmlElement(name = "AncillaryServiceData")
    protected AncillaryServiceData ancillaryServiceData;

    /**
     * Gets the value of the ancillaryServiceData property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceData }
     *     
     */
    public AncillaryServiceData getAncillaryServiceData() {
        return ancillaryServiceData;
    }

    /**
     * Sets the value of the ancillaryServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceData }
     *     
     */
    public void setAncillaryServiceData(AncillaryServiceData value) {
        this.ancillaryServiceData = value;
    }

}
