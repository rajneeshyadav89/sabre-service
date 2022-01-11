//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Rate for a Room. Used in Response
 * 
 * <p>Java class for RateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="Rate"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                           &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                           &lt;attribute name="AmountBeforeTax" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
 *                           &lt;attribute name="AmountAfterTax" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
 *                           &lt;attribute name="CurrencyCode" type="{http://services.sabre.com/res/or/v1_14}LodgingCurrencyCodeType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RatePlanDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalDetails" type="{http://services.sabre.com/res/or/v1_14}AdditionalDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="Fees" type="{http://services.sabre.com/res/or/v1_14}FeesType" minOccurs="0"/&gt;
 *         &lt;element name="Taxes" type="{http://services.sabre.com/res/or/v1_14}LodgingTaxesType" minOccurs="0"/&gt;
 *         &lt;element name="CancelPenalties" type="{http://services.sabre.com/res/or/v1_14}CancelPenalties" minOccurs="0"/&gt;
 *         &lt;element name="Guarantee" type="{http://services.sabre.com/res/or/v1_14}GuaranteeType" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://services.sabre.com/res/or/v1_14}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="Discounts" type="{http://services.sabre.com/res/or/v1_14}Discounts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AmountBeforeTax" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
 *       &lt;attribute name="AmountAfterTax" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
 *       &lt;attribute name="CurrencyCode" type="{http://services.sabre.com/res/or/v1_14}LodgingCurrencyCodeType" /&gt;
 *       &lt;attribute name="AppliedDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NightlyRate" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
 *       &lt;attribute name="AdditionalFeesExcludedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SupplierChangedAmount" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
 *       &lt;attribute name="Changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdditionalFeesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LocalFeesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncidentalsInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInfoType", propOrder = {
    "rates",
    "ratePlanDescription",
    "additionalDetails",
    "fees",
    "taxes",
    "cancelPenalties",
    "guarantee",
    "commission",
    "discounts"
})
public class RateInfoType {

    @XmlElement(name = "Rates")
    protected RateInfoType.Rates rates;
    @XmlElement(name = "RatePlanDescription")
    protected RateInfoType.RatePlanDescription ratePlanDescription;
    @XmlElement(name = "AdditionalDetails")
    protected AdditionalDetailsType additionalDetails;
    @XmlElement(name = "Fees")
    protected FeesType fees;
    @XmlElement(name = "Taxes")
    protected LodgingTaxesType taxes;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenalties cancelPenalties;
    @XmlElement(name = "Guarantee")
    protected GuaranteeType guarantee;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "Discounts")
    protected Discounts discounts;
    @XmlAttribute(name = "AmountBeforeTax")
    protected BigDecimal amountBeforeTax;
    @XmlAttribute(name = "AmountAfterTax")
    protected BigDecimal amountAfterTax;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "AppliedDiscount")
    protected Boolean appliedDiscount;
    @XmlAttribute(name = "NightlyRate")
    protected BigDecimal nightlyRate;
    @XmlAttribute(name = "AdditionalFeesExcludedIndicator")
    protected Boolean additionalFeesExcludedIndicator;
    @XmlAttribute(name = "SupplierChangedAmount")
    protected BigDecimal supplierChangedAmount;
    @XmlAttribute(name = "Changed")
    protected Boolean changed;
    @XmlAttribute(name = "AdditionalFeesInclusive")
    protected Boolean additionalFeesInclusive;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "LocalFeesInclusive")
    protected Boolean localFeesInclusive;
    @XmlAttribute(name = "IncidentalsInclusive")
    protected Boolean incidentalsInclusive;

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link RateInfoType.Rates }
     *     
     */
    public RateInfoType.Rates getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInfoType.Rates }
     *     
     */
    public void setRates(RateInfoType.Rates value) {
        this.rates = value;
    }

    /**
     * Gets the value of the ratePlanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link RateInfoType.RatePlanDescription }
     *     
     */
    public RateInfoType.RatePlanDescription getRatePlanDescription() {
        return ratePlanDescription;
    }

    /**
     * Sets the value of the ratePlanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInfoType.RatePlanDescription }
     *     
     */
    public void setRatePlanDescription(RateInfoType.RatePlanDescription value) {
        this.ratePlanDescription = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public AdditionalDetailsType getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public void setAdditionalDetails(AdditionalDetailsType value) {
        this.additionalDetails = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingTaxesType }
     *     
     */
    public LodgingTaxesType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingTaxesType }
     *     
     */
    public void setTaxes(LodgingTaxesType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the cancelPenalties property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenalties }
     *     
     */
    public CancelPenalties getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * Sets the value of the cancelPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenalties }
     *     
     */
    public void setCancelPenalties(CancelPenalties value) {
        this.cancelPenalties = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeType }
     *     
     */
    public GuaranteeType getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeType }
     *     
     */
    public void setGuarantee(GuaranteeType value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the discounts property.
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getDiscounts() {
        return discounts;
    }

    /**
     * Sets the value of the discounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setDiscounts(Discounts value) {
        this.discounts = value;
    }

    /**
     * Gets the value of the amountBeforeTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountBeforeTax() {
        return amountBeforeTax;
    }

    /**
     * Sets the value of the amountBeforeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountBeforeTax(BigDecimal value) {
        this.amountBeforeTax = value;
    }

    /**
     * Gets the value of the amountAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountAfterTax() {
        return amountAfterTax;
    }

    /**
     * Sets the value of the amountAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountAfterTax(BigDecimal value) {
        this.amountAfterTax = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the appliedDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliedDiscount() {
        return appliedDiscount;
    }

    /**
     * Sets the value of the appliedDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliedDiscount(Boolean value) {
        this.appliedDiscount = value;
    }

    /**
     * Gets the value of the nightlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNightlyRate() {
        return nightlyRate;
    }

    /**
     * Sets the value of the nightlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNightlyRate(BigDecimal value) {
        this.nightlyRate = value;
    }

    /**
     * Gets the value of the additionalFeesExcludedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalFeesExcludedIndicator() {
        return additionalFeesExcludedIndicator;
    }

    /**
     * Sets the value of the additionalFeesExcludedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalFeesExcludedIndicator(Boolean value) {
        this.additionalFeesExcludedIndicator = value;
    }

    /**
     * Gets the value of the supplierChangedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSupplierChangedAmount() {
        return supplierChangedAmount;
    }

    /**
     * Sets the value of the supplierChangedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSupplierChangedAmount(BigDecimal value) {
        this.supplierChangedAmount = value;
    }

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChanged(Boolean value) {
        this.changed = value;
    }

    /**
     * Gets the value of the additionalFeesInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalFeesInclusive() {
        return additionalFeesInclusive;
    }

    /**
     * Sets the value of the additionalFeesInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalFeesInclusive(Boolean value) {
        this.additionalFeesInclusive = value;
    }

    /**
     * Gets the value of the taxInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * Sets the value of the taxInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusive(Boolean value) {
        this.taxInclusive = value;
    }

    /**
     * Gets the value of the localFeesInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalFeesInclusive() {
        return localFeesInclusive;
    }

    /**
     * Sets the value of the localFeesInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalFeesInclusive(Boolean value) {
        this.localFeesInclusive = value;
    }

    /**
     * Gets the value of the incidentalsInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncidentalsInclusive() {
        return incidentalsInclusive;
    }

    /**
     * Sets the value of the incidentalsInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncidentalsInclusive(Boolean value) {
        this.incidentalsInclusive = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class RatePlanDescription {

        @XmlElement(name = "Text", required = true)
        protected String text;

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="Rate"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *                 &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *                 &lt;attribute name="AmountBeforeTax" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
     *                 &lt;attribute name="AmountAfterTax" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
     *                 &lt;attribute name="CurrencyCode" type="{http://services.sabre.com/res/or/v1_14}LodgingCurrencyCodeType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rate"
    })
    public static class Rates {

        @XmlElement(name = "Rate", required = true)
        protected List<RateInfoType.Rates.Rate> rate;

        /**
         * Gets the value of the rate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateInfoType.Rates.Rate }
         * 
         * 
         */
        public List<RateInfoType.Rates.Rate> getRate() {
            if (rate == null) {
                rate = new ArrayList<RateInfoType.Rates.Rate>();
            }
            return this.rate;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
         *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
         *       &lt;attribute name="AmountBeforeTax" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
         *       &lt;attribute name="AmountAfterTax" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
         *       &lt;attribute name="CurrencyCode" type="{http://services.sabre.com/res/or/v1_14}LodgingCurrencyCodeType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Rate {

            @XmlAttribute(name = "StartDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar startDate;
            @XmlAttribute(name = "EndDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar endDate;
            @XmlAttribute(name = "AmountBeforeTax")
            protected BigDecimal amountBeforeTax;
            @XmlAttribute(name = "AmountAfterTax")
            protected BigDecimal amountAfterTax;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;

            /**
             * Gets the value of the startDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getStartDate() {
                return startDate;
            }

            /**
             * Sets the value of the startDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setStartDate(XMLGregorianCalendar value) {
                this.startDate = value;
            }

            /**
             * Gets the value of the endDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEndDate() {
                return endDate;
            }

            /**
             * Sets the value of the endDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEndDate(XMLGregorianCalendar value) {
                this.endDate = value;
            }

            /**
             * Gets the value of the amountBeforeTax property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmountBeforeTax() {
                return amountBeforeTax;
            }

            /**
             * Sets the value of the amountBeforeTax property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmountBeforeTax(BigDecimal value) {
                this.amountBeforeTax = value;
            }

            /**
             * Gets the value of the amountAfterTax property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmountAfterTax() {
                return amountAfterTax;
            }

            /**
             * Sets the value of the amountAfterTax property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmountAfterTax(BigDecimal value) {
                this.amountAfterTax = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

        }

    }

}