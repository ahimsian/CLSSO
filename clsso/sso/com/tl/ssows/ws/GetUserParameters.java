
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUserParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}guid"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}token"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}uid"/>
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
@XmlType(name = "GetUserParameters", propOrder = {
    "guid",
    "token",
    "uid",
    "returnGroups"
})
public class GetUserParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String guid;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String token;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String uid;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String returnGroups;

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
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
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
