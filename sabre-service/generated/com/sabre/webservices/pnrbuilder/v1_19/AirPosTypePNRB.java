//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OAC POS details for segments
 *             
 * 
 * <p>Java class for AirPosType.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPosType.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IataNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OACAccountingCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OACAccountingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPosType.PNRB", propOrder = {
    "crsCode",
    "iataNumber",
    "agencyCityCode",
    "countryCode",
    "dutyCode",
    "oacAccountingCityCode",
    "oacAccountingCode"
})
public class AirPosTypePNRB {

    @XmlElement(name = "CrsCode")
    protected String crsCode;
    @XmlElement(name = "IataNumber")
    protected String iataNumber;
    @XmlElement(name = "AgencyCityCode")
    protected String agencyCityCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "DutyCode")
    protected String dutyCode;
    @XmlElement(name = "OACAccountingCityCode")
    protected String oacAccountingCityCode;
    @XmlElement(name = "OACAccountingCode")
    protected String oacAccountingCode;

    /**
     * Gets the value of the crsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrsCode() {
        return crsCode;
    }

    /**
     * Sets the value of the crsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrsCode(String value) {
        this.crsCode = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataNumber() {
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
    public void setIataNumber(String value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the agencyCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCityCode() {
        return agencyCityCode;
    }

    /**
     * Sets the value of the agencyCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCityCode(String value) {
        this.agencyCityCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the dutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * Sets the value of the dutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyCode(String value) {
        this.dutyCode = value;
    }

    /**
     * Gets the value of the oacAccountingCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOACAccountingCityCode() {
        return oacAccountingCityCode;
    }

    /**
     * Sets the value of the oacAccountingCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOACAccountingCityCode(String value) {
        this.oacAccountingCityCode = value;
    }

    /**
     * Gets the value of the oacAccountingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOACAccountingCode() {
        return oacAccountingCode;
    }

    /**
     * Sets the value of the oacAccountingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOACAccountingCode(String value) {
        this.oacAccountingCode = value;
    }

}
