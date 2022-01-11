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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.sabre.webservices.pnrbuilder.v1_19.OpenReservationElementHistoryType;


/**
 * <p>Java class for OpenReservationElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenReservationElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}SocialMediaContact"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}AgencyFees"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}LangDetails"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}FormOfPayment"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}Loyalty"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}AncillaryProduct"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}InvoiceData"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}AccountingField"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}ServiceRequest"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}Email"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}PriceCache"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}TripProposalReference"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}InsuranceOptOut"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}Profile"/&gt;
 *           &lt;element ref="{http://services.sabre.com/res/or/v1_14}Review"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://services.sabre.com/res/or/v1_14}Associations"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="displayIndex" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="elementId" type="{http://services.sabre.com/res/or/v1_14}AssociationMatrixID" /&gt;
 *       &lt;attribute name="transient" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenReservationElementType", propOrder = {
    "socialMediaContact",
    "agencyFees",
    "langDetails",
    "formOfPayment",
    "loyalty",
    "ancillaryProduct",
    "invoiceData",
    "accountingField",
    "serviceRequest",
    "email",
    "priceCache",
    "tripProposalReference",
    "insuranceOptOut",
    "profile",
    "review",
    "segmentAssociation",
    "nameAssociation"
})
@XmlSeeAlso({
    OpenReservationElementHistoryType.class
})
public class OpenReservationElementType {

    @XmlElement(name = "SocialMediaContact")
    protected SocialMediaContactType socialMediaContact;
    @XmlElement(name = "AgencyFees")
    protected AgencyFeesType agencyFees;
    @XmlElement(name = "LangDetails")
    protected LangDetailsType langDetails;
    @XmlElement(name = "FormOfPayment")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "Loyalty")
    protected Loyalty loyalty;
    @XmlElement(name = "AncillaryProduct")
    protected AncillaryProductObject ancillaryProduct;
    @XmlElement(name = "InvoiceData")
    protected InvoiceData invoiceData;
    @XmlElement(name = "AccountingField")
    protected AccountingField accountingField;
    @XmlElement(name = "ServiceRequest")
    protected ServiceRequestType serviceRequest;
    @XmlElement(name = "Email")
    protected Email email;
    @XmlElement(name = "PriceCache")
    protected PriceCache priceCache;
    @XmlElement(name = "TripProposalReference")
    protected TripProposalReference tripProposalReference;
    @XmlElement(name = "InsuranceOptOut")
    protected InsuranceOptOut insuranceOptOut;
    @XmlElement(name = "Profile")
    protected ProfileType profile;
    @XmlElement(name = "Review")
    protected Review review;
    @XmlElement(name = "SegmentAssociation")
    protected List<SegmentAssociation> segmentAssociation;
    @XmlElement(name = "NameAssociation")
    protected List<NameAssociationTag> nameAssociation;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "displayIndex")
    protected Integer displayIndex;
    @XmlAttribute(name = "elementId")
    protected String elementId;
    @XmlAttribute(name = "transient")
    protected Boolean _transient;

    /**
     * Gets the value of the socialMediaContact property.
     * 
     * @return
     *     possible object is
     *     {@link SocialMediaContactType }
     *     
     */
    public SocialMediaContactType getSocialMediaContact() {
        return socialMediaContact;
    }

    /**
     * Sets the value of the socialMediaContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialMediaContactType }
     *     
     */
    public void setSocialMediaContact(SocialMediaContactType value) {
        this.socialMediaContact = value;
    }

    /**
     * Gets the value of the agencyFees property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyFeesType }
     *     
     */
    public AgencyFeesType getAgencyFees() {
        return agencyFees;
    }

    /**
     * Sets the value of the agencyFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyFeesType }
     *     
     */
    public void setAgencyFees(AgencyFeesType value) {
        this.agencyFees = value;
    }

    /**
     * Gets the value of the langDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LangDetailsType }
     *     
     */
    public LangDetailsType getLangDetails() {
        return langDetails;
    }

    /**
     * Sets the value of the langDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangDetailsType }
     *     
     */
    public void setLangDetails(LangDetailsType value) {
        this.langDetails = value;
    }

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     */
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * Gets the value of the loyalty property.
     * 
     * @return
     *     possible object is
     *     {@link Loyalty }
     *     
     */
    public Loyalty getLoyalty() {
        return loyalty;
    }

    /**
     * Sets the value of the loyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loyalty }
     *     
     */
    public void setLoyalty(Loyalty value) {
        this.loyalty = value;
    }

    /**
     * Gets the value of the ancillaryProduct property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryProductObject }
     *     
     */
    public AncillaryProductObject getAncillaryProduct() {
        return ancillaryProduct;
    }

    /**
     * Sets the value of the ancillaryProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryProductObject }
     *     
     */
    public void setAncillaryProduct(AncillaryProductObject value) {
        this.ancillaryProduct = value;
    }

    /**
     * Gets the value of the invoiceData property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceData }
     *     
     */
    public InvoiceData getInvoiceData() {
        return invoiceData;
    }

    /**
     * Sets the value of the invoiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceData }
     *     
     */
    public void setInvoiceData(InvoiceData value) {
        this.invoiceData = value;
    }

    /**
     * Gets the value of the accountingField property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingField }
     *     
     */
    public AccountingField getAccountingField() {
        return accountingField;
    }

    /**
     * Sets the value of the accountingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingField }
     *     
     */
    public void setAccountingField(AccountingField value) {
        this.accountingField = value;
    }

    /**
     * Gets the value of the serviceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestType }
     *     
     */
    public ServiceRequestType getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Sets the value of the serviceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestType }
     *     
     */
    public void setServiceRequest(ServiceRequestType value) {
        this.serviceRequest = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the priceCache property.
     * 
     * @return
     *     possible object is
     *     {@link PriceCache }
     *     
     */
    public PriceCache getPriceCache() {
        return priceCache;
    }

    /**
     * Sets the value of the priceCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceCache }
     *     
     */
    public void setPriceCache(PriceCache value) {
        this.priceCache = value;
    }

    /**
     * Gets the value of the tripProposalReference property.
     * 
     * @return
     *     possible object is
     *     {@link TripProposalReference }
     *     
     */
    public TripProposalReference getTripProposalReference() {
        return tripProposalReference;
    }

    /**
     * Sets the value of the tripProposalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripProposalReference }
     *     
     */
    public void setTripProposalReference(TripProposalReference value) {
        this.tripProposalReference = value;
    }

    /**
     * Gets the value of the insuranceOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptOut }
     *     
     */
    public InsuranceOptOut getInsuranceOptOut() {
        return insuranceOptOut;
    }

    /**
     * Sets the value of the insuranceOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptOut }
     *     
     */
    public void setInsuranceOptOut(InsuranceOptOut value) {
        this.insuranceOptOut = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileType }
     *     
     */
    public ProfileType getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileType }
     *     
     */
    public void setProfile(ProfileType value) {
        this.profile = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * @return
     *     possible object is
     *     {@link Review }
     *     
     */
    public Review getReview() {
        return review;
    }

    /**
     * Sets the value of the review property.
     * 
     * @param value
     *     allowed object is
     *     {@link Review }
     *     
     */
    public void setReview(Review value) {
        this.review = value;
    }

    /**
     * Gets the value of the segmentAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentAssociation }
     * 
     * 
     */
    public List<SegmentAssociation> getSegmentAssociation() {
        if (segmentAssociation == null) {
            segmentAssociation = new ArrayList<SegmentAssociation>();
        }
        return this.segmentAssociation;
    }

    /**
     * Gets the value of the nameAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameAssociationTag }
     * 
     * 
     */
    public List<NameAssociationTag> getNameAssociation() {
        if (nameAssociation == null) {
            nameAssociation = new ArrayList<NameAssociationTag>();
        }
        return this.nameAssociation;
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
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the displayIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayIndex() {
        return displayIndex;
    }

    /**
     * Sets the value of the displayIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayIndex(Integer value) {
        this.displayIndex = value;
    }

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementId(String value) {
        this.elementId = value;
    }

    /**
     * Gets the value of the transient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransient() {
        return _transient;
    }

    /**
     * Sets the value of the transient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransient(Boolean value) {
        this._transient = value;
    }

}
