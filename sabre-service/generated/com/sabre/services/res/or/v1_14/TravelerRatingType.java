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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Customer Value Scores and Frequent Flyer Tiers for one traveler. It
 *                 can influence Availability results when provided.
 *             
 * 
 * <p>Java class for TravelerRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerRatingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Score" type="{http://services.sabre.com/res/or/v1_14}ScoreType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="FrequentFlyer" type="{http://services.sabre.com/res/or/v1_14}FrequentFlyerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerRatingType", propOrder = {
    "score",
    "frequentFlyer"
})
public class TravelerRatingType {

    @XmlElement(name = "Score")
    protected List<ScoreType> score;
    @XmlElement(name = "FrequentFlyer")
    protected List<FrequentFlyerType> frequentFlyer;

    /**
     * Gets the value of the score property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the score property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreType }
     * 
     * 
     */
    public List<ScoreType> getScore() {
        if (score == null) {
            score = new ArrayList<ScoreType>();
        }
        return this.score;
    }

    /**
     * Gets the value of the frequentFlyer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequentFlyer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequentFlyer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentFlyerType }
     * 
     * 
     */
    public List<FrequentFlyerType> getFrequentFlyer() {
        if (frequentFlyer == null) {
            frequentFlyer = new ArrayList<FrequentFlyerType>();
        }
        return this.frequentFlyer;
    }

}