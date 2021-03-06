//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AncillaryServiceRuleSetPartialUpdate.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryServiceRuleSetPartialUpdate.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleSet"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://webservices.sabre.com/pnrbuilder/v1_19&gt;StringLength1to20"&gt;
 *                 &lt;attribute name="RuleId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "AncillaryServiceRuleSetPartialUpdate.PNRB", propOrder = {
    "ruleSet"
})
public class AncillaryServiceRuleSetPartialUpdatePNRB {

    @XmlElement(name = "RuleSet", required = true)
    protected AncillaryServiceRuleSetPartialUpdatePNRB.RuleSet ruleSet;

    /**
     * Gets the value of the ruleSet property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceRuleSetPartialUpdatePNRB.RuleSet }
     *     
     */
    public AncillaryServiceRuleSetPartialUpdatePNRB.RuleSet getRuleSet() {
        return ruleSet;
    }

    /**
     * Sets the value of the ruleSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceRuleSetPartialUpdatePNRB.RuleSet }
     *     
     */
    public void setRuleSet(AncillaryServiceRuleSetPartialUpdatePNRB.RuleSet value) {
        this.ruleSet = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://webservices.sabre.com/pnrbuilder/v1_19&gt;StringLength1to20"&gt;
     *       &lt;attribute name="RuleId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RuleSet {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "RuleId")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger ruleId;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the ruleId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRuleId() {
            return ruleId;
        }

        /**
         * Sets the value of the ruleId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRuleId(BigInteger value) {
            this.ruleId = value;
        }

    }

}
