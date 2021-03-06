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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Change Number in Party.
 *                 Used when the user wants to increase or reduce the number of passengers in a PNR.
 *                 *NewNbrInParty (mandatory element)
 *                 Contains the desired passenger count; 0-99 are valid.
 *                 *SegmentNumber (optional element(s)). Default is to update all flights in the PNR.
 *                 This is not valid on retrieved PNRs, only on a new PNR that has not been ended yet.
 *                 Each contains an air segment number, to be updated. Used when the itinerary segments
 *                 contain different passenger counts; 1-99 are valid.
 *             
 * 
 * <p>Java class for ChangeNbrInPartyType.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeNbrInPartyType.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NewNbrInParty" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Numeric0to99"/&gt;
 *         &lt;element name="SegmentNumber" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Numeric1to99" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeNbrInPartyType.PNRB", propOrder = {
    "newNbrInParty",
    "segmentNumber"
})
public class ChangeNbrInPartyTypePNRB {

    @XmlElement(name = "NewNbrInParty")
    @XmlSchemaType(name = "integer")
    protected int newNbrInParty;
    @XmlElement(name = "SegmentNumber", type = Integer.class)
    @XmlSchemaType(name = "integer")
    protected List<Integer> segmentNumber;

    /**
     * Gets the value of the newNbrInParty property.
     * 
     */
    public int getNewNbrInParty() {
        return newNbrInParty;
    }

    /**
     * Sets the value of the newNbrInParty property.
     * 
     */
    public void setNewNbrInParty(int value) {
        this.newNbrInParty = value;
    }

    /**
     * Gets the value of the segmentNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSegmentNumber() {
        if (segmentNumber == null) {
            segmentNumber = new ArrayList<Integer>();
        }
        return this.segmentNumber;
    }

}
