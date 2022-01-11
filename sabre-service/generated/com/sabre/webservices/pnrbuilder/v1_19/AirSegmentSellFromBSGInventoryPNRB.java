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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirSegmentSellFromBSGInventory.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSegmentSellFromBSGInventory.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BSGPNRRecordLocator" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="NumberInParty" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Numeric0to99999" minOccurs="0"/&gt;
 *         &lt;element name="SegmentSpecialRequests" type="{http://webservices.sabre.com/pnrbuilder/v1_19}ItinerarySpecialRequests.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="FrequentFlyer" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Loyalty.PNRB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
 *       &lt;attribute name="segmentNumber" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Numeric0to99999" /&gt;
 *       &lt;attribute name="op" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OperationType.PNRB" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSegmentSellFromBSGInventory.PNRB", propOrder = {
    "bsgpnrRecordLocator",
    "numberInParty",
    "segmentSpecialRequests",
    "frequentFlyer"
})
public class AirSegmentSellFromBSGInventoryPNRB {

    @XmlElement(name = "BSGPNRRecordLocator")
    protected String bsgpnrRecordLocator;
    @XmlElement(name = "NumberInParty")
    @XmlSchemaType(name = "integer")
    protected Integer numberInParty;
    @XmlElement(name = "SegmentSpecialRequests")
    protected ItinerarySpecialRequestsPNRB segmentSpecialRequests;
    @XmlElement(name = "FrequentFlyer")
    protected LoyaltyPNRB frequentFlyer;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "segmentNumber")
    protected Integer segmentNumber;
    @XmlAttribute(name = "op")
    protected OperationTypePNRB op;

    /**
     * Gets the value of the bsgpnrRecordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSGPNRRecordLocator() {
        return bsgpnrRecordLocator;
    }

    /**
     * Sets the value of the bsgpnrRecordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSGPNRRecordLocator(String value) {
        this.bsgpnrRecordLocator = value;
    }

    /**
     * Gets the value of the numberInParty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberInParty() {
        return numberInParty;
    }

    /**
     * Sets the value of the numberInParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberInParty(Integer value) {
        this.numberInParty = value;
    }

    /**
     * Gets the value of the segmentSpecialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ItinerarySpecialRequestsPNRB }
     *     
     */
    public ItinerarySpecialRequestsPNRB getSegmentSpecialRequests() {
        return segmentSpecialRequests;
    }

    /**
     * Sets the value of the segmentSpecialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinerarySpecialRequestsPNRB }
     *     
     */
    public void setSegmentSpecialRequests(ItinerarySpecialRequestsPNRB value) {
        this.segmentSpecialRequests = value;
    }

    /**
     * Gets the value of the frequentFlyer property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyPNRB }
     *     
     */
    public LoyaltyPNRB getFrequentFlyer() {
        return frequentFlyer;
    }

    /**
     * Sets the value of the frequentFlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyPNRB }
     *     
     */
    public void setFrequentFlyer(LoyaltyPNRB value) {
        this.frequentFlyer = value;
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
     * Gets the value of the segmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentNumber() {
        return segmentNumber;
    }

    /**
     * Sets the value of the segmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentNumber(Integer value) {
        this.segmentNumber = value;
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