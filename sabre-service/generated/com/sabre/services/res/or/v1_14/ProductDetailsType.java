//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sabre.webservices.pnrbuilder.v1_19.ProductDetailsHistoryType;


/**
 * <p>Java class for ProductDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductName" type="{http://services.sabre.com/res/or/v1_14}ProductNameType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Hotel" type="{http://services.sabre.com/res/or/v1_14}HotelProductType"/&gt;
 *           &lt;element name="Lodging" type="{http://services.sabre.com/res/or/v1_14}LodgingProductType"/&gt;
 *           &lt;element name="GroundTransportation" type="{http://services.sabre.com/res/or/v1_14}GroundTransportationType"/&gt;
 *           &lt;element name="Rail" type="{http://services.sabre.com/res/or/v1_14}RailType"/&gt;
 *           &lt;element name="Tour" type="{http://services.sabre.com/res/or/v1_14}TourType"/&gt;
 *           &lt;element name="Air" type="{http://services.sabre.com/res/or/v1_14}AirType"/&gt;
 *           &lt;element name="Visa" type="{http://services.sabre.com/res/or/v1_14}VisaType"/&gt;
 *           &lt;element name="Vehicle" type="{http://services.sabre.com/res/or/v1_14}VehicleType"/&gt;
 *           &lt;element name="Ski" type="{http://services.sabre.com/res/or/v1_14}SkiType"/&gt;
 *           &lt;element name="Other" type="{http://services.sabre.com/res/or/v1_14}OtherType"/&gt;
 *           &lt;element name="Insurance" type="{http://services.sabre.com/res/or/v1_14}InsuranceType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ExternalSystemReference" type="{http://services.sabre.com/res/or/v1_14}ExternalSystemReferenceType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="TransactionInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RequestorInfo" type="{http://services.sabre.com/res/or/v1_14}RequestorSourceType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LastUpdateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillingInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CO2Value" type="{http://services.sabre.com/res/or/v1_14}CO2ValueType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://services.sabre.com/res/or/v1_14}SegmentCommonAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailsType", propOrder = {
    "productName",
    "hotel",
    "lodging",
    "groundTransportation",
    "rail",
    "tour",
    "air",
    "visa",
    "vehicle",
    "ski",
    "other",
    "insurance",
    "externalSystemReference",
    "transactionInfo",
    "billingInfo",
    "co2Value",
    "comment"
})
@XmlSeeAlso({
    ProductDetailsHistoryType.class
})
public class ProductDetailsType {

    @XmlElement(name = "ProductName", required = true)
    protected ProductNameType productName;
    @XmlElement(name = "Hotel")
    protected HotelProductType hotel;
    @XmlElement(name = "Lodging")
    protected LodgingProductType lodging;
    @XmlElement(name = "GroundTransportation")
    protected GroundTransportationType groundTransportation;
    @XmlElement(name = "Rail")
    protected RailType rail;
    @XmlElement(name = "Tour")
    protected TourType tour;
    @XmlElement(name = "Air")
    protected AirType air;
    @XmlElement(name = "Visa")
    protected VisaType visa;
    @XmlElement(name = "Vehicle")
    protected VehicleType vehicle;
    @XmlElement(name = "Ski")
    protected SkiType ski;
    @XmlElement(name = "Other")
    protected OtherType other;
    @XmlElement(name = "Insurance")
    protected InsuranceType insurance;
    @XmlElement(name = "ExternalSystemReference")
    protected List<ExternalSystemReferenceType> externalSystemReference;
    @XmlElement(name = "TransactionInfo")
    protected ProductDetailsType.TransactionInfo transactionInfo;
    @XmlElement(name = "BillingInfo")
    protected ProductDetailsType.BillingInfo billingInfo;
    @XmlElement(name = "CO2Value")
    protected CO2ValueType co2Value;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlAttribute(name = "productCategory")
    protected String productCategory;
    @XmlAttribute(name = "productType")
    protected String productType;
    @XmlAttribute(name = "vendorCode")
    protected String vendorCode;
    @XmlAttribute(name = "statusCode")
    protected String statusCode;
    @XmlAttribute(name = "previousStatusCode")
    protected String previousStatusCode;
    @XmlAttribute(name = "startPoint")
    protected String startPoint;
    @XmlAttribute(name = "startDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlAttribute(name = "endPoint")
    protected String endPoint;
    @XmlAttribute(name = "endDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlAttribute(name = "normalizedIndicator")
    protected Boolean normalizedIndicator;
    @XmlAttribute(name = "numberInParty")
    protected BigInteger numberInParty;
    @XmlAttribute(name = "vendorName")
    protected String vendorName;
    @XmlAttribute(name = "supplierName")
    protected String supplierName;
    @XmlAttribute(name = "supplierCode")
    protected String supplierCode;

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link ProductNameType }
     *     
     */
    public ProductNameType getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductNameType }
     *     
     */
    public void setProductName(ProductNameType value) {
        this.productName = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProductType }
     *     
     */
    public HotelProductType getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProductType }
     *     
     */
    public void setHotel(HotelProductType value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the lodging property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingProductType }
     *     
     */
    public LodgingProductType getLodging() {
        return lodging;
    }

    /**
     * Sets the value of the lodging property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingProductType }
     *     
     */
    public void setLodging(LodgingProductType value) {
        this.lodging = value;
    }

    /**
     * Gets the value of the groundTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link GroundTransportationType }
     *     
     */
    public GroundTransportationType getGroundTransportation() {
        return groundTransportation;
    }

    /**
     * Sets the value of the groundTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroundTransportationType }
     *     
     */
    public void setGroundTransportation(GroundTransportationType value) {
        this.groundTransportation = value;
    }

    /**
     * Gets the value of the rail property.
     * 
     * @return
     *     possible object is
     *     {@link RailType }
     *     
     */
    public RailType getRail() {
        return rail;
    }

    /**
     * Sets the value of the rail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailType }
     *     
     */
    public void setRail(RailType value) {
        this.rail = value;
    }

    /**
     * Gets the value of the tour property.
     * 
     * @return
     *     possible object is
     *     {@link TourType }
     *     
     */
    public TourType getTour() {
        return tour;
    }

    /**
     * Sets the value of the tour property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourType }
     *     
     */
    public void setTour(TourType value) {
        this.tour = value;
    }

    /**
     * Gets the value of the air property.
     * 
     * @return
     *     possible object is
     *     {@link AirType }
     *     
     */
    public AirType getAir() {
        return air;
    }

    /**
     * Sets the value of the air property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirType }
     *     
     */
    public void setAir(AirType value) {
        this.air = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link VisaType }
     *     
     */
    public VisaType getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaType }
     *     
     */
    public void setVisa(VisaType value) {
        this.visa = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType }
     *     
     */
    public VehicleType getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType }
     *     
     */
    public void setVehicle(VehicleType value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the ski property.
     * 
     * @return
     *     possible object is
     *     {@link SkiType }
     *     
     */
    public SkiType getSki() {
        return ski;
    }

    /**
     * Sets the value of the ski property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkiType }
     *     
     */
    public void setSki(SkiType value) {
        this.ski = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link OtherType }
     *     
     */
    public OtherType getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherType }
     *     
     */
    public void setOther(OtherType value) {
        this.other = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceType }
     *     
     */
    public InsuranceType getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceType }
     *     
     */
    public void setInsurance(InsuranceType value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the externalSystemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalSystemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalSystemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalSystemReferenceType }
     * 
     * 
     */
    public List<ExternalSystemReferenceType> getExternalSystemReference() {
        if (externalSystemReference == null) {
            externalSystemReference = new ArrayList<ExternalSystemReferenceType>();
        }
        return this.externalSystemReference;
    }

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsType.TransactionInfo }
     *     
     */
    public ProductDetailsType.TransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsType.TransactionInfo }
     *     
     */
    public void setTransactionInfo(ProductDetailsType.TransactionInfo value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the billingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsType.BillingInfo }
     *     
     */
    public ProductDetailsType.BillingInfo getBillingInfo() {
        return billingInfo;
    }

    /**
     * Sets the value of the billingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsType.BillingInfo }
     *     
     */
    public void setBillingInfo(ProductDetailsType.BillingInfo value) {
        this.billingInfo = value;
    }

    /**
     * Gets the value of the co2Value property.
     * 
     * @return
     *     possible object is
     *     {@link CO2ValueType }
     *     
     */
    public CO2ValueType getCO2Value() {
        return co2Value;
    }

    /**
     * Sets the value of the co2Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CO2ValueType }
     *     
     */
    public void setCO2Value(CO2ValueType value) {
        this.co2Value = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the previousStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousStatusCode() {
        return previousStatusCode;
    }

    /**
     * Sets the value of the previousStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousStatusCode(String value) {
        this.previousStatusCode = value;
    }

    /**
     * Gets the value of the startPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPoint() {
        return startPoint;
    }

    /**
     * Sets the value of the startPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPoint(String value) {
        this.startPoint = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the normalizedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNormalizedIndicator() {
        return normalizedIndicator;
    }

    /**
     * Sets the value of the normalizedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNormalizedIndicator(Boolean value) {
        this.normalizedIndicator = value;
    }

    /**
     * Gets the value of the numberInParty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberInParty() {
        return numberInParty;
    }

    /**
     * Sets the value of the numberInParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberInParty(BigInteger value) {
        this.numberInParty = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the supplierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
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
     *         &lt;element name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "billingCode"
    })
    public static class BillingInfo {

        @XmlElement(name = "BillingCode", required = true)
        protected String billingCode;

        /**
         * Gets the value of the billingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingCode() {
            return billingCode;
        }

        /**
         * Sets the value of the billingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingCode(String value) {
            this.billingCode = value;
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
     *         &lt;element name="RequestorInfo" type="{http://services.sabre.com/res/or/v1_14}RequestorSourceType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LastUpdateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requestorInfo"
    })
    public static class TransactionInfo {

        @XmlElement(name = "RequestorInfo", required = true)
        protected RequestorSourceType requestorInfo;
        @XmlAttribute(name = "LastUpdateTimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdateTimeStamp;

        /**
         * Gets the value of the requestorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link RequestorSourceType }
         *     
         */
        public RequestorSourceType getRequestorInfo() {
            return requestorInfo;
        }

        /**
         * Sets the value of the requestorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestorSourceType }
         *     
         */
        public void setRequestorInfo(RequestorSourceType value) {
            this.requestorInfo = value;
        }

        /**
         * Gets the value of the lastUpdateTimeStamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdateTimeStamp() {
            return lastUpdateTimeStamp;
        }

        /**
         * Sets the value of the lastUpdateTimeStamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdateTimeStamp(XMLGregorianCalendar value) {
            this.lastUpdateTimeStamp = value;
        }

    }

}
