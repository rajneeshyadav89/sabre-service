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
 * <p>Java class for _PaymentCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="_PaymentCardType"&gt;
 *   &lt;restriction base="{http://webservices.sabre.com/pnrbuilder/v1_19}CommonString"&gt;
 *     &lt;enumeration value="AX"/&gt;
 *     &lt;enumeration value="BC"/&gt;
 *     &lt;enumeration value="BL"/&gt;
 *     &lt;enumeration value="CB"/&gt;
 *     &lt;enumeration value="DN"/&gt;
 *     &lt;enumeration value="DS"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="JC"/&gt;
 *     &lt;enumeration value="MA"/&gt;
 *     &lt;enumeration value="MC"/&gt;
 *     &lt;enumeration value="TP"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "_PaymentCardType")
@XmlEnum
public enum PaymentCardType {

    AX,
    BC,
    BL,
    CB,
    DN,
    DS,
    EC,
    JC,
    MA,
    MC,
    TP,
    VI;

    public String value() {
        return name();
    }

    public static PaymentCardType fromValue(String v) {
        return valueOf(v);
    }

}
