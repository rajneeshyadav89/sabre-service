//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCardApprovalAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardApprovalAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentCardApproval" type="{http://services.sabre.com/res/or/v1_14}PaymentCardApproval" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="fopElementId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="op" use="required" type="{http://services.sabre.com/res/or/v1_14}OpenReservationOperation" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardApprovalAction", propOrder = {
    "paymentCardApproval"
})
public class PaymentCardApprovalAction {

    @XmlElement(name = "PaymentCardApproval", required = true)
    protected List<PaymentCardApproval> paymentCardApproval;
    @XmlAttribute(name = "fopElementId", required = true)
    protected String fopElementId;
    @XmlAttribute(name = "op", required = true)
    protected OpenReservationOperation op;

    /**
     * Gets the value of the paymentCardApproval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCardApproval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCardApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardApproval }
     * 
     * 
     */
    public List<PaymentCardApproval> getPaymentCardApproval() {
        if (paymentCardApproval == null) {
            paymentCardApproval = new ArrayList<PaymentCardApproval>();
        }
        return this.paymentCardApproval;
    }

    /**
     * Gets the value of the fopElementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopElementId() {
        return fopElementId;
    }

    /**
     * Sets the value of the fopElementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopElementId(String value) {
        this.fopElementId = value;
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
