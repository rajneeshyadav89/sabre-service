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
 * <p>Java class for HistoryTransaction.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoryTransaction.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Passengers" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Passengers.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="Segments" type="{http://webservices.sabre.com/pnrbuilder/v1_19}SegmentType.PNRB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="historySequence" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" /&gt;
 *       &lt;attribute name="historyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryTransaction.PNRB", propOrder = {
    "passengers",
    "segments"
})
public class HistoryTransactionPNRB {

    @XmlElement(name = "Passengers")
    protected PassengersPNRB passengers;
    @XmlElement(name = "Segments")
    protected SegmentTypePNRB segments;
    @XmlAttribute(name = "historySequence")
    protected String historySequence;
    @XmlAttribute(name = "historyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historyDateTime;

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link PassengersPNRB }
     *     
     */
    public PassengersPNRB getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengersPNRB }
     *     
     */
    public void setPassengers(PassengersPNRB value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentTypePNRB }
     *     
     */
    public SegmentTypePNRB getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentTypePNRB }
     *     
     */
    public void setSegments(SegmentTypePNRB value) {
        this.segments = value;
    }

    /**
     * Gets the value of the historySequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistorySequence() {
        return historySequence;
    }

    /**
     * Sets the value of the historySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistorySequence(String value) {
        this.historySequence = value;
    }

    /**
     * Gets the value of the historyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoryDateTime() {
        return historyDateTime;
    }

    /**
     * Sets the value of the historyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoryDateTime(XMLGregorianCalendar value) {
        this.historyDateTime = value;
    }

}
