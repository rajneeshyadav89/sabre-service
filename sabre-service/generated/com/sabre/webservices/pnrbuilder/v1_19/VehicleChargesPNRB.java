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
import javax.xml.bind.annotation.XmlType;


/**
 * Information on the charges associated with this vehicle. Such charges may include the
 *                 base rental amount, additional mileage amounts, fuel costs, etc.
 *             
 * 
 * <p>Java class for VehicleCharges.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleCharges.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehicleChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApproximateTotalChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApproximateChargeDetails" type="{http://webservices.sabre.com/pnrbuilder/v1_19}ApproximateChargeDetails.PNRB" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApproximateTotalChargeRateType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NumDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mileage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalMandatoryCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DropOffCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DropOffDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCharges.PNRB", propOrder = {
    "vehicleChargeAmount",
    "approximateTotalChargeAmount",
    "approximateChargeDetails",
    "approximateTotalChargeRateType",
    "numDays",
    "numHours",
    "mileage",
    "totalMandatoryCharges",
    "dropOffCharge",
    "dropOffDecimalPlaces",
    "guaranteedInd"
})
public class VehicleChargesPNRB {

    @XmlElement(name = "VehicleChargeAmount")
    protected List<String> vehicleChargeAmount;
    @XmlElement(name = "ApproximateTotalChargeAmount")
    protected List<String> approximateTotalChargeAmount;
    @XmlElement(name = "ApproximateChargeDetails")
    protected List<ApproximateChargeDetailsPNRB> approximateChargeDetails;
    @XmlElement(name = "ApproximateTotalChargeRateType")
    protected List<String> approximateTotalChargeRateType;
    @XmlElement(name = "NumDays")
    protected String numDays;
    @XmlElement(name = "NumHours")
    protected String numHours;
    @XmlElement(name = "Mileage")
    protected String mileage;
    @XmlElement(name = "TotalMandatoryCharges")
    protected String totalMandatoryCharges;
    @XmlElement(name = "DropOffCharge")
    protected String dropOffCharge;
    @XmlElement(name = "DropOffDecimalPlaces")
    protected BigInteger dropOffDecimalPlaces;
    @XmlElement(name = "GuaranteedInd")
    protected String guaranteedInd;

    /**
     * Gets the value of the vehicleChargeAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleChargeAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleChargeAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehicleChargeAmount() {
        if (vehicleChargeAmount == null) {
            vehicleChargeAmount = new ArrayList<String>();
        }
        return this.vehicleChargeAmount;
    }

    /**
     * Gets the value of the approximateTotalChargeAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approximateTotalChargeAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproximateTotalChargeAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApproximateTotalChargeAmount() {
        if (approximateTotalChargeAmount == null) {
            approximateTotalChargeAmount = new ArrayList<String>();
        }
        return this.approximateTotalChargeAmount;
    }

    /**
     * Gets the value of the approximateChargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approximateChargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproximateChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproximateChargeDetailsPNRB }
     * 
     * 
     */
    public List<ApproximateChargeDetailsPNRB> getApproximateChargeDetails() {
        if (approximateChargeDetails == null) {
            approximateChargeDetails = new ArrayList<ApproximateChargeDetailsPNRB>();
        }
        return this.approximateChargeDetails;
    }

    /**
     * Gets the value of the approximateTotalChargeRateType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approximateTotalChargeRateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproximateTotalChargeRateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApproximateTotalChargeRateType() {
        if (approximateTotalChargeRateType == null) {
            approximateTotalChargeRateType = new ArrayList<String>();
        }
        return this.approximateTotalChargeRateType;
    }

    /**
     * Gets the value of the numDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDays() {
        return numDays;
    }

    /**
     * Sets the value of the numDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDays(String value) {
        this.numDays = value;
    }

    /**
     * Gets the value of the numHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumHours() {
        return numHours;
    }

    /**
     * Sets the value of the numHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumHours(String value) {
        this.numHours = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileage(String value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the totalMandatoryCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMandatoryCharges() {
        return totalMandatoryCharges;
    }

    /**
     * Sets the value of the totalMandatoryCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMandatoryCharges(String value) {
        this.totalMandatoryCharges = value;
    }

    /**
     * Gets the value of the dropOffCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffCharge() {
        return dropOffCharge;
    }

    /**
     * Sets the value of the dropOffCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffCharge(String value) {
        this.dropOffCharge = value;
    }

    /**
     * Gets the value of the dropOffDecimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDropOffDecimalPlaces() {
        return dropOffDecimalPlaces;
    }

    /**
     * Sets the value of the dropOffDecimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDropOffDecimalPlaces(BigInteger value) {
        this.dropOffDecimalPlaces = value;
    }

    /**
     * Gets the value of the guaranteedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * Sets the value of the guaranteedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteedInd(String value) {
        this.guaranteedInd = value;
    }

}
