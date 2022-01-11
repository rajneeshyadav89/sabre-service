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
 * Ticketing information must be entered before the PNR can be finalized.
 * 
 *                 The ticketing field (7) has a maximum of 71 characters starting with the
 *                 7, regardless of the entry or character combination used.
 *             
 * 
 * <p>Java class for TicketingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FutureTicketing" type="{http://webservices.sabre.com/pnrbuilder/v1_19}FutureTicketing.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="TicketingTimeLimit" type="{http://webservices.sabre.com/pnrbuilder/v1_19}TicketingTimeLimit.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="AlreadyTicketed" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AlreadyTicketed.PNRB" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfo", propOrder = {
    "futureTicketing",
    "ticketingTimeLimit",
    "alreadyTicketed"
})
public class TicketingInfo {

    @XmlElement(name = "FutureTicketing")
    protected FutureTicketingPNRB futureTicketing;
    @XmlElement(name = "TicketingTimeLimit")
    protected TicketingTimeLimitPNRB ticketingTimeLimit;
    @XmlElement(name = "AlreadyTicketed")
    protected AlreadyTicketedPNRB alreadyTicketed;

    /**
     * Gets the value of the futureTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link FutureTicketingPNRB }
     *     
     */
    public FutureTicketingPNRB getFutureTicketing() {
        return futureTicketing;
    }

    /**
     * Sets the value of the futureTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureTicketingPNRB }
     *     
     */
    public void setFutureTicketing(FutureTicketingPNRB value) {
        this.futureTicketing = value;
    }

    /**
     * Gets the value of the ticketingTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingTimeLimitPNRB }
     *     
     */
    public TicketingTimeLimitPNRB getTicketingTimeLimit() {
        return ticketingTimeLimit;
    }

    /**
     * Sets the value of the ticketingTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingTimeLimitPNRB }
     *     
     */
    public void setTicketingTimeLimit(TicketingTimeLimitPNRB value) {
        this.ticketingTimeLimit = value;
    }

    /**
     * Gets the value of the alreadyTicketed property.
     * 
     * @return
     *     possible object is
     *     {@link AlreadyTicketedPNRB }
     *     
     */
    public AlreadyTicketedPNRB getAlreadyTicketed() {
        return alreadyTicketed;
    }

    /**
     * Sets the value of the alreadyTicketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlreadyTicketedPNRB }
     *     
     */
    public void setAlreadyTicketed(AlreadyTicketedPNRB value) {
        this.alreadyTicketed = value;
    }

}
