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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sabre.services.res.or.v1_14.ProductDetailsType;


/**
 * <p>Java class for ProductDetailsHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetailsHistoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.sabre.com/res/or/v1_14}ProductDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistoryAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HistoryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailsHistoryType", propOrder = {
    "historyAction",
    "historyTimestamp"
})
public class ProductDetailsHistoryType
    extends ProductDetailsType
{

    @XmlElement(name = "HistoryAction")
    protected String historyAction;
    @XmlElement(name = "HistoryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historyTimestamp;
    @XmlAttribute(name = "ProductId")
    protected String productId;

    /**
     * Gets the value of the historyAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryAction() {
        return historyAction;
    }

    /**
     * Sets the value of the historyAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryAction(String value) {
        this.historyAction = value;
    }

    /**
     * Gets the value of the historyTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoryTimestamp() {
        return historyTimestamp;
    }

    /**
     * Sets the value of the historyTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoryTimestamp(XMLGregorianCalendar value) {
        this.historyTimestamp = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

}
