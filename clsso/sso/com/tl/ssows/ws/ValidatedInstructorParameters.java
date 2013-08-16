
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidatedInstructorParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidatedInstructorParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}adminToken"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}guid" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}username" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}validatedInstructor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidatedInstructorParameters", propOrder = {
    "adminToken",
    "guid",
    "username",
    "validatedInstructor"
})
public class ValidatedInstructorParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String adminToken;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String guid;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String username;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String validatedInstructor;

    /**
     * Gets the value of the adminToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminToken() {
        return adminToken;
    }

    /**
     * Sets the value of the adminToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminToken(String value) {
        this.adminToken = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the validatedInstructor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatedInstructor() {
        return validatedInstructor;
    }

    /**
     * Sets the value of the validatedInstructor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatedInstructor(String value) {
        this.validatedInstructor = value;
    }

}
