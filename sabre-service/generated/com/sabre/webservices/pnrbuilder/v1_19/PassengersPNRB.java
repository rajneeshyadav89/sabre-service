//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Passengers.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Passengers.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Corporate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}TravelerGroup.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="BlockedSpaceGroup" type="{http://webservices.sabre.com/pnrbuilder/v1_19}BSGGroup.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="ZGroup" type="{http://webservices.sabre.com/pnrbuilder/v1_19}TravelerGroup.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="Passenger" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Passenger.PNRB" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numberInParty" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Numeric0to99999" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Passengers.PNRB", propOrder = {
    "corporate",
    "blockedSpaceGroup",
    "zGroup",
    "passenger"
})
public class PassengersPNRB {

    @XmlElement(name = "Corporate")
    protected TravelerGroupPNRB corporate;
    @XmlElement(name = "BlockedSpaceGroup")
    protected BSGGroupPNRB blockedSpaceGroup;
    @XmlElement(name = "ZGroup")
    protected TravelerGroupPNRB zGroup;
    @XmlElement(name = "Passenger")
    protected List<PassengerPNRB> passenger;
    @XmlAttribute(name = "numberInParty")
    protected Integer numberInParty;

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerGroupPNRB }
     *     
     */
    public TravelerGroupPNRB getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerGroupPNRB }
     *     
     */
    public void setCorporate(TravelerGroupPNRB value) {
        this.corporate = value;
    }

    /**
     * Gets the value of the blockedSpaceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BSGGroupPNRB }
     *     
     */
    public BSGGroupPNRB getBlockedSpaceGroup() {
        return blockedSpaceGroup;
    }

    /**
     * Sets the value of the blockedSpaceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BSGGroupPNRB }
     *     
     */
    public void setBlockedSpaceGroup(BSGGroupPNRB value) {
        this.blockedSpaceGroup = value;
    }

    /**
     * Gets the value of the zGroup property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerGroupPNRB }
     *     
     */
    public TravelerGroupPNRB getZGroup() {
        return zGroup;
    }

    /**
     * Sets the value of the zGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerGroupPNRB }
     *     
     */
    public void setZGroup(TravelerGroupPNRB value) {
        this.zGroup = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerPNRB }
     * 
     * 
     */
    public List<PassengerPNRB> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<PassengerPNRB>();
        }
        return this.passenger;
    }

    /**
     * Gets the value of the numberInParty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberInParty() {
        return numberInParty;
    }

    /**
     * Sets the value of the numberInParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberInParty(Integer value) {
        this.numberInParty = value;
    }

}
