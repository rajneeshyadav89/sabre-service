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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingTransactionAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingTransactionAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Money" type="{http://services.sabre.com/res/or/v1_14}MoneyType" minOccurs="0"/&gt;
 *         &lt;element name="Points" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "AccountingTransactionAmount", propOrder = {
    "money",
    "points"
})
@XmlSeeAlso({
    AccountingTransactionAmountWithRule.class
})
public class AccountingTransactionAmount {

    @XmlElement(name = "Money")
    protected MoneyType money;
    @XmlElement(name = "Points")
    protected AccountingTransactionAmount.Points points;

    /**
     * Gets the value of the money property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyType }
     *     
     */
    public MoneyType getMoney() {
        return money;
    }

    /**
     * Sets the value of the money property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyType }
     *     
     */
    public void setMoney(MoneyType value) {
        this.money = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionAmount.Points }
     *     
     */
    public AccountingTransactionAmount.Points getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionAmount.Points }
     *     
     */
    public void setPoints(AccountingTransactionAmount.Points value) {
        this.points = value;
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
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "type",
        "value",
        "conversionRate"
    })
    public static class Points {

        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "Value", required = true)
        protected BigDecimal value;
        @XmlElement(name = "ConversionRate")
        protected BigDecimal conversionRate;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the conversionRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getConversionRate() {
            return conversionRate;
        }

        /**
         * Sets the value of the conversionRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setConversionRate(BigDecimal value) {
            this.conversionRate = value;
        }

    }

}
