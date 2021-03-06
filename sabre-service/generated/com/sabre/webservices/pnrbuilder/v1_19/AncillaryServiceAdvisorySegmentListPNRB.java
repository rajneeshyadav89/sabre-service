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
 * <p>Java class for AncillaryServiceAdvisorySegmentList.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryServiceAdvisorySegmentList.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Route" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OperatingCarrierCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AirlineCode"/&gt;
 *                   &lt;element name="MarketingCarrierCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AirlineCode"/&gt;
 *                   &lt;element name="BoardPoint" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CityCode"/&gt;
 *                   &lt;element name="OffPoint" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CityCode"/&gt;
 *                   &lt;element name="EMDNumber" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString"/&gt;
 *                   &lt;element name="EMDCoupon" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Direction" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="O"/&gt;
 *                       &lt;enumeration value="I"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryServiceAdvisorySegmentList.PNRB", propOrder = {
    "route"
})
public class AncillaryServiceAdvisorySegmentListPNRB {

    @XmlElement(name = "Route", required = true)
    protected List<AncillaryServiceAdvisorySegmentListPNRB.Route> route;

    /**
     * Gets the value of the route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryServiceAdvisorySegmentListPNRB.Route }
     * 
     * 
     */
    public List<AncillaryServiceAdvisorySegmentListPNRB.Route> getRoute() {
        if (route == null) {
            route = new ArrayList<AncillaryServiceAdvisorySegmentListPNRB.Route>();
        }
        return this.route;
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
     *       &lt;sequence&gt;
     *         &lt;element name="OperatingCarrierCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AirlineCode"/&gt;
     *         &lt;element name="MarketingCarrierCode" type="{http://webservices.sabre.com/pnrbuilder/v1_19}AirlineCode"/&gt;
     *         &lt;element name="BoardPoint" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CityCode"/&gt;
     *         &lt;element name="OffPoint" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CityCode"/&gt;
     *         &lt;element name="EMDNumber" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString"/&gt;
     *         &lt;element name="EMDCoupon" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Direction" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="O"/&gt;
     *             &lt;enumeration value="I"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operatingCarrierCode",
        "marketingCarrierCode",
        "boardPoint",
        "offPoint",
        "emdNumber",
        "emdCoupon"
    })
    public static class Route {

        @XmlElement(name = "OperatingCarrierCode", required = true)
        protected String operatingCarrierCode;
        @XmlElement(name = "MarketingCarrierCode", required = true)
        protected String marketingCarrierCode;
        @XmlElement(name = "BoardPoint", required = true)
        protected String boardPoint;
        @XmlElement(name = "OffPoint", required = true)
        protected String offPoint;
        @XmlElement(name = "EMDNumber", required = true)
        protected String emdNumber;
        @XmlElement(name = "EMDCoupon", required = true)
        protected String emdCoupon;
        @XmlAttribute(name = "Direction", required = true)
        protected String direction;

        /**
         * Gets the value of the operatingCarrierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatingCarrierCode() {
            return operatingCarrierCode;
        }

        /**
         * Sets the value of the operatingCarrierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatingCarrierCode(String value) {
            this.operatingCarrierCode = value;
        }

        /**
         * Gets the value of the marketingCarrierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarketingCarrierCode() {
            return marketingCarrierCode;
        }

        /**
         * Sets the value of the marketingCarrierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarketingCarrierCode(String value) {
            this.marketingCarrierCode = value;
        }

        /**
         * Gets the value of the boardPoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoardPoint() {
            return boardPoint;
        }

        /**
         * Sets the value of the boardPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoardPoint(String value) {
            this.boardPoint = value;
        }

        /**
         * Gets the value of the offPoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffPoint() {
            return offPoint;
        }

        /**
         * Sets the value of the offPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffPoint(String value) {
            this.offPoint = value;
        }

        /**
         * Gets the value of the emdNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMDNumber() {
            return emdNumber;
        }

        /**
         * Sets the value of the emdNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMDNumber(String value) {
            this.emdNumber = value;
        }

        /**
         * Gets the value of the emdCoupon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMDCoupon() {
            return emdCoupon;
        }

        /**
         * Sets the value of the emdCoupon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMDCoupon(String value) {
            this.emdCoupon = value;
        }

        /**
         * Gets the value of the direction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirection() {
            return direction;
        }

        /**
         * Sets the value of the direction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirection(String value) {
            this.direction = value;
        }

    }

}
