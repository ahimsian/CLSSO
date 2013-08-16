
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveResourceItemParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveResourceItemParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}groupCn"/>
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
@XmlType(name = "RemoveResourceItemParameters", propOrder = {
    "groupCn",
    "resourceItem",
    "token"
})
public class RemoveResourceItemParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String groupCn;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String resourceItem;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String token;

    /**
     * Gets the value of the groupCn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCn() {
        return groupCn;
    }

    /**
     * Sets the value of the groupCn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCn(String value) {
        this.groupCn = value;
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
