//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.triprecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POSInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://webservices.sabre.com/triprecord}UpdateAttributes"/&gt;
 *       &lt;attribute name="Airline" type="{http://webservices.sabre.com/triprecord}string2to3" /&gt;
 *       &lt;attribute name="AgencyPCC" use="required" type="{http://webservices.sabre.com/triprecord}string3to4" /&gt;
 *       &lt;attribute name="IATANumber" type="{http://webservices.sabre.com/triprecord}string1to8" /&gt;
 *       &lt;attribute name="Country" type="{http://webservices.sabre.com/triprecord}string2to3" /&gt;
 *       &lt;attribute name="StateProvince" type="{http://webservices.sabre.com/triprecord}string1to8" /&gt;
 *       &lt;attribute name="ClientCode" type="{http://webservices.sabre.com/triprecord}string1to24" /&gt;
 *       &lt;attribute name="ClientContextCode" type="{http://webservices.sabre.com/triprecord}string1to5" /&gt;
 *       &lt;attribute name="DomainId" type="{http://webservices.sabre.com/triprecord}string1to5" /&gt;
 *       &lt;attribute name="DomainGroup" type="{http://webservices.sabre.com/triprecord}string1to5" /&gt;
 *       &lt;attribute name="PrimeHostPartition" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *       &lt;attribute name="AccessId" type="{http://webservices.sabre.com/triprecord}string1to20" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSInfoType")
public class POSInfoType {

    @XmlAttribute(name = "Airline")
    protected String airline;
    @XmlAttribute(name = "AgencyPCC", required = true)
    protected String agencyPCC;
    @XmlAttribute(name = "IATANumber")
    protected String iataNumber;
    @XmlAttribute(name = "Country")
    protected String country;
    @XmlAttribute(name = "StateProvince")
    protected String stateProvince;
    @XmlAttribute(name = "ClientCode")
    protected String clientCode;
    @XmlAttribute(name = "ClientContextCode")
    protected String clientContextCode;
    @XmlAttribute(name = "DomainId")
    protected String domainId;
    @XmlAttribute(name = "DomainGroup")
    protected String domainGroup;
    @XmlAttribute(name = "PrimeHostPartition")
    protected Byte primeHostPartition;
    @XmlAttribute(name = "AccessId")
    protected String accessId;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "Action")
    protected UpdateActions action;

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * Gets the value of the agencyPCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyPCC() {
        return agencyPCC;
    }

    /**
     * Sets the value of the agencyPCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyPCC(String value) {
        this.agencyPCC = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the stateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvince(String value) {
        this.stateProvince = value;
    }

    /**
     * Gets the value of the clientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * Sets the value of the clientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCode(String value) {
        this.clientCode = value;
    }

    /**
     * Gets the value of the clientContextCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientContextCode() {
        return clientContextCode;
    }

    /**
     * Sets the value of the clientContextCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientContextCode(String value) {
        this.clientContextCode = value;
    }

    /**
     * Gets the value of the domainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * Sets the value of the domainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainId(String value) {
        this.domainId = value;
    }

    /**
     * Gets the value of the domainGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainGroup() {
        return domainGroup;
    }

    /**
     * Sets the value of the domainGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainGroup(String value) {
        this.domainGroup = value;
    }

    /**
     * Gets the value of the primeHostPartition property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPrimeHostPartition() {
        return primeHostPartition;
    }

    /**
     * Sets the value of the primeHostPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPrimeHostPartition(Byte value) {
        this.primeHostPartition = value;
    }

    /**
     * Gets the value of the accessId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessId() {
        return accessId;
    }

    /**
     * Sets the value of the accessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessId(String value) {
        this.accessId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateActions }
     *     
     */
    public UpdateActions getAction() {
        if (action == null) {
            return UpdateActions.NONE;
        } else {
            return action;
        }
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateActions }
     *     
     */
    public void setAction(UpdateActions value) {
        this.action = value;
    }

}