//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OptionalAncillaryServicesInformationData.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionalAncillaryServicesInformationData.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://webservices.sabre.com/pnrbuilder/v1_19}OptionalAncillaryServicesInformationDataGroup.PNRB"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalAncillaryServicesInformationData.PNRB", propOrder = {
    "quantity",
    "segmentNumber",
    "equivalentPrice",
    "ttlPrice",
    "portionOfTravelIndicator",
    "originalBasePrice",
    "refundIndicator",
    "commisionIndicator",
    "interlineIndicator",
    "feeApplicationIndicator",
    "passengerTypeCode",
    "boardPoint",
    "offPoint",
    "taxesIncluded",
    "taxes",
    "softMatchIndicator",
    "noChargeNotAvailIndicator",
    "ticketCouponNumberAssociation",
    "simultaneousTicketIndicator",
    "formOfRefund",
    "feeNotGuaranteedIndicator",
    "fqtvTierLevel",
    "tourCodeSHC",
    "travelDateEffective",
    "latestTravelDatePermitted",
    "purchaseByDate",
    "totalOriginalBasePrice",
    "totalEquivalentPrice",
    "totalTTLPrice",
    "totalTaxes",
    "taxExemptIndicator",
    "bagWeight",
    "fareCalculationModeIndicator",
    "fareCalculationPriceIndicator",
    "bagOccurence"
})
public class OptionalAncillaryServicesInformationDataPNRB {

    @XmlElement(name = "Quantity")
    protected BigInteger quantity;
    @XmlElement(name = "SegmentNumber", type = Byte.class)
    protected List<Byte> segmentNumber;
    @XmlElement(name = "EquivalentPrice")
    protected AncillaryPricePNRB equivalentPrice;
    @XmlElement(name = "TTLPrice")
    protected AncillaryPricePNRB ttlPrice;
    @XmlElement(name = "PortionOfTravelIndicator")
    protected String portionOfTravelIndicator;
    @XmlElement(name = "OriginalBasePrice")
    protected AncillaryPricePNRB originalBasePrice;
    @XmlElement(name = "RefundIndicator")
    protected String refundIndicator;
    @XmlElement(name = "CommisionIndicator")
    protected String commisionIndicator;
    @XmlElement(name = "InterlineIndicator")
    protected String interlineIndicator;
    @XmlElement(name = "FeeApplicationIndicator")
    protected String feeApplicationIndicator;
    @XmlElement(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlElement(name = "BoardPoint")
    protected String boardPoint;
    @XmlElement(name = "OffPoint")
    protected String offPoint;
    @XmlElement(name = "TaxesIncluded")
    protected Boolean taxesIncluded;
    @XmlElement(name = "Taxes")
    protected com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.Taxes taxes;
    @XmlElement(name = "SoftMatchIndicator")
    protected Boolean softMatchIndicator;
    @XmlElement(name = "NoChargeNotAvailIndicator")
    protected String noChargeNotAvailIndicator;
    @XmlElement(name = "TicketCouponNumberAssociation")
    protected List<com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.TicketCouponNumberAssociation> ticketCouponNumberAssociation;
    @XmlElement(name = "SimultaneousTicketIndicator")
    protected String simultaneousTicketIndicator;
    @XmlElement(name = "FormOfRefund")
    protected String formOfRefund;
    @XmlElement(name = "FeeNotGuaranteedIndicator")
    protected Boolean feeNotGuaranteedIndicator;
    @XmlElement(name = "FQTVTierLevel")
    protected Short fqtvTierLevel;
    @XmlElement(name = "TourCodeSHC")
    protected String tourCodeSHC;
    @XmlElement(name = "TravelDateEffective")
    protected String travelDateEffective;
    @XmlElement(name = "LatestTravelDatePermitted")
    protected String latestTravelDatePermitted;
    @XmlElement(name = "PurchaseByDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchaseByDate;
    @XmlElement(name = "TotalOriginalBasePrice")
    protected AncillaryPricePNRB totalOriginalBasePrice;
    @XmlElement(name = "TotalEquivalentPrice")
    protected AncillaryPricePNRB totalEquivalentPrice;
    @XmlElement(name = "TotalTTLPrice")
    protected AncillaryPricePNRB totalTTLPrice;
    @XmlElement(name = "TotalTaxes")
    protected com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.TotalTaxes totalTaxes;
    @XmlElement(name = "TaxExemptIndicator")
    protected String taxExemptIndicator;
    @XmlElement(name = "BagWeight")
    protected com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.BagWeight bagWeight;
    @XmlElement(name = "FareCalculationModeIndicator")
    protected Integer fareCalculationModeIndicator;
    @XmlElement(name = "FareCalculationPriceIndicator")
    protected String fareCalculationPriceIndicator;
    @XmlElement(name = "BagOccurence")
    protected BigInteger bagOccurence;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the segmentNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * 
     * 
     */
    public List<Byte> getSegmentNumber() {
        if (segmentNumber == null) {
            segmentNumber = new ArrayList<Byte>();
        }
        return this.segmentNumber;
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
     * Gets the value of the portionOfTravelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortionOfTravelIndicator() {
        return portionOfTravelIndicator;
    }

    /**
     * Sets the value of the portionOfTravelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortionOfTravelIndicator(String value) {
        this.portionOfTravelIndicator = value;
    }

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
     * Gets the value of the refundIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundIndicator() {
        return refundIndicator;
    }

    /**
     * Sets the value of the refundIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundIndicator(String value) {
        this.refundIndicator = value;
    }

    /**
     * Gets the value of the commisionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommisionIndicator() {
        return commisionIndicator;
    }

    /**
     * Sets the value of the commisionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommisionIndicator(String value) {
        this.commisionIndicator = value;
    }

    /**
     * Gets the value of the interlineIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterlineIndicator() {
        return interlineIndicator;
    }

    /**
     * Sets the value of the interlineIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterlineIndicator(String value) {
        this.interlineIndicator = value;
    }

    /**
     * Gets the value of the feeApplicationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeApplicationIndicator() {
        return feeApplicationIndicator;
    }

    /**
     * Sets the value of the feeApplicationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeApplicationIndicator(String value) {
        this.feeApplicationIndicator = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the boardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * Sets the value of the boardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * Gets the value of the taxesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxesIncluded() {
        return taxesIncluded;
    }

    /**
     * Sets the value of the taxesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxesIncluded(Boolean value) {
        this.taxesIncluded = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.Taxes }
     *     
     */
    public com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.Taxes }
     *     
     */
    public void setTaxes(com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the softMatchIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoftMatchIndicator() {
        return softMatchIndicator;
    }

    /**
     * Sets the value of the softMatchIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoftMatchIndicator(Boolean value) {
        this.softMatchIndicator = value;
    }

    /**
     * Gets the value of the noChargeNotAvailIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoChargeNotAvailIndicator() {
        return noChargeNotAvailIndicator;
    }

    /**
     * Sets the value of the noChargeNotAvailIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoChargeNotAvailIndicator(String value) {
        this.noChargeNotAvailIndicator = value;
    }

    /**
     * Gets the value of the ticketCouponNumberAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketCouponNumberAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketCouponNumberAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.TicketCouponNumberAssociation }
     * 
     * 
     */
    public List<com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.TicketCouponNumberAssociation> getTicketCouponNumberAssociation() {
        if (ticketCouponNumberAssociation == null) {
            ticketCouponNumberAssociation = new ArrayList<com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.TicketCouponNumberAssociation>();
        }
        return this.ticketCouponNumberAssociation;
    }

    /**
     * Gets the value of the simultaneousTicketIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimultaneousTicketIndicator() {
        return simultaneousTicketIndicator;
    }

    /**
     * Sets the value of the simultaneousTicketIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimultaneousTicketIndicator(String value) {
        this.simultaneousTicketIndicator = value;
    }

    /**
     * Gets the value of the formOfRefund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * Sets the value of the formOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfRefund(String value) {
        this.formOfRefund = value;
    }

    /**
     * Gets the value of the feeNotGuaranteedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeeNotGuaranteedIndicator() {
        return feeNotGuaranteedIndicator;
    }

    /**
     * Sets the value of the feeNotGuaranteedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeeNotGuaranteedIndicator(Boolean value) {
        this.feeNotGuaranteedIndicator = value;
    }

    /**
     * Gets the value of the fqtvTierLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFQTVTierLevel() {
        return fqtvTierLevel;
    }

    /**
     * Sets the value of the fqtvTierLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFQTVTierLevel(Short value) {
        this.fqtvTierLevel = value;
    }

    /**
     * Gets the value of the tourCodeSHC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCodeSHC() {
        return tourCodeSHC;
    }

    /**
     * Sets the value of the tourCodeSHC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCodeSHC(String value) {
        this.tourCodeSHC = value;
    }

    /**
     * Gets the value of the travelDateEffective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDateEffective() {
        return travelDateEffective;
    }

    /**
     * Sets the value of the travelDateEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDateEffective(String value) {
        this.travelDateEffective = value;
    }

    /**
     * Gets the value of the latestTravelDatePermitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTravelDatePermitted() {
        return latestTravelDatePermitted;
    }

    /**
     * Sets the value of the latestTravelDatePermitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTravelDatePermitted(String value) {
        this.latestTravelDatePermitted = value;
    }

    /**
     * Gets the value of the purchaseByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseByDate() {
        return purchaseByDate;
    }

    /**
     * Sets the value of the purchaseByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseByDate(XMLGregorianCalendar value) {
        this.purchaseByDate = value;
    }

    /**
     * Gets the value of the totalOriginalBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public AncillaryPricePNRB getTotalOriginalBasePrice() {
        return totalOriginalBasePrice;
    }

    /**
     * Sets the value of the totalOriginalBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public void setTotalOriginalBasePrice(AncillaryPricePNRB value) {
        this.totalOriginalBasePrice = value;
    }

    /**
     * Gets the value of the totalEquivalentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public AncillaryPricePNRB getTotalEquivalentPrice() {
        return totalEquivalentPrice;
    }

    /**
     * Sets the value of the totalEquivalentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public void setTotalEquivalentPrice(AncillaryPricePNRB value) {
        this.totalEquivalentPrice = value;
    }

    /**
     * Gets the value of the totalTTLPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public AncillaryPricePNRB getTotalTTLPrice() {
        return totalTTLPrice;
    }

    /**
     * Sets the value of the totalTTLPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryPricePNRB }
     *     
     */
    public void setTotalTTLPrice(AncillaryPricePNRB value) {
        this.totalTTLPrice = value;
    }

    /**
     * Gets the value of the totalTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.TotalTaxes }
     *     
     */
    public com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.TotalTaxes getTotalTaxes() {
        return totalTaxes;
    }

    /**
     * Sets the value of the totalTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.TotalTaxes }
     *     
     */
    public void setTotalTaxes(com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.TotalTaxes value) {
        this.totalTaxes = value;
    }

    /**
     * Gets the value of the taxExemptIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptIndicator() {
        return taxExemptIndicator;
    }

    /**
     * Sets the value of the taxExemptIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptIndicator(String value) {
        this.taxExemptIndicator = value;
    }

    /**
     * Gets the value of the bagWeight property.
     * 
     * @return
     *     possible object is
     *     {@link com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.BagWeight }
     *     
     */
    public com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.BagWeight getBagWeight() {
        return bagWeight;
    }

    /**
     * Sets the value of the bagWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.BagWeight }
     *     
     */
    public void setBagWeight(com.sabre.webservices.pnrbuilder.v1_19.AncillaryServicesPNRB.BagWeight value) {
        this.bagWeight = value;
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
     * Gets the value of the bagOccurence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBagOccurence() {
        return bagOccurence;
    }

    /**
     * Sets the value of the bagOccurence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBagOccurence(BigInteger value) {
        this.bagOccurence = value;
    }

}