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
 * Point of Sale (POS) is the details identifying the party or connection channel making the
 *                 request.
 *             
 * 
 * <p>Java class for POS_Type.PNRB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POS_Type.PNRB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" type="{http://webservices.sabre.com/pnrbuilder/v1_19}SourceType.PNRB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AirExtras" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InhibitCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POS_Type.PNRB", propOrder = {
    "source"
})
public class POSTypePNRB {

    @XmlElement(name = "Source")
    protected SourceTypePNRB source;
    @XmlAttribute(name = "AirExtras")
    protected Boolean airExtras;
    @XmlAttribute(name = "InhibitCode")
    protected String inhibitCode;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypePNRB }
     *     
     */
    public SourceTypePNRB getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypePNRB }
     *     
     */
    public void setSource(SourceTypePNRB value) {
        this.source = value;
    }

    /**
     * Gets the value of the airExtras property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirExtras() {
        return airExtras;
    }

    /**
     * Sets the value of the airExtras property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirExtras(Boolean value) {
        this.airExtras = value;
    }

    /**
     * Gets the value of the inhibitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhibitCode() {
        return inhibitCode;
    }

    /**
     * Sets the value of the inhibitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhibitCode(String value) {
        this.inhibitCode = value;
    }

}
