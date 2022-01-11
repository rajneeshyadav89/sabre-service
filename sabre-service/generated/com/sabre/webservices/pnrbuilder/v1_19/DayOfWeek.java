//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeek.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeek"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Mon"/&gt;
 *     &lt;enumeration value="Tue"/&gt;
 *     &lt;enumeration value="Wed"/&gt;
 *     &lt;enumeration value="Thu"/&gt;
 *     &lt;enumeration value="Fri"/&gt;
 *     &lt;enumeration value="Sat"/&gt;
 *     &lt;enumeration value="Sun"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeek")
@XmlEnum
public enum DayOfWeek {

    @XmlEnumValue("Mon")
    MON("Mon"),
    @XmlEnumValue("Tue")
    TUE("Tue"),
    @XmlEnumValue("Wed")
    WED("Wed"),
    @XmlEnumValue("Thu")
    THU("Thu"),
    @XmlEnumValue("Fri")
    FRI("Fri"),
    @XmlEnumValue("Sat")
    SAT("Sat"),
    @XmlEnumValue("Sun")
    SUN("Sun");
    private final String value;

    DayOfWeek(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayOfWeek fromValue(String v) {
        for (DayOfWeek c: DayOfWeek.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
