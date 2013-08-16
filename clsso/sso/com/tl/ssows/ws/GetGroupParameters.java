
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGroupParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGroupParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}ERightsId"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}getUniqueGroups"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}groupCn"/>
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
@XmlType(name = "GetGroupParameters", propOrder = {
    "eRightsId",
    "getUniqueGroups",
    "groupCn",
    "token"
})
public class GetGroupParameters {

    @XmlElement(name = "ERightsId", namespace = "java:com.tl.ssows.parameters", required = true)
    protected String eRightsId;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected boolean getUniqueGroups;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String groupCn;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String token;

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
     * Gets the value of the getUniqueGroups property.
     * 
     */
    public boolean isGetUniqueGroups() {
        return getUniqueGroups;
    }

    /**
     * Sets the value of the getUniqueGroups property.
     * 
     */
    public void setGetUniqueGroups(boolean value) {
        this.getUniqueGroups = value;
    }

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
