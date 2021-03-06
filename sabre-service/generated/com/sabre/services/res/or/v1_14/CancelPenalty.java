//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Description Of cancel Penalty
 * 
 * <p>Java class for CancelPenalty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPenalty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Deadline" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AmountPercent" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="FeesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="BasisType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Percent" type="{http://services.sabre.com/res/or/v1_14}Percentage" /&gt;
 *                 &lt;attribute name="Amount" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://services.sabre.com/res/or/v1_14}LodgingCurrencyCodeType" /&gt;
 *                 &lt;attribute name="ApplyAs" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PenaltyDescription" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPenalty", propOrder = {
    "deadline",
    "amountPercent",
    "penaltyDescription"
})
public class CancelPenalty {

    @XmlElement(name = "Deadline")
    protected CancelPenalty.Deadline deadline;
    @XmlElement(name = "AmountPercent")
    protected CancelPenalty.AmountPercent amountPercent;
    @XmlElement(name = "PenaltyDescription")
    protected CancelPenalty.PenaltyDescription penaltyDescription;
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;

    /**
     * Gets the value of the deadline property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenalty.Deadline }
     *     
     */
    public CancelPenalty.Deadline getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenalty.Deadline }
     *     
     */
    public void setDeadline(CancelPenalty.Deadline value) {
        this.deadline = value;
    }

    /**
     * Gets the value of the amountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenalty.AmountPercent }
     *     
     */
    public CancelPenalty.AmountPercent getAmountPercent() {
        return amountPercent;
    }

    /**
     * Sets the value of the amountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenalty.AmountPercent }
     *     
     */
    public void setAmountPercent(CancelPenalty.AmountPercent value) {
        this.amountPercent = value;
    }

    /**
     * Gets the value of the penaltyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenalty.PenaltyDescription }
     *     
     */
    public CancelPenalty.PenaltyDescription getPenaltyDescription() {
        return penaltyDescription;
    }

    /**
     * Sets the value of the penaltyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenalty.PenaltyDescription }
     *     
     */
    public void setPenaltyDescription(CancelPenalty.PenaltyDescription value) {
        this.penaltyDescription = value;
    }

    /**
     * Gets the value of the refundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
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
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="FeesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="BasisType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Percent" type="{http://services.sabre.com/res/or/v1_14}Percentage" /&gt;
     *       &lt;attribute name="Amount" type="{http://services.sabre.com/res/or/v1_14}MoneyDataType" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://services.sabre.com/res/or/v1_14}LodgingCurrencyCodeType" /&gt;
     *       &lt;attribute name="ApplyAs" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AmountPercent {

        @XmlAttribute(name = "TaxInclusive")
        protected Boolean taxInclusive;
        @XmlAttribute(name = "FeesInclusive")
        protected Boolean feesInclusive;
        @XmlAttribute(name = "NmbrOfNights")
        protected Integer nmbrOfNights;
        @XmlAttribute(name = "BasisType")
        protected String basisType;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "ApplyAs")
        protected String applyAs;

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
         * Gets the value of the feesInclusive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFeesInclusive() {
            return feesInclusive;
        }

        /**
         * Sets the value of the feesInclusive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFeesInclusive(Boolean value) {
            this.feesInclusive = value;
        }

        /**
         * Gets the value of the nmbrOfNights property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNmbrOfNights() {
            return nmbrOfNights;
        }

        /**
         * Sets the value of the nmbrOfNights property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNmbrOfNights(Integer value) {
            this.nmbrOfNights = value;
        }

        /**
         * Gets the value of the basisType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBasisType() {
            return basisType;
        }

        /**
         * Sets the value of the basisType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBasisType(String value) {
            this.basisType = value;
        }

        /**
         * Gets the value of the percent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * Sets the value of the percent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
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
         * Gets the value of the applyAs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplyAs() {
            return applyAs;
        }

        /**
         * Sets the value of the applyAs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplyAs(String value) {
            this.applyAs = value;
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
     *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="OffsetDropTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OffsetTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Deadline {

        @XmlAttribute(name = "AbsoluteDeadline")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar absoluteDeadline;
        @XmlAttribute(name = "OffsetDropTime")
        protected String offsetDropTime;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected String offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected String offsetUnitMultiplier;

        /**
         * Gets the value of the absoluteDeadline property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * Sets the value of the absoluteDeadline property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAbsoluteDeadline(XMLGregorianCalendar value) {
            this.absoluteDeadline = value;
        }

        /**
         * Gets the value of the offsetDropTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * Sets the value of the offsetDropTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
        }

        /**
         * Gets the value of the offsetTimeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * Sets the value of the offsetTimeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetTimeUnit(String value) {
            this.offsetTimeUnit = value;
        }

        /**
         * Gets the value of the offsetUnitMultiplier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * Sets the value of the offsetUnitMultiplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetUnitMultiplier(String value) {
            this.offsetUnitMultiplier = value;
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
    public static class PenaltyDescription {

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

}
