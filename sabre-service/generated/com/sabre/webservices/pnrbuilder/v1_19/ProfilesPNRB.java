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
 * <p>Java class for Profiles.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profiles.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Profile" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{http://webservices.sabre.com/pnrbuilder/v1_19}ProfilesDataGroup.PNRB"/&gt;
 *                   &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FrequentFlyer" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CustomerLoyalty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ValueScore" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CV_Score" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="id" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
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
@XmlType(name = "Profiles.PNRB", propOrder = {
    "profile"
})
public class ProfilesPNRB {

    @XmlElement(name = "Profile")
    protected List<ProfilesPNRB.Profile> profile;

    /**
     * Gets the value of the profile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfilesPNRB.Profile }
     * 
     * 
     */
    public List<ProfilesPNRB.Profile> getProfile() {
        if (profile == null) {
            profile = new ArrayList<ProfilesPNRB.Profile>();
        }
        return this.profile;
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
     *         &lt;group ref="{http://webservices.sabre.com/pnrbuilder/v1_19}ProfilesDataGroup.PNRB"/&gt;
     *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FrequentFlyer" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CustomerLoyalty" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ValueScore" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CV_Score" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "profileID",
        "profileType",
        "policyId",
        "preferenceId",
        "policyRemovalReason",
        "owningAgency",
        "airlineCode",
        "frequentFlyer",
        "valueScore"
    })
    public static class Profile {

        @XmlElement(name = "ProfileID")
        protected String profileID;
        @XmlElement(name = "ProfileType")
        protected String profileType;
        @XmlElement(name = "PolicyId")
        protected String policyId;
        @XmlElement(name = "PreferenceId")
        protected String preferenceId;
        @XmlElement(name = "PolicyRemovalReason")
        protected String policyRemovalReason;
        @XmlElement(name = "OwningAgency")
        protected String owningAgency;
        @XmlElement(name = "AirlineCode")
        protected String airlineCode;
        @XmlElement(name = "FrequentFlyer")
        protected List<CustomerLoyalty> frequentFlyer;
        @XmlElement(name = "ValueScore")
        protected List<CVScore> valueScore;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * Gets the value of the profileID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfileID() {
            return profileID;
        }

        /**
         * Sets the value of the profileID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfileID(String value) {
            this.profileID = value;
        }

        /**
         * Gets the value of the profileType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfileType() {
            return profileType;
        }

        /**
         * Sets the value of the profileType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfileType(String value) {
            this.profileType = value;
        }

        /**
         * Gets the value of the policyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyId() {
            return policyId;
        }

        /**
         * Sets the value of the policyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyId(String value) {
            this.policyId = value;
        }

        /**
         * Gets the value of the preferenceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferenceId() {
            return preferenceId;
        }

        /**
         * Sets the value of the preferenceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferenceId(String value) {
            this.preferenceId = value;
        }

        /**
         * Gets the value of the policyRemovalReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyRemovalReason() {
            return policyRemovalReason;
        }

        /**
         * Sets the value of the policyRemovalReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyRemovalReason(String value) {
            this.policyRemovalReason = value;
        }

        /**
         * Gets the value of the owningAgency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwningAgency() {
            return owningAgency;
        }

        /**
         * Sets the value of the owningAgency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwningAgency(String value) {
            this.owningAgency = value;
        }

        /**
         * Gets the value of the airlineCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirlineCode() {
            return airlineCode;
        }

        /**
         * Sets the value of the airlineCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirlineCode(String value) {
            this.airlineCode = value;
        }

        /**
         * Gets the value of the frequentFlyer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the frequentFlyer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFrequentFlyer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerLoyalty }
         * 
         * 
         */
        public List<CustomerLoyalty> getFrequentFlyer() {
            if (frequentFlyer == null) {
                frequentFlyer = new ArrayList<CustomerLoyalty>();
            }
            return this.frequentFlyer;
        }

        /**
         * Gets the value of the valueScore property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the valueScore property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValueScore().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CVScore }
         * 
         * 
         */
        public List<CVScore> getValueScore() {
            if (valueScore == null) {
                valueScore = new ArrayList<CVScore>();
            }
            return this.valueScore;
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

    }

}
