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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierRefundItem.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierRefundItem.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CarrierRecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *           &lt;element name="SegmentSubset" type="{http://webservices.sabre.com/pnrbuilder/v1_19}SegmentSubset"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PaymentAuthorizationCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "CarrierRefundItem.PNRB", propOrder = {
    "carrierRecordLocator",
    "segmentSubset",
    "paymentAuthorizationCode"
})
public class CarrierRefundItemPNRB {

    @XmlElement(name = "CarrierRecordLocator")
    protected List<String> carrierRecordLocator;
    @XmlElement(name = "SegmentSubset")
    @XmlSchemaType(name = "string")
    protected SegmentSubset segmentSubset;
    @XmlElement(name = "PaymentAuthorizationCode")
    protected String paymentAuthorizationCode;

    /**
     * Gets the value of the carrierRecordLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierRecordLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierRecordLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarrierRecordLocator() {
        if (carrierRecordLocator == null) {
            carrierRecordLocator = new ArrayList<String>();
        }
        return this.carrierRecordLocator;
    }

    /**
     * Gets the value of the segmentSubset property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentSubset }
     *     
     */
    public SegmentSubset getSegmentSubset() {
        return segmentSubset;
    }

    /**
     * Sets the value of the segmentSubset property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentSubset }
     *     
     */
    public void setSegmentSubset(SegmentSubset value) {
        this.segmentSubset = value;
    }

    /**
     * Gets the value of the paymentAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAuthorizationCode() {
        return paymentAuthorizationCode;
    }

    /**
     * Sets the value of the paymentAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAuthorizationCode(String value) {
        this.paymentAuthorizationCode = value;
    }

}
