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
 * <p>Java class for Seats.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Seats.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreReservedSeats" type="{http://webservices.sabre.com/pnrbuilder/v1_19}PreReservedSeats.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="SeatSpecialRequests" type="{http://webservices.sabre.com/pnrbuilder/v1_19}SeatRequests.PNRB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seats.PNRB", propOrder = {
    "preReservedSeats",
    "seatSpecialRequests"
})
public class SeatsPNRB {

    @XmlElement(name = "PreReservedSeats")
    protected PreReservedSeatsPNRB preReservedSeats;
    @XmlElement(name = "SeatSpecialRequests")
    protected SeatRequestsPNRB seatSpecialRequests;

    /**
     * Gets the value of the preReservedSeats property.
     * 
     * @return
     *     possible object is
     *     {@link PreReservedSeatsPNRB }
     *     
     */
    public PreReservedSeatsPNRB getPreReservedSeats() {
        return preReservedSeats;
    }

    /**
     * Sets the value of the preReservedSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreReservedSeatsPNRB }
     *     
     */
    public void setPreReservedSeats(PreReservedSeatsPNRB value) {
        this.preReservedSeats = value;
    }

    /**
     * Gets the value of the seatSpecialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRequestsPNRB }
     *     
     */
    public SeatRequestsPNRB getSeatSpecialRequests() {
        return seatSpecialRequests;
    }

    /**
     * Sets the value of the seatSpecialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRequestsPNRB }
     *     
     */
    public void setSeatSpecialRequests(SeatRequestsPNRB value) {
        this.seatSpecialRequests = value;
    }

}
