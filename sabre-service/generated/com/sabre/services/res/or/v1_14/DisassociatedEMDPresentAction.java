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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisassociatedEMDPresentAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisassociatedEMDPresentAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="disassociatedEMDPresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="op" use="required" type="{http://services.sabre.com/res/or/v1_14}OpenReservationOperation" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisassociatedEMDPresentAction")
public class DisassociatedEMDPresentAction {

    @XmlAttribute(name = "disassociatedEMDPresent", required = true)
    protected boolean disassociatedEMDPresent;
    @XmlAttribute(name = "op", required = true)
    protected OpenReservationOperation op;

    /**
     * Gets the value of the disassociatedEMDPresent property.
     * 
     */
    public boolean isDisassociatedEMDPresent() {
        return disassociatedEMDPresent;
    }

    /**
     * Sets the value of the disassociatedEMDPresent property.
     * 
     */
    public void setDisassociatedEMDPresent(boolean value) {
        this.disassociatedEMDPresent = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link OpenReservationOperation }
     *     
     */
    public OpenReservationOperation getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenReservationOperation }
     *     
     */
    public void setOp(OpenReservationOperation value) {
        this.op = value;
    }

}
