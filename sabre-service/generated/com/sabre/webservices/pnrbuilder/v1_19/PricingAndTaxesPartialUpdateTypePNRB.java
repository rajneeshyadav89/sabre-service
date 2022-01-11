//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingAndTaxesPartialUpdateType.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingAndTaxesPartialUpdateType.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalBasePrice" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryPrice.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="EquivalentPrice" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryPrice.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="TTLPrice" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryPrice.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="Taxes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tax" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryTax.PNRB" maxOccurs="99" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FareCalculationModeIndicator" type="{http://webservices.sabre.com/pnrbuilder/v1_19}FCMIType" minOccurs="0"/&gt;
 *         &lt;element name="FareCalculationPriceIndicator" type="{http://webservices.sabre.com/pnrbuilder/v1_19}FCPIType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingAndTaxesPartialUpdateType.PNRB", propOrder = {
    "originalBasePrice",
    "equivalentPrice",
    "ttlPrice",
    "taxes",
    "fareCalculationModeIndicator",
    "fareCalculationPriceIndicator"
})
public class PricingAndTaxesPartialUpdateTypePNRB {

    @XmlElement(name = "OriginalBasePrice")
    protected AncillaryPricePNRB originalBasePrice;
    @XmlElement(name = "EquivalentPrice")
    protected AncillaryPricePNRB equivalentPrice;
    @XmlElement(name = "TTLPrice")
    protected AncillaryPricePNRB ttlPrice;
    @XmlElement(name = "Taxes")
    protected PricingAndTaxesPartialUpdateTypePNRB.Taxes taxes;
    @XmlElement(name = "FareCalculationModeIndicator")
    protected Integer fareCalculationModeIndicator;
    @XmlElement(name = "FareCalculationPriceIndicator")
    protected String fareCalculationPriceIndicator;

    /**
     * Gets the value of the originalBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public AncillaryPricePNRB getOriginalBasePrice() {
        return originalBasePrice;
    }

    /**
     * Sets the value of the originalBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public void setOriginalBasePrice(AncillaryPricePNRB value) {
        this.originalBasePrice = value;
    }

    /**
     * Gets the value of the equivalentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public AncillaryPricePNRB getEquivalentPrice() {
        return equivalentPrice;
    }

    /**
     * Sets the value of the equivalentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public void setEquivalentPrice(AncillaryPricePNRB value) {
        this.equivalentPrice = value;
    }

    /**
     * Gets the value of the ttlPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public AncillaryPricePNRB getTTLPrice() {
        return ttlPrice;
    }

    /**
     * Sets the value of the ttlPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public void setTTLPrice(AncillaryPricePNRB value) {
        this.ttlPrice = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link PricingAndTaxesPartialUpdateTypePNRB.Taxes }
     *     
     */
    public PricingAndTaxesPartialUpdateTypePNRB.Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingAndTaxesPartialUpdateTypePNRB.Taxes }
     *     
     */
    public void setTaxes(PricingAndTaxesPartialUpdateTypePNRB.Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fareCalculationModeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFareCalculationModeIndicator() {
        return fareCalculationModeIndicator;
    }

    /**
     * Sets the value of the fareCalculationModeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFareCalculationModeIndicator(Integer value) {
        this.fareCalculationModeIndicator = value;
    }

    /**
     * Gets the value of the fareCalculationPriceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalculationPriceIndicator() {
        return fareCalculationPriceIndicator;
    }

    /**
     * Sets the value of the fareCalculationPriceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCalculationPriceIndicator(String value) {
        this.fareCalculationPriceIndicator = value;
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
     *         &lt;element name="Tax" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryTax.PNRB" maxOccurs="99" minOccurs="0"/&gt;
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
        "tax"
    })
    public static class Taxes {

        @XmlElement(name = "Tax")
        protected List<AncillaryTaxPNRB> tax;

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AncillaryTaxPNRB }
         * 
         * 
         */
        public List<AncillaryTaxPNRB> getTax() {
            if (tax == null) {
                tax = new ArrayList<AncillaryTaxPNRB>();
            }
            return this.tax;
        }

    }

}