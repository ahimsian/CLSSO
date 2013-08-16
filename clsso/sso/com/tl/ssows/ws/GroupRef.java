
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import language_builtins.lang.ArrayOfString;


/**
 * <p>Java class for GroupRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows}cn"/>
 *         &lt;element ref="{java:com.tl.ssows}ERightsId"/>
 *         &lt;element ref="{java:com.tl.ssows}host"/>
 *         &lt;element ref="{java:com.tl.ssows}resourceItems"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupRef", propOrder = {
    "cn",
    "eRightsId",
    "host",
    "resourceItems"
})
public class GroupRef {

    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String cn;
    @XmlElement(name = "ERightsId", namespace = "java:com.tl.ssows", required = true)
    protected String eRightsId;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String host;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected ArrayOfString resourceItems;

    /**
     * Gets the value of the cn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCn() {
        return cn;
    }

    /**
     * Sets the value of the cn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCn(String value) {
        this.cn = value;
    }

    /**
     * Gets the value of the eRightsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERightsId() {
        return eRightsId;
    }

    /**
     * Sets the value of the eRightsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERightsId(String value) {
        this.eRightsId = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the resourceItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getResourceItems() {
        return resourceItems;
    }

    /**
     * Sets the value of the resourceItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setResourceItems(ArrayOfString value) {
        this.resourceItems = value;
    }

}
