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
 * <p>Java class for AccountingFieldAncillaryETicketNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingFieldAncillaryETicketNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ETicketNumber" type="{http://services.sabre.com/res/or/v1_14}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ETicketCoupon" type="{http://services.sabre.com/res/or/v1_14}CommonString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingFieldAncillaryETicketNumber", propOrder = {
    "eTicketNumber",
    "eTicketCoupon"
})
public class AccountingFieldAncillaryETicketNumber {

    @XmlElement(name = "ETicketNumber")
    protected String eTicketNumber;
    @XmlElement(name = "ETicketCoupon")
    protected String eTicketCoupon;

    /**
     * Gets the value of the eTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketNumber() {
        return eTicketNumber;
    }

    /**
     * Sets the value of the eTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketNumber(String value) {
        this.eTicketNumber = value;
    }

    /**
     * Gets the value of the eTicketCoupon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketCoupon() {
        return eTicketCoupon;
    }

    /**
     * Sets the value of the eTicketCoupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketCoupon(String value) {
        this.eTicketCoupon = value;
    }

}
