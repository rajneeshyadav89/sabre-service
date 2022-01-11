//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AccountingTransactionSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingTransactionSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SegmentData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FareComponent" type="{http://services.sabre.com/res/or/v1_14}FareComponent" minOccurs="0"/&gt;
 *                   &lt;element name="Segments" type="{http://services.sabre.com/res/or/v1_14}AccountingFieldSegmentOrTravelPortion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AncillaryServiceData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{http://services.sabre.com/res/or/v1_14}AccountingFieldAncillaryServicesDataGroup"/&gt;
 *                   &lt;element name="Segments" type="{http://services.sabre.com/res/or/v1_14}AccountingFieldSegmentOrTravelPortion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingTransactionSource", propOrder = {
    "segmentData",
    "ancillaryServiceData"
})
public class AccountingTransactionSource {

    @XmlElement(name = "SegmentData")
    protected AccountingTransactionSource.SegmentData segmentData;
    @XmlElement(name = "AncillaryServiceData")
    protected AccountingTransactionSource.AncillaryServiceData ancillaryServiceData;

    /**
     * Gets the value of the segmentData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionSource.SegmentData }
     *     
     */
    public AccountingTransactionSource.SegmentData getSegmentData() {
        return segmentData;
    }

    /**
     * Sets the value of the segmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionSource.SegmentData }
     *     
     */
    public void setSegmentData(AccountingTransactionSource.SegmentData value) {
        this.segmentData = value;
    }

    /**
     * Gets the value of the ancillaryServiceData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionSource.AncillaryServiceData }
     *     
     */
    public AccountingTransactionSource.AncillaryServiceData getAncillaryServiceData() {
        return ancillaryServiceData;
    }

    /**
     * Sets the value of the ancillaryServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionSource.AncillaryServiceData }
     *     
     */
    public void setAncillaryServiceData(AccountingTransactionSource.AncillaryServiceData value) {
        this.ancillaryServiceData = value;
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
     *         &lt;group ref="{http://services.sabre.com/res/or/v1_14}AccountingFieldAncillaryServicesDataGroup"/&gt;
     *         &lt;element name="Segments" type="{http://services.sabre.com/res/or/v1_14}AccountingFieldSegmentOrTravelPortion" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "commercialName",
        "rficCode",
        "rficSubcode",
        "ssrCode",
        "productTextDetails",
        "productText",
        "owningCarrierCode",
        "ssimCode",
        "bookingIndicator",
        "vendor",
        "emdType",
        "emdNumber",
        "emdCoupon",
        "eTicketNumber",
        "serviceFeeLineNumber",
        "displayOnlyIndicator",
        "consumptionIndicator",
        "presentTo",
        "atCity",
        "endorsements",
        "stationIndicator",
        "serviceCity",
        "serviceCityDestination",
        "serviceType",
        "ruleSet",
        "originalPrice",
        "newMiscIndicator",
        "groupCode",
        "segments"
    })
    public static class AncillaryServiceData {

        @XmlElement(name = "CommercialName")
        protected String commercialName;
        @XmlElement(name = "RficCode")
        protected String rficCode;
        @XmlElement(name = "RficSubcode", required = true)
        protected String rficSubcode;
        @XmlElement(name = "SSRCode")
        protected String ssrCode;
        @XmlElement(name = "ProductTextDetails")
        protected AccountingTransactionSource.AncillaryServiceData.ProductTextDetails productTextDetails;
        @XmlElement(name = "ProductText")
        protected String productText;
        @XmlElement(name = "OwningCarrierCode", required = true)
        protected String owningCarrierCode;
        @XmlElement(name = "SsimCode")
        protected String ssimCode;
        @XmlElement(name = "BookingIndicator")
        protected String bookingIndicator;
        @XmlElement(name = "Vendor")
        protected String vendor;
        @XmlElement(name = "EMDType")
        protected String emdType;
        @XmlElement(name = "EMDNumber")
        protected String emdNumber;
        @XmlElement(name = "EMDCoupon")
        protected String emdCoupon;
        @XmlElement(name = "ETicketNumber")
        protected AccountingFieldAncillaryETicketNumber eTicketNumber;
        @XmlElement(name = "ServiceFeeLineNumber")
        protected String serviceFeeLineNumber;
        @XmlElement(name = "DisplayOnlyIndicator")
        protected Boolean displayOnlyIndicator;
        @XmlElement(name = "ConsumptionIndicator")
        protected String consumptionIndicator;
        @XmlElement(name = "PresentTo")
        protected String presentTo;
        @XmlElement(name = "AtCity")
        protected String atCity;
        @XmlElement(name = "Endorsements")
        protected String endorsements;
        @XmlElement(name = "StationIndicator")
        protected String stationIndicator;
        @XmlElement(name = "ServiceCity")
        protected String serviceCity;
        @XmlElement(name = "ServiceCityDestination")
        protected String serviceCityDestination;
        @XmlElement(name = "ServiceType")
        protected String serviceType;
        @XmlElement(name = "RuleSet")
        protected AccountingTransactionSource.AncillaryServiceData.RuleSet ruleSet;
        @XmlElement(name = "OriginalPrice")
        protected AccountingTransactionSource.AncillaryServiceData.OriginalPrice originalPrice;
        @XmlElement(name = "NewMiscIndicator")
        protected Byte newMiscIndicator;
        @XmlElement(name = "GroupCode")
        protected String groupCode;
        @XmlElement(name = "Segments")
        protected List<AccountingFieldSegmentOrTravelPortion> segments;

        /**
         * Gets the value of the commercialName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommercialName() {
            return commercialName;
        }

        /**
         * Sets the value of the commercialName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommercialName(String value) {
            this.commercialName = value;
        }

        /**
         * Gets the value of the rficCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRficCode() {
            return rficCode;
        }

        /**
         * Sets the value of the rficCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRficCode(String value) {
            this.rficCode = value;
        }

        /**
         * Gets the value of the rficSubcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRficSubcode() {
            return rficSubcode;
        }

        /**
         * Sets the value of the rficSubcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRficSubcode(String value) {
            this.rficSubcode = value;
        }

        /**
         * Gets the value of the ssrCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSSRCode() {
            return ssrCode;
        }

        /**
         * Sets the value of the ssrCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSSRCode(String value) {
            this.ssrCode = value;
        }

        /**
         * Gets the value of the productTextDetails property.
         * 
         * @return
         *     possible object is
         *     {@link AccountingTransactionSource.AncillaryServiceData.ProductTextDetails }
         *     
         */
        public AccountingTransactionSource.AncillaryServiceData.ProductTextDetails getProductTextDetails() {
            return productTextDetails;
        }

        /**
         * Sets the value of the productTextDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountingTransactionSource.AncillaryServiceData.ProductTextDetails }
         *     
         */
        public void setProductTextDetails(AccountingTransactionSource.AncillaryServiceData.ProductTextDetails value) {
            this.productTextDetails = value;
        }

        /**
         * Gets the value of the productText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductText() {
            return productText;
        }

        /**
         * Sets the value of the productText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductText(String value) {
            this.productText = value;
        }

        /**
         * Gets the value of the owningCarrierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwningCarrierCode() {
            return owningCarrierCode;
        }

        /**
         * Sets the value of the owningCarrierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwningCarrierCode(String value) {
            this.owningCarrierCode = value;
        }

        /**
         * Gets the value of the ssimCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSsimCode() {
            return ssimCode;
        }

        /**
         * Sets the value of the ssimCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSsimCode(String value) {
            this.ssimCode = value;
        }

        /**
         * Gets the value of the bookingIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingIndicator() {
            return bookingIndicator;
        }

        /**
         * Sets the value of the bookingIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingIndicator(String value) {
            this.bookingIndicator = value;
        }

        /**
         * Gets the value of the vendor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendor() {
            return vendor;
        }

        /**
         * Sets the value of the vendor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendor(String value) {
            this.vendor = value;
        }

        /**
         * Gets the value of the emdType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMDType() {
            return emdType;
        }

        /**
         * Sets the value of the emdType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMDType(String value) {
            this.emdType = value;
        }

        /**
         * Gets the value of the emdNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMDNumber() {
            return emdNumber;
        }

        /**
         * Sets the value of the emdNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMDNumber(String value) {
            this.emdNumber = value;
        }

        /**
         * Gets the value of the emdCoupon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMDCoupon() {
            return emdCoupon;
        }

        /**
         * Sets the value of the emdCoupon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMDCoupon(String value) {
            this.emdCoupon = value;
        }

        /**
         * Gets the value of the eTicketNumber property.
         * 
         * @return
         *     possible object is
         *     {@link AccountingFieldAncillaryETicketNumber }
         *     
         */
        public AccountingFieldAncillaryETicketNumber getETicketNumber() {
            return eTicketNumber;
        }

        /**
         * Sets the value of the eTicketNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountingFieldAncillaryETicketNumber }
         *     
         */
        public void setETicketNumber(AccountingFieldAncillaryETicketNumber value) {
            this.eTicketNumber = value;
        }

        /**
         * Gets the value of the serviceFeeLineNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceFeeLineNumber() {
            return serviceFeeLineNumber;
        }

        /**
         * Sets the value of the serviceFeeLineNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceFeeLineNumber(String value) {
            this.serviceFeeLineNumber = value;
        }

        /**
         * Gets the value of the displayOnlyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDisplayOnlyIndicator() {
            return displayOnlyIndicator;
        }

        /**
         * Sets the value of the displayOnlyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDisplayOnlyIndicator(Boolean value) {
            this.displayOnlyIndicator = value;
        }

        /**
         * Gets the value of the consumptionIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsumptionIndicator() {
            return consumptionIndicator;
        }

        /**
         * Sets the value of the consumptionIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsumptionIndicator(String value) {
            this.consumptionIndicator = value;
        }

        /**
         * Gets the value of the presentTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPresentTo() {
            return presentTo;
        }

        /**
         * Sets the value of the presentTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPresentTo(String value) {
            this.presentTo = value;
        }

        /**
         * Gets the value of the atCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtCity() {
            return atCity;
        }

        /**
         * Sets the value of the atCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtCity(String value) {
            this.atCity = value;
        }

        /**
         * Gets the value of the endorsements property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndorsements() {
            return endorsements;
        }

        /**
         * Sets the value of the endorsements property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndorsements(String value) {
            this.endorsements = value;
        }

        /**
         * Gets the value of the stationIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStationIndicator() {
            return stationIndicator;
        }

        /**
         * Sets the value of the stationIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStationIndicator(String value) {
            this.stationIndicator = value;
        }

        /**
         * Gets the value of the serviceCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceCity() {
            return serviceCity;
        }

        /**
         * Sets the value of the serviceCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceCity(String value) {
            this.serviceCity = value;
        }

        /**
         * Gets the value of the serviceCityDestination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceCityDestination() {
            return serviceCityDestination;
        }

        /**
         * Sets the value of the serviceCityDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceCityDestination(String value) {
            this.serviceCityDestination = value;
        }

        /**
         * Gets the value of the serviceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceType(String value) {
            this.serviceType = value;
        }

        /**
         * Gets the value of the ruleSet property.
         * 
         * @return
         *     possible object is
         *     {@link AccountingTransactionSource.AncillaryServiceData.RuleSet }
         *     
         */
        public AccountingTransactionSource.AncillaryServiceData.RuleSet getRuleSet() {
            return ruleSet;
        }

        /**
         * Sets the value of the ruleSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountingTransactionSource.AncillaryServiceData.RuleSet }
         *     
         */
        public void setRuleSet(AccountingTransactionSource.AncillaryServiceData.RuleSet value) {
            this.ruleSet = value;
        }

        /**
         * Gets the value of the originalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link AccountingTransactionSource.AncillaryServiceData.OriginalPrice }
         *     
         */
        public AccountingTransactionSource.AncillaryServiceData.OriginalPrice getOriginalPrice() {
            return originalPrice;
        }

        /**
         * Sets the value of the originalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountingTransactionSource.AncillaryServiceData.OriginalPrice }
         *     
         */
        public void setOriginalPrice(AccountingTransactionSource.AncillaryServiceData.OriginalPrice value) {
            this.originalPrice = value;
        }

        /**
         * Gets the value of the newMiscIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getNewMiscIndicator() {
            return newMiscIndicator;
        }

        /**
         * Sets the value of the newMiscIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setNewMiscIndicator(Byte value) {
            this.newMiscIndicator = value;
        }

        /**
         * Gets the value of the groupCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * Sets the value of the groupCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
        }

        /**
         * Gets the value of the segments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountingFieldSegmentOrTravelPortion }
         * 
         * 
         */
        public List<AccountingFieldSegmentOrTravelPortion> getSegments() {
            if (segments == null) {
                segments = new ArrayList<AccountingFieldSegmentOrTravelPortion>();
            }
            return this.segments;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
         *       &lt;attribute name="WaiverCode" use="required" type="{http://services.sabre.com/res/or/v1_14}StringLength1to10" /&gt;
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
        public static class OriginalPrice {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "WaiverCode", required = true)
            protected String waiverCode;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the waiverCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWaiverCode() {
                return waiverCode;
            }

            /**
             * Sets the value of the waiverCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWaiverCode(String value) {
                this.waiverCode = value;
            }

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
         *         &lt;element name="ProductTextDetailsItem" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="ItemName" use="required" type="{http://services.sabre.com/res/or/v1_14}CommonString" /&gt;
         *                 &lt;attribute name="ItemValue" use="required" type="{http://services.sabre.com/res/or/v1_14}CommonString" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
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
        @XmlType(name = "", propOrder = {
            "productTextDetailsItem"
        })
        public static class ProductTextDetails {

            @XmlElement(name = "ProductTextDetailsItem")
            protected List<AccountingTransactionSource.AncillaryServiceData.ProductTextDetails.ProductTextDetailsItem> productTextDetailsItem;

            /**
             * Gets the value of the productTextDetailsItem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the productTextDetailsItem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProductTextDetailsItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AccountingTransactionSource.AncillaryServiceData.ProductTextDetails.ProductTextDetailsItem }
             * 
             * 
             */
            public List<AccountingTransactionSource.AncillaryServiceData.ProductTextDetails.ProductTextDetailsItem> getProductTextDetailsItem() {
                if (productTextDetailsItem == null) {
                    productTextDetailsItem = new ArrayList<AccountingTransactionSource.AncillaryServiceData.ProductTextDetails.ProductTextDetailsItem>();
                }
                return this.productTextDetailsItem;
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
             *       &lt;attribute name="ItemName" use="required" type="{http://services.sabre.com/res/or/v1_14}CommonString" /&gt;
             *       &lt;attribute name="ItemValue" use="required" type="{http://services.sabre.com/res/or/v1_14}CommonString" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ProductTextDetailsItem {

                @XmlAttribute(name = "ItemName", required = true)
                protected String itemName;
                @XmlAttribute(name = "ItemValue", required = true)
                protected String itemValue;

                /**
                 * Gets the value of the itemName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemName() {
                    return itemName;
                }

                /**
                 * Sets the value of the itemName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemName(String value) {
                    this.itemName = value;
                }

                /**
                 * Gets the value of the itemValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemValue() {
                    return itemValue;
                }

                /**
                 * Sets the value of the itemValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemValue(String value) {
                    this.itemValue = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://services.sabre.com/res/or/v1_14&gt;StringLength1to20"&gt;
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
     *         &lt;element name="FareComponent" type="{http://services.sabre.com/res/or/v1_14}FareComponent" minOccurs="0"/&gt;
     *         &lt;element name="Segments" type="{http://services.sabre.com/res/or/v1_14}AccountingFieldSegmentOrTravelPortion" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "fareComponent",
        "segments"
    })
    public static class SegmentData {

        @XmlElement(name = "FareComponent")
        protected FareComponent fareComponent;
        @XmlElement(name = "Segments")
        protected List<AccountingFieldSegmentOrTravelPortion> segments;

        /**
         * Gets the value of the fareComponent property.
         * 
         * @return
         *     possible object is
         *     {@link FareComponent }
         *     
         */
        public FareComponent getFareComponent() {
            return fareComponent;
        }

        /**
         * Sets the value of the fareComponent property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareComponent }
         *     
         */
        public void setFareComponent(FareComponent value) {
            this.fareComponent = value;
        }

        /**
         * Gets the value of the segments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountingFieldSegmentOrTravelPortion }
         * 
         * 
         */
        public List<AccountingFieldSegmentOrTravelPortion> getSegments() {
            if (segments == null) {
                segments = new ArrayList<AccountingFieldSegmentOrTravelPortion>();
            }
            return this.segments;
        }

    }

}
