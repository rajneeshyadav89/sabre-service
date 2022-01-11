//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceType" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="OnlineInterlineService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonCommissionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuaranteeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayOnOutputInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AccountData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrenyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaiverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeInformation", propOrder = {
    "serviceType",
    "onlineInterlineService",
    "nonRefundableInd",
    "nonCommissionInd",
    "guaranteeType",
    "functionCode",
    "displayOnOutputInd",
    "amount",
    "accountData",
    "currenyCode",
    "description",
    "waiverCode"
})
public class FeeInformation {

    @XmlElement(name = "ServiceType")
    protected String serviceType;
    @XmlElement(name = "OnlineInterlineService")
    protected String onlineInterlineService;
    @XmlElement(name = "NonRefundableInd")
    protected String nonRefundableInd;
    @XmlElement(name = "NonCommissionInd")
    protected String nonCommissionInd;
    @XmlElement(name = "GuaranteeType")
    protected String guaranteeType;
    @XmlElement(name = "FunctionCode")
    protected String functionCode;
    @XmlElement(name = "DisplayOnOutputInd")
    protected String displayOnOutputInd;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "AccountData")
    protected String accountData;
    @XmlElement(name = "CurrenyCode")
    protected String currenyCode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "WaiverCode")
    protected String waiverCode;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the onlineInterlineService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineInterlineService() {
        return onlineInterlineService;
    }

    /**
     * Sets the value of the onlineInterlineService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineInterlineService(String value) {
        this.onlineInterlineService = value;
    }

    /**
     * Gets the value of the nonRefundableInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRefundableInd() {
        return nonRefundableInd;
    }

    /**
     * Sets the value of the nonRefundableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRefundableInd(String value) {
        this.nonRefundableInd = value;
    }

    /**
     * Gets the value of the nonCommissionInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonCommissionInd() {
        return nonCommissionInd;
    }

    /**
     * Sets the value of the nonCommissionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonCommissionInd(String value) {
        this.nonCommissionInd = value;
    }

    /**
     * Gets the value of the guaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * Sets the value of the guaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeType(String value) {
        this.guaranteeType = value;
    }

    /**
     * Gets the value of the functionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionCode() {
        return functionCode;
    }

    /**
     * Sets the value of the functionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionCode(String value) {
        this.functionCode = value;
    }

    /**
     * Gets the value of the displayOnOutputInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayOnOutputInd() {
        return displayOnOutputInd;
    }

    /**
     * Sets the value of the displayOnOutputInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayOnOutputInd(String value) {
        this.displayOnOutputInd = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the accountData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountData() {
        return accountData;
    }

    /**
     * Sets the value of the accountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountData(String value) {
        this.accountData = value;
    }

    /**
     * Gets the value of the currenyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrenyCode() {
        return currenyCode;
    }

    /**
     * Sets the value of the currenyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrenyCode(String value) {
        this.currenyCode = value;
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
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverCode(String value) {
        this.waiverCode = value;
    }

}
