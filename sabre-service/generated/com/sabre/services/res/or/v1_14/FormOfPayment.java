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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormOfPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PaymentCard" type="{http://services.sabre.com/res/or/v1_14}PaymentCard" minOccurs="0"/&gt;
 *           &lt;element name="Cash" type="{http://services.sabre.com/res/or/v1_14}Cash" minOccurs="0"/&gt;
 *           &lt;element name="Check" type="{http://services.sabre.com/res/or/v1_14}Check" minOccurs="0"/&gt;
 *           &lt;element name="Invoice" type="{http://services.sabre.com/res/or/v1_14}Invoice" minOccurs="0"/&gt;
 *           &lt;element name="Docket" type="{http://services.sabre.com/res/or/v1_14}Docket" minOccurs="0"/&gt;
 *           &lt;element name="GTR" type="{http://services.sabre.com/res/or/v1_14}GTR" minOccurs="0"/&gt;
 *           &lt;element name="VirtualCard" type="{http://services.sabre.com/res/or/v1_14}VirtualCard" minOccurs="0"/&gt;
 *           &lt;element name="Other" type="{http://services.sabre.com/res/or/v1_14}OtherFOP" minOccurs="0"/&gt;
 *           &lt;element name="PayLaterPlan" type="{http://services.sabre.com/res/or/v1_14}PayLaterPlan" minOccurs="0"/&gt;
 *           &lt;element name="LoyaltyProgramRedemption" type="{http://services.sabre.com/res/or/v1_14}LoyaltyProgramRedemption" minOccurs="0"/&gt;
 *           &lt;element name="AccountCode" type="{http://services.sabre.com/res/or/v1_14}AccountCode" minOccurs="0"/&gt;
 *           &lt;element name="Agency" type="{http://services.sabre.com/res/or/v1_14}Agency" minOccurs="0"/&gt;
 *           &lt;element name="Corporate" type="{http://services.sabre.com/res/or/v1_14}Corporate" minOccurs="0"/&gt;
 *           &lt;element name="Company" type="{http://services.sabre.com/res/or/v1_14}CompanyType" minOccurs="0"/&gt;
 *           &lt;element name="Customer" type="{http://services.sabre.com/res/or/v1_14}PassengerType" minOccurs="0"/&gt;
 *           &lt;element name="Deposit" type="{http://services.sabre.com/res/or/v1_14}Deposit" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="miscFOP" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="migrated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPayment", propOrder = {
    "paymentCard",
    "cash",
    "check",
    "invoice",
    "docket",
    "gtr",
    "virtualCard",
    "other",
    "payLaterPlan",
    "loyaltyProgramRedemption",
    "accountCode",
    "agency",
    "corporate",
    "company",
    "customer",
    "deposit"
})
public class FormOfPayment {

    @XmlElement(name = "PaymentCard")
    protected PaymentCard paymentCard;
    @XmlElement(name = "Cash")
    protected Cash cash;
    @XmlElement(name = "Check")
    protected Check check;
    @XmlElement(name = "Invoice")
    protected Invoice invoice;
    @XmlElement(name = "Docket")
    protected Docket docket;
    @XmlElement(name = "GTR")
    protected GTR gtr;
    @XmlElement(name = "VirtualCard")
    protected VirtualCard virtualCard;
    @XmlElement(name = "Other")
    protected OtherFOP other;
    @XmlElement(name = "PayLaterPlan")
    protected PayLaterPlan payLaterPlan;
    @XmlElement(name = "LoyaltyProgramRedemption")
    protected LoyaltyProgramRedemption loyaltyProgramRedemption;
    @XmlElement(name = "AccountCode")
    protected AccountCode accountCode;
    @XmlElement(name = "Agency")
    protected Agency agency;
    @XmlElement(name = "Corporate")
    protected Corporate corporate;
    @XmlElement(name = "Company")
    protected CompanyType company;
    @XmlElement(name = "Customer")
    protected PassengerType customer;
    @XmlElement(name = "Deposit")
    protected Deposit deposit;
    @XmlAttribute(name = "miscFOP")
    protected Boolean miscFOP;
    @XmlAttribute(name = "migrated")
    protected Boolean migrated;

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard }
     *     
     */
    public PaymentCard getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard }
     *     
     */
    public void setPaymentCard(PaymentCard value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link Cash }
     *     
     */
    public Cash getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cash }
     *     
     */
    public void setCash(Cash value) {
        this.cash = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link Check }
     *     
     */
    public Check getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check }
     *     
     */
    public void setCheck(Check value) {
        this.check = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice }
     *     
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice }
     *     
     */
    public void setInvoice(Invoice value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the docket property.
     * 
     * @return
     *     possible object is
     *     {@link Docket }
     *     
     */
    public Docket getDocket() {
        return docket;
    }

    /**
     * Sets the value of the docket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Docket }
     *     
     */
    public void setDocket(Docket value) {
        this.docket = value;
    }

    /**
     * Gets the value of the gtr property.
     * 
     * @return
     *     possible object is
     *     {@link GTR }
     *     
     */
    public GTR getGTR() {
        return gtr;
    }

    /**
     * Sets the value of the gtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTR }
     *     
     */
    public void setGTR(GTR value) {
        this.gtr = value;
    }

    /**
     * Gets the value of the virtualCard property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualCard }
     *     
     */
    public VirtualCard getVirtualCard() {
        return virtualCard;
    }

    /**
     * Sets the value of the virtualCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualCard }
     *     
     */
    public void setVirtualCard(VirtualCard value) {
        this.virtualCard = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFOP }
     *     
     */
    public OtherFOP getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFOP }
     *     
     */
    public void setOther(OtherFOP value) {
        this.other = value;
    }

    /**
     * Gets the value of the payLaterPlan property.
     * 
     * @return
     *     possible object is
     *     {@link PayLaterPlan }
     *     
     */
    public PayLaterPlan getPayLaterPlan() {
        return payLaterPlan;
    }

    /**
     * Sets the value of the payLaterPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayLaterPlan }
     *     
     */
    public void setPayLaterPlan(PayLaterPlan value) {
        this.payLaterPlan = value;
    }

    /**
     * Gets the value of the loyaltyProgramRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramRedemption }
     *     
     */
    public LoyaltyProgramRedemption getLoyaltyProgramRedemption() {
        return loyaltyProgramRedemption;
    }

    /**
     * Sets the value of the loyaltyProgramRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramRedemption }
     *     
     */
    public void setLoyaltyProgramRedemption(LoyaltyProgramRedemption value) {
        this.loyaltyProgramRedemption = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCode }
     *     
     */
    public AccountCode getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCode }
     *     
     */
    public void setAccountCode(AccountCode value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link Agency }
     *     
     */
    public Agency getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agency }
     *     
     */
    public void setAgency(Agency value) {
        this.agency = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link Corporate }
     *     
     */
    public Corporate getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Corporate }
     *     
     */
    public void setCorporate(Corporate value) {
        this.corporate = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCompany(CompanyType value) {
        this.company = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerType }
     *     
     */
    public PassengerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerType }
     *     
     */
    public void setCustomer(PassengerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link Deposit }
     *     
     */
    public Deposit getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deposit }
     *     
     */
    public void setDeposit(Deposit value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the miscFOP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiscFOP() {
        return miscFOP;
    }

    /**
     * Sets the value of the miscFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiscFOP(Boolean value) {
        this.miscFOP = value;
    }

    /**
     * Gets the value of the migrated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMigrated() {
        if (migrated == null) {
            return false;
        } else {
            return migrated;
        }
    }

    /**
     * Sets the value of the migrated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMigrated(Boolean value) {
        this.migrated = value;
    }

}
