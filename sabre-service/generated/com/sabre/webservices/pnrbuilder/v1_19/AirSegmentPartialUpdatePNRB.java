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
 * Used to update air segment information
 * 
 * <p>Java class for AirSegmentPartialUpdate.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSegmentPartialUpdate.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ConfirmationUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}ConfirmationUpdate.PNRB"/&gt;
 *         &lt;element name="ActionCodeUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AirActionCodeUpdate.PNRB"/&gt;
 *         &lt;element name="ClassOfServiceUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}ClassOfServiceUpdate.PNRB"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" use="required" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
 *       &lt;attribute name="op" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OperationType.PNRB" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSegmentPartialUpdate.PNRB", propOrder = {
    "confirmationUpdate",
    "actionCodeUpdate",
    "classOfServiceUpdate"
})
public class AirSegmentPartialUpdatePNRB {

    @XmlElement(name = "ConfirmationUpdate")
    protected ConfirmationUpdatePNRB confirmationUpdate;
    @XmlElement(name = "ActionCodeUpdate")
    protected AirActionCodeUpdatePNRB actionCodeUpdate;
    @XmlElement(name = "ClassOfServiceUpdate")
    protected ClassOfServiceUpdatePNRB classOfServiceUpdate;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "op")
    protected OperationTypePNRB op;

    /**
     * Gets the value of the confirmationUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationUpdatePNRB }
     *     
     */
    public ConfirmationUpdatePNRB getConfirmationUpdate() {
        return confirmationUpdate;
    }

    /**
     * Sets the value of the confirmationUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationUpdatePNRB }
     *     
     */
    public void setConfirmationUpdate(ConfirmationUpdatePNRB value) {
        this.confirmationUpdate = value;
    }

    /**
     * Gets the value of the actionCodeUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AirActionCodeUpdatePNRB }
     *     
     */
    public AirActionCodeUpdatePNRB getActionCodeUpdate() {
        return actionCodeUpdate;
    }

    /**
     * Sets the value of the actionCodeUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirActionCodeUpdatePNRB }
     *     
     */
    public void setActionCodeUpdate(AirActionCodeUpdatePNRB value) {
        this.actionCodeUpdate = value;
    }

    /**
     * Gets the value of the classOfServiceUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfServiceUpdatePNRB }
     *     
     */
    public ClassOfServiceUpdatePNRB getClassOfServiceUpdate() {
        return classOfServiceUpdate;
    }

    /**
     * Sets the value of the classOfServiceUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfServiceUpdatePNRB }
     *     
     */
    public void setClassOfServiceUpdate(ClassOfServiceUpdatePNRB value) {
        this.classOfServiceUpdate = value;
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

}
