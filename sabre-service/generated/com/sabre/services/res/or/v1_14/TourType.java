//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TourType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vendor" type="{http://services.sabre.com/res/or/v1_14}CompanyType" minOccurs="0"/&gt;
 *         &lt;element name="StartDetails" type="{http://services.sabre.com/res/or/v1_14}LocationDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="EndDetails" type="{http://services.sabre.com/res/or/v1_14}LocationDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="Price" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Total" type="{http://services.sabre.com/res/or/v1_14}PriceType" minOccurs="0"/&gt;
 *                   &lt;element name="Breakdown" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="References" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PassengerRef" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Price" type="{http://services.sabre.com/res/or/v1_14}PriceType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Customer" type="{http://services.sabre.com/res/or/v1_14}PassengerType" minOccurs="0"/&gt;
 *         &lt;element name="Passengers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Passenger" type="{http://services.sabre.com/res/or/v1_14}PassengerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Services" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Service" type="{http://services.sabre.com/res/or/v1_14}ServiceRefType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "TourType", propOrder = {
    "statusCode",
    "messageStatus",
    "travelType",
    "vendor",
    "startDetails",
    "endDetails",
    "price",
    "customer",
    "passengers",
    "services"
})
public class TourType {

    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "MessageStatus")
    protected String messageStatus;
    @XmlElement(name = "TravelType")
    protected String travelType;
    @XmlElement(name = "Vendor")
    protected CompanyType vendor;
    @XmlElement(name = "StartDetails")
    protected LocationDetailsType startDetails;
    @XmlElement(name = "EndDetails")
    protected LocationDetailsType endDetails;
    @XmlElement(name = "Price")
    protected TourType.Price price;
    @XmlElement(name = "Customer")
    protected PassengerType customer;
    @XmlElement(name = "Passengers")
    protected TourType.Passengers passengers;
    @XmlElement(name = "Services")
    protected TourType.Services services;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStatus(String value) {
        this.messageStatus = value;
    }

    /**
     * Gets the value of the travelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelType() {
        return travelType;
    }

    /**
     * Sets the value of the travelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelType(String value) {
        this.travelType = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setVendor(CompanyType value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the startDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsType }
     *     
     */
    public LocationDetailsType getStartDetails() {
        return startDetails;
    }

    /**
     * Sets the value of the startDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsType }
     *     
     */
    public void setStartDetails(LocationDetailsType value) {
        this.startDetails = value;
    }

    /**
     * Gets the value of the endDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsType }
     *     
     */
    public LocationDetailsType getEndDetails() {
        return endDetails;
    }

    /**
     * Sets the value of the endDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsType }
     *     
     */
    public void setEndDetails(LocationDetailsType value) {
        this.endDetails = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link TourType.Price }
     *     
     */
    public TourType.Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourType.Price }
     *     
     */
    public void setPrice(TourType.Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerType }
     *     
     */
    public PassengerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerType }
     *     
     */
    public void setCustomer(PassengerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link TourType.Passengers }
     *     
     */
    public TourType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourType.Passengers }
     *     
     */
    public void setPassengers(TourType.Passengers value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link TourType.Services }
     *     
     */
    public TourType.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourType.Services }
     *     
     */
    public void setServices(TourType.Services value) {
        this.services = value;
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
     *         &lt;element name="Passenger" type="{http://services.sabre.com/res/or/v1_14}PassengerType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passenger"
    })
    public static class Passengers {

        @XmlElement(name = "Passenger")
        protected List<PassengerType> passenger;
        @XmlAttribute(name = "quantity")
        protected Integer quantity;

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
         * {@link PassengerType }
         * 
         * 
         */
        public List<PassengerType> getPassenger() {
            if (passenger == null) {
                passenger = new ArrayList<PassengerType>();
            }
            return this.passenger;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuantity(Integer value) {
            this.quantity = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Total" type="{http://services.sabre.com/res/or/v1_14}PriceType" minOccurs="0"/&gt;
     *         &lt;element name="Breakdown" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="References" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PassengerRef" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Price" type="{http://services.sabre.com/res/or/v1_14}PriceType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
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
    @XmlType(name = "", propOrder = {
        "total",
        "breakdown"
    })
    public static class Price {

        @XmlElement(name = "Total")
        protected PriceType total;
        @XmlElement(name = "Breakdown")
        protected List<TourType.Price.Breakdown> breakdown;

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link PriceType }
         *     
         */
        public PriceType getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceType }
         *     
         */
        public void setTotal(PriceType value) {
            this.total = value;
        }

        /**
         * Gets the value of the breakdown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the breakdown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBreakdown().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TourType.Price.Breakdown }
         * 
         * 
         */
        public List<TourType.Price.Breakdown> getBreakdown() {
            if (breakdown == null) {
                breakdown = new ArrayList<TourType.Price.Breakdown>();
            }
            return this.breakdown;
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
         *         &lt;element name="References" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PassengerRef" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Price" type="{http://services.sabre.com/res/or/v1_14}PriceType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "references",
            "price"
        })
        public static class Breakdown {

            @XmlElement(name = "References")
            protected TourType.Price.Breakdown.References references;
            @XmlElement(name = "Price")
            protected PriceType price;

            /**
             * Gets the value of the references property.
             * 
             * @return
             *     possible object is
             *     {@link TourType.Price.Breakdown.References }
             *     
             */
            public TourType.Price.Breakdown.References getReferences() {
                return references;
            }

            /**
             * Sets the value of the references property.
             * 
             * @param value
             *     allowed object is
             *     {@link TourType.Price.Breakdown.References }
             *     
             */
            public void setReferences(TourType.Price.Breakdown.References value) {
                this.references = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link PriceType }
             *     
             */
            public PriceType getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceType }
             *     
             */
            public void setPrice(PriceType value) {
                this.price = value;
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
             *         &lt;element name="PassengerRef" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
            @XmlType(name = "", propOrder = {
                "passengerRef"
            })
            public static class References {

                @XmlElement(name = "PassengerRef", required = true)
                protected List<TourType.Price.Breakdown.References.PassengerRef> passengerRef;

                /**
                 * Gets the value of the passengerRef property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the passengerRef property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPassengerRef().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TourType.Price.Breakdown.References.PassengerRef }
                 * 
                 * 
                 */
                public List<TourType.Price.Breakdown.References.PassengerRef> getPassengerRef() {
                    if (passengerRef == null) {
                        passengerRef = new ArrayList<TourType.Price.Breakdown.References.PassengerRef>();
                    }
                    return this.passengerRef;
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
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PassengerRef {

                    @XmlAttribute(name = "id")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String id;

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

                }

            }

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
     *       &lt;sequence&gt;
     *         &lt;element name="Service" type="{http://services.sabre.com/res/or/v1_14}ServiceRefType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "service"
    })
    public static class Services {

        @XmlElement(name = "Service", required = true)
        protected List<ServiceRefType> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceRefType }
         * 
         * 
         */
        public List<ServiceRefType> getService() {
            if (service == null) {
                service = new ArrayList<ServiceRefType>();
            }
            return this.service;
        }

    }

}
