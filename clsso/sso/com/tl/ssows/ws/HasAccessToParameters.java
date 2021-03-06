
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HasAccessToParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HasAccessToParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}guid"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}resourceItem"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}token"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasAccessToParameters", propOrder = {
    "guid",
    "resourceItem",
    "token"
})
public class HasAccessToParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String guid;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String resourceItem;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String token;

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
     * Gets the value of the resourceItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceItem() {
        return resourceItem;
    }

    /**
     * Sets the value of the resourceItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceItem(String value) {
        this.resourceItem = value;
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

}
