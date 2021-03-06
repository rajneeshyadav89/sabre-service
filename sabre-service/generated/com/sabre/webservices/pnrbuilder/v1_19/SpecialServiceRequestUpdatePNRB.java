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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialServiceRequestUpdate.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialServiceRequestUpdate.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameAssociationList" type="{http://webservices.sabre.com/pnrbuilder/v1_19}NameAssociationList.PNRB" minOccurs="0"/&gt;
 *         &lt;element name="SegmentAssociationList" type="{http://webservices.sabre.com/pnrbuilder/v1_19}SegmentAssociationList.PNRB" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="SpecialServiceRequestText" type="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString" minOccurs="0"/&gt;
 *           &lt;element name="SpecialService" type="{http://webservices.sabre.com/pnrbuilder/v1_19}SpecialService.PNRB" minOccurs="0"/&gt;
 *           &lt;element name="OtherSupplementaryInformation" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OSIRequest.PNRB" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://webservices.sabre.com/pnrbuilder/v1_19}UniqueIdentifier.PNRB" /&gt;
 *       &lt;attribute name="op" type="{http://webservices.sabre.com/pnrbuilder/v1_19}OperationType.PNRB" /&gt;
 *       &lt;attribute name="type" type="{http://webservices.sabre.com/pnrbuilder/v1_19}FactType.PNRB" default="H" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceRequestUpdate.PNRB", propOrder = {
    "nameAssociationList",
    "segmentAssociationList",
    "specialServiceRequestText",
    "specialService",
    "otherSupplementaryInformation"
})
public class SpecialServiceRequestUpdatePNRB {

    @XmlElement(name = "NameAssociationList")
    protected NameAssociationListPNRB nameAssociationList;
    @XmlElement(name = "SegmentAssociationList")
    protected SegmentAssociationListPNRB segmentAssociationList;
    @XmlElement(name = "SpecialServiceRequestText")
    protected String specialServiceRequestText;
    @XmlElement(name = "SpecialService")
    protected SpecialServicePNRB specialService;
    @XmlElement(name = "OtherSupplementaryInformation")
    protected OSIRequestPNRB otherSupplementaryInformation;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "op")
    protected OperationTypePNRB op;
    @XmlAttribute(name = "type")
    protected FactTypePNRB type;

    /**
     * Gets the value of the nameAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link NameAssociationListPNRB }
     *     
     */
    public NameAssociationListPNRB getNameAssociationList() {
        return nameAssociationList;
    }

    /**
     * Sets the value of the nameAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAssociationListPNRB }
     *     
     */
    public void setNameAssociationList(NameAssociationListPNRB value) {
        this.nameAssociationList = value;
    }

    /**
     * Gets the value of the segmentAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentAssociationListPNRB }
     *     
     */
    public SegmentAssociationListPNRB getSegmentAssociationList() {
        return segmentAssociationList;
    }

    /**
     * Sets the value of the segmentAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentAssociationListPNRB }
     *     
     */
    public void setSegmentAssociationList(SegmentAssociationListPNRB value) {
        this.segmentAssociationList = value;
    }

    /**
     * Gets the value of the specialServiceRequestText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialServiceRequestText() {
        return specialServiceRequestText;
    }

    /**
     * Sets the value of the specialServiceRequestText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialServiceRequestText(String value) {
        this.specialServiceRequestText = value;
    }

    /**
     * Gets the value of the specialService property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialServicePNRB }
     *     
     */
    public SpecialServicePNRB getSpecialService() {
        return specialService;
    }

    /**
     * Sets the value of the specialService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServicePNRB }
     *     
     */
    public void setSpecialService(SpecialServicePNRB value) {
        this.specialService = value;
    }

    /**
     * Gets the value of the otherSupplementaryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OSIRequestPNRB }
     *     
     */
    public OSIRequestPNRB getOtherSupplementaryInformation() {
        return otherSupplementaryInformation;
    }

    /**
     * Sets the value of the otherSupplementaryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSIRequestPNRB }
     *     
     */
    public void setOtherSupplementaryInformation(OSIRequestPNRB value) {
        this.otherSupplementaryInformation = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FactTypePNRB }
     *     
     */
    public FactTypePNRB getType() {
        if (type == null) {
            return FactTypePNRB.H;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactTypePNRB }
     *     
     */
    public void setType(FactTypePNRB value) {
        this.type = value;
    }

}
