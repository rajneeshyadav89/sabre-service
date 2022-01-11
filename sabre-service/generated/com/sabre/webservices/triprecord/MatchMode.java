//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.triprecord;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXACT"/&gt;
 *     &lt;enumeration value="START"/&gt;
 *     &lt;enumeration value="END"/&gt;
 *     &lt;enumeration value="ANYWHERE"/&gt;
 *     &lt;enumeration value="SIMILAR"/&gt;
 *     &lt;enumeration value="EXACT_NO_COMPRESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MatchMode")
@XmlEnum
public enum MatchMode {

    EXACT,
    START,
    END,
    ANYWHERE,
    SIMILAR,
    EXACT_NO_COMPRESS;

    public String value() {
        return name();
    }

    public static MatchMode fromValue(String v) {
        return valueOf(v);
    }

}