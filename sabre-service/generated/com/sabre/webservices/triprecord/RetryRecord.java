//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.triprecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestType" type="{http://webservices.sabre.com/triprecord}RetryRecordRequestType"/&gt;
 *         &lt;element name="ServiceLocation" type="{http://webservices.sabre.com/triprecord}RetryRecordServiceLocation" minOccurs="0"/&gt;
 *         &lt;element name="RequestData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastRetryAttempt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumberOfRetryAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CurrentNumberOfRetryAttempt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RetryDueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyOfRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EndOfRetry" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://webservices.sabre.com/triprecord}RetryRecordStatus" minOccurs="0"/&gt;
 *         &lt;element name="CreationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ErrorCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrPartition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestType",
    "serviceLocation",
    "requestData",
    "lastRetryAttempt",
    "totalNumberOfRetryAttempts",
    "currentNumberOfRetryAttempt",
    "retryDueTime",
    "frequencyOfRetries",
    "endOfRetry",
    "status",
    "creationTimestamp",
    "errorCause",
    "additionalData",
    "uniqueId",
    "pnrLocator",
    "pnrPartition"
})
@XmlRootElement(name = "RetryRecord")
public class RetryRecord {

    @XmlElement(name = "RequestType", required = true)
    @XmlSchemaType(name = "string")
    protected RetryRecordRequestType requestType;
    @XmlElement(name = "ServiceLocation")
    @XmlSchemaType(name = "string")
    protected RetryRecordServiceLocation serviceLocation;
    @XmlElement(name = "RequestData")
    protected String requestData;
    @XmlElement(name = "LastRetryAttempt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRetryAttempt;
    @XmlElement(name = "TotalNumberOfRetryAttempts")
    protected Integer totalNumberOfRetryAttempts;
    @XmlElement(name = "CurrentNumberOfRetryAttempt")
    protected Integer currentNumberOfRetryAttempt;
    @XmlElement(name = "RetryDueTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retryDueTime;
    @XmlElement(name = "FrequencyOfRetries")
    protected Integer frequencyOfRetries;
    @XmlElement(name = "EndOfRetry")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endOfRetry;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected RetryRecordStatus status;
    @XmlElement(name = "CreationTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimestamp;
    @XmlElement(name = "ErrorCause")
    protected String errorCause;
    @XmlElement(name = "AdditionalData")
    protected String additionalData;
    @XmlElement(name = "UniqueId")
    protected String uniqueId;
    @XmlElement(name = "PnrLocator")
    protected String pnrLocator;
    @XmlElement(name = "PnrPartition")
    protected String pnrPartition;

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RetryRecordRequestType }
     *     
     */
    public RetryRecordRequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetryRecordRequestType }
     *     
     */
    public void setRequestType(RetryRecordRequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the serviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RetryRecordServiceLocation }
     *     
     */
    public RetryRecordServiceLocation getServiceLocation() {
        return serviceLocation;
    }

    /**
     * Sets the value of the serviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetryRecordServiceLocation }
     *     
     */
    public void setServiceLocation(RetryRecordServiceLocation value) {
        this.serviceLocation = value;
    }

    /**
     * Gets the value of the requestData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestData() {
        return requestData;
    }

    /**
     * Sets the value of the requestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestData(String value) {
        this.requestData = value;
    }

    /**
     * Gets the value of the lastRetryAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRetryAttempt() {
        return lastRetryAttempt;
    }

    /**
     * Sets the value of the lastRetryAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRetryAttempt(XMLGregorianCalendar value) {
        this.lastRetryAttempt = value;
    }

    /**
     * Gets the value of the totalNumberOfRetryAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfRetryAttempts() {
        return totalNumberOfRetryAttempts;
    }

    /**
     * Sets the value of the totalNumberOfRetryAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfRetryAttempts(Integer value) {
        this.totalNumberOfRetryAttempts = value;
    }

    /**
     * Gets the value of the currentNumberOfRetryAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentNumberOfRetryAttempt() {
        return currentNumberOfRetryAttempt;
    }

    /**
     * Sets the value of the currentNumberOfRetryAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentNumberOfRetryAttempt(Integer value) {
        this.currentNumberOfRetryAttempt = value;
    }

    /**
     * Gets the value of the retryDueTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetryDueTime() {
        return retryDueTime;
    }

    /**
     * Sets the value of the retryDueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetryDueTime(XMLGregorianCalendar value) {
        this.retryDueTime = value;
    }

    /**
     * Gets the value of the frequencyOfRetries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequencyOfRetries() {
        return frequencyOfRetries;
    }

    /**
     * Sets the value of the frequencyOfRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequencyOfRetries(Integer value) {
        this.frequencyOfRetries = value;
    }

    /**
     * Gets the value of the endOfRetry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfRetry() {
        return endOfRetry;
    }

    /**
     * Sets the value of the endOfRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfRetry(XMLGregorianCalendar value) {
        this.endOfRetry = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RetryRecordStatus }
     *     
     */
    public RetryRecordStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetryRecordStatus }
     *     
     */
    public void setStatus(RetryRecordStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimestamp(XMLGregorianCalendar value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the errorCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCause() {
        return errorCause;
    }

    /**
     * Sets the value of the errorCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCause(String value) {
        this.errorCause = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the pnrLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrLocator() {
        return pnrLocator;
    }

    /**
     * Sets the value of the pnrLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrLocator(String value) {
        this.pnrLocator = value;
    }

    /**
     * Gets the value of the pnrPartition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrPartition() {
        return pnrPartition;
    }

    /**
     * Sets the value of the pnrPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrPartition(String value) {
        this.pnrPartition = value;
    }

}
