//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.services.res.or.v1_14;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerStatusEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerStatusEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassengerStatusEnumType")
@XmlEnum
public enum PassengerStatusEnumType {


    /**
     * Residency.
     * 
     */
    R,

    /**
     * Employment.
     * 
     */
    E,

    /**
     * Nationality.
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static PassengerStatusEnumType fromValue(String v) {
        return valueOf(v);
    }

}
