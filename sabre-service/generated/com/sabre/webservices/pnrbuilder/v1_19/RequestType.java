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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://webservices.sabre.com/pnrbuilder/v1_19&gt;RequestEnumerationType"&gt;
 *       &lt;attribute name="commitTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="initialIgnore" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "value"
})
public class RequestType {

    @XmlValue
    protected RequestEnumerationType value;
    @XmlAttribute(name = "commitTransaction")
    protected Boolean commitTransaction;
    @XmlAttribute(name = "initialIgnore")
    protected Boolean initialIgnore;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link RequestEnumerationType }
     *     
     */
    public RequestEnumerationType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestEnumerationType }
     *     
     */
    public void setValue(RequestEnumerationType value) {
        this.value = value;
    }

    /**
     * Gets the value of the commitTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommitTransaction() {
        return commitTransaction;
    }

    /**
     * Sets the value of the commitTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommitTransaction(Boolean value) {
        this.commitTransaction = value;
    }

    /**
     * Gets the value of the initialIgnore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInitialIgnore() {
        return initialIgnore;
    }

    /**
     * Sets the value of the initialIgnore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitialIgnore(Boolean value) {
        this.initialIgnore = value;
    }

}