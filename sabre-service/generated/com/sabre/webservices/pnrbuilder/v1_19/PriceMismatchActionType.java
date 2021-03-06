//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceMismatchActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceMismatchActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REJECT"/&gt;
 *     &lt;enumeration value="ACCEPT_ANY_PRICE"/&gt;
 *     &lt;enumeration value="ACCEPT_LOWER_PRICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceMismatchActionType")
@XmlEnum
public enum PriceMismatchActionType {

    REJECT,
    ACCEPT_ANY_PRICE,
    ACCEPT_LOWER_PRICE;

    public String value() {
        return name();
    }

    public static PriceMismatchActionType fromValue(String v) {
        return valueOf(v);
    }

}
