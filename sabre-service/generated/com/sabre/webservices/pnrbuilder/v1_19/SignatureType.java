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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SignatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistoryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DutyCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}DutyCodeList" minOccurs="0"/&gt;
 *         &lt;element name="AgentSine" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AgentSineType" minOccurs="0"/&gt;
 *         &lt;element name="HomePCC" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="AgencyPCC" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="OAC" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OACType" minOccurs="0"/&gt;
 *         &lt;element name="HistoryFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SequenceNbr" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureType", propOrder = {
    "historyTimestamp",
    "dutyCode",
    "agentSine",
    "homePCC",
    "agencyPCC",
    "oac",
    "historyFrom"
})
public class SignatureType {

    @XmlElement(name = "HistoryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historyTimestamp;
    @XmlElement(name = "DutyCode")
    protected String dutyCode;
    @XmlElement(name = "AgentSine")
    protected String agentSine;
    @XmlElement(name = "HomePCC")
    protected String homePCC;
    @XmlElement(name = "AgencyPCC")
    protected String agencyPCC;
    @XmlElement(name = "OAC")
    protected OACType oac;
    @XmlElement(name = "HistoryFrom")
    protected String historyFrom;
    @XmlAttribute(name = "SequenceNbr")
    protected Integer sequenceNbr;

    /**
     * Gets the value of the historyTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoryTimestamp() {
        return historyTimestamp;
    }

    /**
     * Sets the value of the historyTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoryTimestamp(XMLGregorianCalendar value) {
        this.historyTimestamp = value;
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
     * Gets the value of the agentSine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSine() {
        return agentSine;
    }

    /**
     * Sets the value of the agentSine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSine(String value) {
        this.agentSine = value;
    }

    /**
     * Gets the value of the homePCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePCC() {
        return homePCC;
    }

    /**
     * Sets the value of the homePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePCC(String value) {
        this.homePCC = value;
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
     * Gets the value of the oac property.
     * 
     * @return
     *     possible object is
     *     {@link OACType }
     *     
     */
    public OACType getOAC() {
        return oac;
    }

    /**
     * Sets the value of the oac property.
     * 
     * @param value
     *     allowed object is
     *     {@link OACType }
     *     
     */
    public void setOAC(OACType value) {
        this.oac = value;
    }

    /**
     * Gets the value of the historyFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryFrom() {
        return historyFrom;
    }

    /**
     * Sets the value of the historyFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryFrom(String value) {
        this.historyFrom = value;
    }

    /**
     * Gets the value of the sequenceNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNbr() {
        return sequenceNbr;
    }

    /**
     * Sets the value of the sequenceNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNbr(Integer value) {
        this.sequenceNbr = value;
    }

}
