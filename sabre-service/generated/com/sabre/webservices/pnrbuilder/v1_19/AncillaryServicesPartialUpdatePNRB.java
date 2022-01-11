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
 * <p>Java class for AncillaryServicesPartialUpdate.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryServicesPartialUpdate.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameAssociationList" type="{http://webservices.sabre.com/pnrbuilder/v1_19}NameAssociationList.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="SegmentAssociationList" type="{http://webservices.sabre.com/pnrbuilder/v1_19}SegmentAssociationList.PNRB" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ActionCodeUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceActionCodeUpdate.PNRB"/&gt;
 *           &lt;element name="SeatRequestTransactionIDUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceSeatRequestTransactionIDUpdate.PNRB"/&gt;
 *           &lt;element name="EMDNumberUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceEMDNumberUpdate.PNRB"/&gt;
 *           &lt;element name="ETicketNumberUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceETicketNumberUpdate.PNRB"/&gt;
 *           &lt;element name="PricingAndTaxesPartialUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}PricingAndTaxesPartialUpdateType.PNRB"/&gt;
 *           &lt;element name="PassengerTypeCodePartialUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServicePassengerTypeCodePartialUpdate.PNRB"/&gt;
 *           &lt;element name="IATAIndicatorPartialUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceIATAIndicatorPartialUpdate.PNRB"/&gt;
 *           &lt;element name="FeeGuaranteePartialUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceFeeGuaranteePartialUpdate.PNRB"/&gt;
 *           &lt;element name="PurchaseDateUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServicePurchaseDateUpdate.PNRB"/&gt;
 *           &lt;element name="GroupCodeAndRficSubcodeUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceGroupCodeAndRficSubcodeUpdate.PNRB"/&gt;
 *           &lt;element name="EMDTypeUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceEMDTypeUpdate.PNRB"/&gt;
 *           &lt;element name="AcsCountUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceAcsCountUpdate.PNRB"/&gt;
 *           &lt;element name="VendorCodeUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceVendorCodeUpdate.PNRB"/&gt;
 *           &lt;element name="SegmentAdvisoryList" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceAdvisorySegmentList.PNRB"/&gt;
 *           &lt;element name="AaPayOptionalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="TaxExemption" type="{http://webservices.sabre.com/pnrbuilder/v1_19}IndicatorType" minOccurs="0"/&gt;
 *           &lt;element name="PdcSeatUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServicePdcSeatPartialUpdate.PNRB"/&gt;
 *           &lt;element name="RuleSetUpdate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AncillaryServiceRuleSetPartialUpdate.PNRB"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="aePortionId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="id" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
 *       &lt;attribute name="op" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OperationType.PNRB" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryServicesPartialUpdate.PNRB", propOrder = {
    "nameAssociationList",
    "segmentAssociationList",
    "actionCodeUpdate",
    "seatRequestTransactionIDUpdate",
    "emdNumberUpdate",
    "eTicketNumberUpdate",
    "pricingAndTaxesPartialUpdate",
    "passengerTypeCodePartialUpdate",
    "iataIndicatorPartialUpdate",
    "feeGuaranteePartialUpdate",
    "purchaseDateUpdate",
    "groupCodeAndRficSubcodeUpdate",
    "emdTypeUpdate",
    "acsCountUpdate",
    "vendorCodeUpdate",
    "segmentAdvisoryList",
    "aaPayOptionalStatus",
    "taxExemption",
    "pdcSeatUpdate",
    "ruleSetUpdate"
})
public class AncillaryServicesPartialUpdatePNRB {

    @XmlElement(name = "NameAssociationList")
    protected NameAssociationListPNRB nameAssociationList;
    @XmlElement(name = "SegmentAssociationList")
    protected SegmentAssociationListPNRB segmentAssociationList;
    @XmlElement(name = "ActionCodeUpdate")
    protected AncillaryServiceActionCodeUpdatePNRB actionCodeUpdate;
    @XmlElement(name = "SeatRequestTransactionIDUpdate")
    protected AncillaryServiceSeatRequestTransactionIDUpdatePNRB seatRequestTransactionIDUpdate;
    @XmlElement(name = "EMDNumberUpdate")
    protected AncillaryServiceEMDNumberUpdatePNRB emdNumberUpdate;
    @XmlElement(name = "ETicketNumberUpdate")
    protected AncillaryServiceETicketNumberUpdatePNRB eTicketNumberUpdate;
    @XmlElement(name = "PricingAndTaxesPartialUpdate")
    protected PricingAndTaxesPartialUpdateTypePNRB pricingAndTaxesPartialUpdate;
    @XmlElement(name = "PassengerTypeCodePartialUpdate")
    protected AncillaryServicePassengerTypeCodePartialUpdatePNRB passengerTypeCodePartialUpdate;
    @XmlElement(name = "IATAIndicatorPartialUpdate")
    protected AncillaryServiceIATAIndicatorPartialUpdatePNRB iataIndicatorPartialUpdate;
    @XmlElement(name = "FeeGuaranteePartialUpdate")
    protected AncillaryServiceFeeGuaranteePartialUpdatePNRB feeGuaranteePartialUpdate;
    @XmlElement(name = "PurchaseDateUpdate")
    protected AncillaryServicePurchaseDateUpdatePNRB purchaseDateUpdate;
    @XmlElement(name = "GroupCodeAndRficSubcodeUpdate")
    protected AncillaryServiceGroupCodeAndRficSubcodeUpdatePNRB groupCodeAndRficSubcodeUpdate;
    @XmlElement(name = "EMDTypeUpdate")
    protected AncillaryServiceEMDTypeUpdatePNRB emdTypeUpdate;
    @XmlElement(name = "AcsCountUpdate")
    protected AncillaryServiceAcsCountUpdatePNRB acsCountUpdate;
    @XmlElement(name = "VendorCodeUpdate")
    protected AncillaryServiceVendorCodeUpdatePNRB vendorCodeUpdate;
    @XmlElement(name = "SegmentAdvisoryList")
    protected AncillaryServiceAdvisorySegmentListPNRB segmentAdvisoryList;
    @XmlElement(name = "AaPayOptionalStatus")
    protected String aaPayOptionalStatus;
    @XmlElement(name = "TaxExemption")
    @XmlSchemaType(name = "string")
    protected IndicatorType taxExemption;
    @XmlElement(name = "PdcSeatUpdate")
    protected AncillaryServicePdcSeatPartialUpdatePNRB pdcSeatUpdate;
    @XmlElement(name = "RuleSetUpdate")
    protected AncillaryServiceRuleSetPartialUpdatePNRB ruleSetUpdate;
    @XmlAttribute(name = "aePortionId")
    protected Integer aePortionId;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "op")
    protected OperationTypePNRB op;

    /**
     * Gets the value of the nameAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link NameAssociationListPNRB }
     *     
     */
    public NameAssociationListPNRB getNameAssociationList() {
        return nameAssociationList;
    }

    /**
     * Sets the value of the nameAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAssociationListPNRB }
     *     
     */
    public void setNameAssociationList(NameAssociationListPNRB value) {
        this.nameAssociationList = value;
    }

    /**
     * Gets the value of the segmentAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentAssociationListPNRB }
     *     
     */
    public SegmentAssociationListPNRB getSegmentAssociationList() {
        return segmentAssociationList;
    }

    /**
     * Sets the value of the segmentAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentAssociationListPNRB }
     *     
     */
    public void setSegmentAssociationList(SegmentAssociationListPNRB value) {
        this.segmentAssociationList = value;
    }

    /**
     * Gets the value of the actionCodeUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceActionCodeUpdatePNRB }
     *     
     */
    public AncillaryServiceActionCodeUpdatePNRB getActionCodeUpdate() {
        return actionCodeUpdate;
    }

    /**
     * Sets the value of the actionCodeUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceActionCodeUpdatePNRB }
     *     
     */
    public void setActionCodeUpdate(AncillaryServiceActionCodeUpdatePNRB value) {
        this.actionCodeUpdate = value;
    }

    /**
     * Gets the value of the seatRequestTransactionIDUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceSeatRequestTransactionIDUpdatePNRB }
     *     
     */
    public AncillaryServiceSeatRequestTransactionIDUpdatePNRB getSeatRequestTransactionIDUpdate() {
        return seatRequestTransactionIDUpdate;
    }

    /**
     * Sets the value of the seatRequestTransactionIDUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceSeatRequestTransactionIDUpdatePNRB }
     *     
     */
    public void setSeatRequestTransactionIDUpdate(AncillaryServiceSeatRequestTransactionIDUpdatePNRB value) {
        this.seatRequestTransactionIDUpdate = value;
    }

    /**
     * Gets the value of the emdNumberUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceEMDNumberUpdatePNRB }
     *     
     */
    public AncillaryServiceEMDNumberUpdatePNRB getEMDNumberUpdate() {
        return emdNumberUpdate;
    }

    /**
     * Sets the value of the emdNumberUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceEMDNumberUpdatePNRB }
     *     
     */
    public void setEMDNumberUpdate(AncillaryServiceEMDNumberUpdatePNRB value) {
        this.emdNumberUpdate = value;
    }

    /**
     * Gets the value of the eTicketNumberUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceETicketNumberUpdatePNRB }
     *     
     */
    public AncillaryServiceETicketNumberUpdatePNRB getETicketNumberUpdate() {
        return eTicketNumberUpdate;
    }

    /**
     * Sets the value of the eTicketNumberUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceETicketNumberUpdatePNRB }
     *     
     */
    public void setETicketNumberUpdate(AncillaryServiceETicketNumberUpdatePNRB value) {
        this.eTicketNumberUpdate = value;
    }

    /**
     * Gets the value of the pricingAndTaxesPartialUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link PricingAndTaxesPartialUpdateTypePNRB }
     *     
     */
    public PricingAndTaxesPartialUpdateTypePNRB getPricingAndTaxesPartialUpdate() {
        return pricingAndTaxesPartialUpdate;
    }

    /**
     * Sets the value of the pricingAndTaxesPartialUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingAndTaxesPartialUpdateTypePNRB }
     *     
     */
    public void setPricingAndTaxesPartialUpdate(PricingAndTaxesPartialUpdateTypePNRB value) {
        this.pricingAndTaxesPartialUpdate = value;
    }

    /**
     * Gets the value of the passengerTypeCodePartialUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServicePassengerTypeCodePartialUpdatePNRB }
     *     
     */
    public AncillaryServicePassengerTypeCodePartialUpdatePNRB getPassengerTypeCodePartialUpdate() {
        return passengerTypeCodePartialUpdate;
    }

    /**
     * Sets the value of the passengerTypeCodePartialUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServicePassengerTypeCodePartialUpdatePNRB }
     *     
     */
    public void setPassengerTypeCodePartialUpdate(AncillaryServicePassengerTypeCodePartialUpdatePNRB value) {
        this.passengerTypeCodePartialUpdate = value;
    }

    /**
     * Gets the value of the iataIndicatorPartialUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceIATAIndicatorPartialUpdatePNRB }
     *     
     */
    public AncillaryServiceIATAIndicatorPartialUpdatePNRB getIATAIndicatorPartialUpdate() {
        return iataIndicatorPartialUpdate;
    }

    /**
     * Sets the value of the iataIndicatorPartialUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceIATAIndicatorPartialUpdatePNRB }
     *     
     */
    public void setIATAIndicatorPartialUpdate(AncillaryServiceIATAIndicatorPartialUpdatePNRB value) {
        this.iataIndicatorPartialUpdate = value;
    }

    /**
     * Gets the value of the feeGuaranteePartialUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceFeeGuaranteePartialUpdatePNRB }
     *     
     */
    public AncillaryServiceFeeGuaranteePartialUpdatePNRB getFeeGuaranteePartialUpdate() {
        return feeGuaranteePartialUpdate;
    }

    /**
     * Sets the value of the feeGuaranteePartialUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceFeeGuaranteePartialUpdatePNRB }
     *     
     */
    public void setFeeGuaranteePartialUpdate(AncillaryServiceFeeGuaranteePartialUpdatePNRB value) {
        this.feeGuaranteePartialUpdate = value;
    }

    /**
     * Gets the value of the purchaseDateUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServicePurchaseDateUpdatePNRB }
     *     
     */
    public AncillaryServicePurchaseDateUpdatePNRB getPurchaseDateUpdate() {
        return purchaseDateUpdate;
    }

    /**
     * Sets the value of the purchaseDateUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServicePurchaseDateUpdatePNRB }
     *     
     */
    public void setPurchaseDateUpdate(AncillaryServicePurchaseDateUpdatePNRB value) {
        this.purchaseDateUpdate = value;
    }

    /**
     * Gets the value of the groupCodeAndRficSubcodeUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceGroupCodeAndRficSubcodeUpdatePNRB }
     *     
     */
    public AncillaryServiceGroupCodeAndRficSubcodeUpdatePNRB getGroupCodeAndRficSubcodeUpdate() {
        return groupCodeAndRficSubcodeUpdate;
    }

    /**
     * Sets the value of the groupCodeAndRficSubcodeUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceGroupCodeAndRficSubcodeUpdatePNRB }
     *     
     */
    public void setGroupCodeAndRficSubcodeUpdate(AncillaryServiceGroupCodeAndRficSubcodeUpdatePNRB value) {
        this.groupCodeAndRficSubcodeUpdate = value;
    }

    /**
     * Gets the value of the emdTypeUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceEMDTypeUpdatePNRB }
     *     
     */
    public AncillaryServiceEMDTypeUpdatePNRB getEMDTypeUpdate() {
        return emdTypeUpdate;
    }

    /**
     * Sets the value of the emdTypeUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceEMDTypeUpdatePNRB }
     *     
     */
    public void setEMDTypeUpdate(AncillaryServiceEMDTypeUpdatePNRB value) {
        this.emdTypeUpdate = value;
    }

    /**
     * Gets the value of the acsCountUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceAcsCountUpdatePNRB }
     *     
     */
    public AncillaryServiceAcsCountUpdatePNRB getAcsCountUpdate() {
        return acsCountUpdate;
    }

    /**
     * Sets the value of the acsCountUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceAcsCountUpdatePNRB }
     *     
     */
    public void setAcsCountUpdate(AncillaryServiceAcsCountUpdatePNRB value) {
        this.acsCountUpdate = value;
    }

    /**
     * Gets the value of the vendorCodeUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceVendorCodeUpdatePNRB }
     *     
     */
    public AncillaryServiceVendorCodeUpdatePNRB getVendorCodeUpdate() {
        return vendorCodeUpdate;
    }

    /**
     * Sets the value of the vendorCodeUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceVendorCodeUpdatePNRB }
     *     
     */
    public void setVendorCodeUpdate(AncillaryServiceVendorCodeUpdatePNRB value) {
        this.vendorCodeUpdate = value;
    }

    /**
     * Gets the value of the segmentAdvisoryList property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceAdvisorySegmentListPNRB }
     *     
     */
    public AncillaryServiceAdvisorySegmentListPNRB getSegmentAdvisoryList() {
        return segmentAdvisoryList;
    }

    /**
     * Sets the value of the segmentAdvisoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceAdvisorySegmentListPNRB }
     *     
     */
    public void setSegmentAdvisoryList(AncillaryServiceAdvisorySegmentListPNRB value) {
        this.segmentAdvisoryList = value;
    }

    /**
     * Gets the value of the aaPayOptionalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAaPayOptionalStatus() {
        return aaPayOptionalStatus;
    }

    /**
     * Sets the value of the aaPayOptionalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAaPayOptionalStatus(String value) {
        this.aaPayOptionalStatus = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setTaxExemption(IndicatorType value) {
        this.taxExemption = value;
    }

    /**
     * Gets the value of the pdcSeatUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServicePdcSeatPartialUpdatePNRB }
     *     
     */
    public AncillaryServicePdcSeatPartialUpdatePNRB getPdcSeatUpdate() {
        return pdcSeatUpdate;
    }

    /**
     * Sets the value of the pdcSeatUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServicePdcSeatPartialUpdatePNRB }
     *     
     */
    public void setPdcSeatUpdate(AncillaryServicePdcSeatPartialUpdatePNRB value) {
        this.pdcSeatUpdate = value;
    }

    /**
     * Gets the value of the ruleSetUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceRuleSetPartialUpdatePNRB }
     *     
     */
    public AncillaryServiceRuleSetPartialUpdatePNRB getRuleSetUpdate() {
        return ruleSetUpdate;
    }

    /**
     * Sets the value of the ruleSetUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceRuleSetPartialUpdatePNRB }
     *     
     */
    public void setRuleSetUpdate(AncillaryServiceRuleSetPartialUpdatePNRB value) {
        this.ruleSetUpdate = value;
    }

    /**
     * Gets the value of the aePortionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAePortionId() {
        return aePortionId;
    }

    /**
     * Sets the value of the aePortionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAePortionId(Integer value) {
        this.aePortionId = value;
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
