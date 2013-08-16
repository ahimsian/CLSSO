
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshTokenParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefreshTokenParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}adminToken"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}userToken"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshTokenParameters", propOrder = {
    "adminToken",
    "userToken"
})
public class RefreshTokenParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String adminToken;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String userToken;

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

}
