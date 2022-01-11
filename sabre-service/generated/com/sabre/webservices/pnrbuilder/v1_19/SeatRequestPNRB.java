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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * name associated.
 * 
 *                 formats (AFAX and GFAX for all)
 * 
 *                 * request seat assignment
 * 
 *                 4(seat code)(seg #)-(name #)
 *                 4NSST1-2.1
 * 
 *                 * request seats for all segments for multiple name
 *                 fields 4(seat code)(seg #)-(name #),(name #)
 *                 4NSST1-1.1,2.0
 * 
 *                 * request seats for specified segment for specified name
 *                 number and add free text
 * 
 *                 4(seat code)(seg #)/(free text)-(name number)
 *                 4SMST4/WDW-2.1
 * 
 *                 * request seats for specified segment for multiple
 *                 specified name numbers and add free text
 * 
 *                 4(seat code)(seg #)/(free text)-(name #),(name#)
 *                 4NSST2/AISLE-1.1,2.0
 *             
 * 
 * <p>Java class for SeatRequest.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequest.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeatCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="FlightDate" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="BoardCity" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CityCode" minOccurs="0"/&gt;
 *         &lt;element name="OffCity" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CityCode" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ActionCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ClassOfService" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="NumberInParty" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Numeric0to99999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
 *       &lt;attribute name="type" type="{http://webservices.sabre.com/pnrbuilder/v1_19}RequestType.PNRB" /&gt;
 *       &lt;attribute name="op" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OperationType.PNRB" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequest.PNRB", propOrder = {
    "seatCode",
    "flightNumber",
    "vendorCode",
    "flightDate",
    "boardCity",
    "offCity",
    "comment",
    "actionCode",
    "classOfService",
    "numberInParty"
})
@XmlSeeAlso({
    SeatsHistoryType.class
})
public class SeatRequestPNRB {

    @XmlElement(name = "SeatCode")
    protected String seatCode;
    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "VendorCode")
    protected String vendorCode;
    @XmlElement(name = "FlightDate")
    protected String flightDate;
    @XmlElement(name = "BoardCity")
    protected String boardCity;
    @XmlElement(name = "OffCity")
    protected String offCity;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "ClassOfService")
    protected String classOfService;
    @XmlElement(name = "NumberInParty")
    @XmlSchemaType(name = "integer")
    protected Integer numberInParty;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "type")
    protected RequestTypePNRB type;
    @XmlAttribute(name = "op")
    protected OperationTypePNRB op;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the seatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatCode() {
        return seatCode;
    }

    /**
     * Sets the value of the seatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatCode(String value) {
        this.seatCode = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
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
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDate(String value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the boardCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardCity() {
        return boardCity;
    }

    /**
     * Sets the value of the boardCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardCity(String value) {
        this.boardCity = value;
    }

    /**
     * Gets the value of the offCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffCity() {
        return offCity;
    }

    /**
     * Sets the value of the offCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffCity(String value) {
        this.offCity = value;
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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypePNRB }
     *     
     */
    public RequestTypePNRB getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypePNRB }
     *     
     */
    public void setType(RequestTypePNRB value) {
        this.type = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link OperationTypePNRB }
     *     
     */
    public OperationTypePNRB getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationTypePNRB }
     *     
     */
    public void setOp(OperationTypePNRB value) {
        this.op = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
