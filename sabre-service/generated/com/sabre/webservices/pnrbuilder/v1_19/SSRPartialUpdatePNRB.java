//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSRPartialUpdate.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSRPartialUpdate.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionCodeUpdate"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="ActionCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
 *       &lt;attribute name="op" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OperationType.PNRB" /&gt;
 *       &lt;attribute name="type" type="{http://webservices.sabre.com/pnrbuilder/v1_19}FactType.PNRB" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRPartialUpdate.PNRB", propOrder = {
    "actionCodeUpdate"
})
public class SSRPartialUpdatePNRB {

    @XmlElement(name = "ActionCodeUpdate", required = true)
    protected SSRPartialUpdatePNRB.ActionCodeUpdate actionCodeUpdate;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "op")
    protected OperationTypePNRB op;
    @XmlAttribute(name = "type")
    protected FactTypePNRB type;

    /**
     * Gets the value of the actionCodeUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link SSRPartialUpdatePNRB.ActionCodeUpdate }
     *     
     */
    public SSRPartialUpdatePNRB.ActionCodeUpdate getActionCodeUpdate() {
        return actionCodeUpdate;
    }

    /**
     * Sets the value of the actionCodeUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSRPartialUpdatePNRB.ActionCodeUpdate }
     *     
     */
    public void setActionCodeUpdate(SSRPartialUpdatePNRB.ActionCodeUpdate value) {
        this.actionCodeUpdate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTypePNRB }
     *     
     */
    public OperationTypePNRB getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTypePNRB }
     *     
     */
    public void setOp(OperationTypePNRB value) {
        this.op = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FactTypePNRB }
     *     
     */
    public FactTypePNRB getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactTypePNRB }
     *     
     */
    public void setType(FactTypePNRB value) {
        this.type = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="ActionCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "actionCode"
    })
    public static class ActionCodeUpdate {

        @XmlElement(name = "ActionCode")
        protected String actionCode;

        /**
         * Gets the value of the actionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionCode() {
            return actionCode;
        }

        /**
         * Sets the value of the actionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionCode(String value) {
            this.actionCode = value;
        }

    }

}
