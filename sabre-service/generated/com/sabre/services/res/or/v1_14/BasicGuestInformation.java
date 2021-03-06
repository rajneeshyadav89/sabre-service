//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic Information about Guest /Person.  Includes Lead Guest, Loyalty Id, Frequent traveler ID
 * 
 * <p>Java class for BasicGuestInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicGuestInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.sabre.com/res/or/v1_14}GuestName"&gt;
 *       &lt;attribute name="Email" type="{http://services.sabre.com/res/or/v1_14}EmailType" /&gt;
 *       &lt;attribute name="Age"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Index" type="{http://services.sabre.com/res/or/v1_14}IndexType" /&gt;
 *       &lt;attribute name="LeadGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="FrequentFlyerNumber" type="{http://services.sabre.com/res/or/v1_14}MembershipIdType" /&gt;
 *       &lt;attribute name="LoyaltyId" type="{http://services.sabre.com/res/or/v1_14}MembershipIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicGuestInformation")
@XmlSeeAlso({
    ExtendedGuestInformation.class
})
public class BasicGuestInformation
    extends GuestName
{

    @XmlAttribute(name = "Email")
    protected String email;
    @XmlAttribute(name = "Age")
    protected Integer age;
    @XmlAttribute(name = "Index")
    protected Integer index;
    @XmlAttribute(name = "LeadGuest")
    protected Boolean leadGuest;
    @XmlAttribute(name = "FrequentFlyerNumber")
    protected String frequentFlyerNumber;
    @XmlAttribute(name = "LoyaltyId")
    protected String loyaltyId;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the leadGuest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadGuest() {
        if (leadGuest == null) {
            return false;
        } else {
            return leadGuest;
        }
    }

    /**
     * Sets the value of the leadGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadGuest(Boolean value) {
        this.leadGuest = value;
    }

    /**
     * Gets the value of the frequentFlyerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    /**
     * Sets the value of the frequentFlyerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlyerNumber(String value) {
        this.frequentFlyerNumber = value;
    }

    /**
     * Gets the value of the loyaltyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyId() {
        return loyaltyId;
    }

    /**
     * Sets the value of the loyaltyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyId(String value) {
        this.loyaltyId = value;
    }

}
