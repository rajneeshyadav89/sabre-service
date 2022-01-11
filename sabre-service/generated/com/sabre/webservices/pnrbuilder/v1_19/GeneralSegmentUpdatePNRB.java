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
 * <p>Java class for GeneralSegmentUpdate.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralSegmentUpdate.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Line" type="{http://webservices.sabre.com/pnrbuilder/v1_19}Line" minOccurs="0"/&gt;
 *         &lt;element name="Vendor" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="op" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OperationType.PNRB" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralSegmentUpdate.PNRB", propOrder = {
    "line",
    "vendor",
    "numberInParty",
    "location",
    "dateTime",
    "text"
})
public class GeneralSegmentUpdatePNRB {

    @XmlElement(name = "Line")
    protected Line line;
    @XmlElement(name = "Vendor")
    protected GeneralSegmentUpdatePNRB.Vendor vendor;
    @XmlElement(name = "NumberInParty")
    protected String numberInParty;
    @XmlElement(name = "Location")
    protected GeneralSegmentUpdatePNRB.Location location;
    @XmlElement(name = "DateTime")
    protected String dateTime;
    @XmlElement(name = "Text")
    protected List<String> text;
    @XmlAttribute(name = "op")
    protected OperationTypePNRB op;

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(Line value) {
        this.line = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSegmentUpdatePNRB.Vendor }
     *     
     */
    public GeneralSegmentUpdatePNRB.Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSegmentUpdatePNRB.Vendor }
     *     
     */
    public void setVendor(GeneralSegmentUpdatePNRB.Vendor value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the numberInParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberInParty() {
        return numberInParty;
    }

    /**
     * Sets the value of the numberInParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberInParty(String value) {
        this.numberInParty = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSegmentUpdatePNRB.Location }
     *     
     */
    public GeneralSegmentUpdatePNRB.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSegmentUpdatePNRB.Location }
     *     
     */
    public void setLocation(GeneralSegmentUpdatePNRB.Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getText() {
        if (text == null) {
            text = new ArrayList<String>();
        }
        return this.text;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Location {

        @XmlAttribute(name = "LocationCode")
        protected String locationCode;

        /**
         * Gets the value of the locationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * Sets the value of the locationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Vendor {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }

}
