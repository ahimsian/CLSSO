
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDirectGroupMembershipParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDirectGroupMembershipParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}adminToken" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}username" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}guid" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}userToken" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}groupName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDirectGroupMembershipParameters", propOrder = {
    "adminToken",
    "username",
    "guid",
    "userToken",
    "groupName"
})
public class GetDirectGroupMembershipParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String adminToken;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String username;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String guid;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String userToken;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String groupName;

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
     * Gets the value of the userToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserToken() {
        return userToken;
    }

    /**
     * Sets the value of the userToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserToken(String value) {
        this.userToken = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

}
