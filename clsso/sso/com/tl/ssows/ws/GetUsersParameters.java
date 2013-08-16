
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUsersParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUsersParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}person"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}token"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}returnGroups" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUsersParameters", propOrder = {
    "person",
    "token",
    "returnGroups"
})
public class GetUsersParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected TLPerson person;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String token;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String returnGroups;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link TLPerson }
     *     
     */
    public TLPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLPerson }
     *     
     */
    public void setPerson(TLPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the returnGroups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnGroups() {
        return returnGroups;
    }

    /**
     * Sets the value of the returnGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnGroups(String value) {
        this.returnGroups = value;
    }

}
