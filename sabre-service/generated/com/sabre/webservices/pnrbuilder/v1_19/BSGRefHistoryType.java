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
 * <p>Java class for BSGRefHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BSGRefHistoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistoryAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BSGPNRRecordLocator" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ActiveAssocPnr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelAssocPnr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BSGRefHistoryType", propOrder = {
    "historyAction",
    "bsgpnrRecordLocator",
    "activeAssocPnr",
    "cancelAssocPnr"
})
public class BSGRefHistoryType {

    @XmlElement(name = "HistoryAction")
    protected String historyAction;
    @XmlElement(name = "BSGPNRRecordLocator")
    protected String bsgpnrRecordLocator;
    @XmlElement(name = "ActiveAssocPnr")
    protected Boolean activeAssocPnr;
    @XmlElement(name = "CancelAssocPnr")
    protected Boolean cancelAssocPnr;

    /**
     * Gets the value of the historyAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryAction() {
        return historyAction;
    }

    /**
     * Sets the value of the historyAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryAction(String value) {
        this.historyAction = value;
    }

    /**
     * Gets the value of the bsgpnrRecordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSGPNRRecordLocator() {
        return bsgpnrRecordLocator;
    }

    /**
     * Sets the value of the bsgpnrRecordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSGPNRRecordLocator(String value) {
        this.bsgpnrRecordLocator = value;
    }

    /**
     * Gets the value of the activeAssocPnr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveAssocPnr() {
        return activeAssocPnr;
    }

    /**
     * Sets the value of the activeAssocPnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveAssocPnr(Boolean value) {
        this.activeAssocPnr = value;
    }

    /**
     * Gets the value of the cancelAssocPnr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelAssocPnr() {
        return cancelAssocPnr;
    }

    /**
     * Sets the value of the cancelAssocPnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelAssocPnr(Boolean value) {
        this.cancelAssocPnr = value;
    }

}
