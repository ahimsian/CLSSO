
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tl.ssows.Groups;


/**
 * <p>Java class for ModifyGroupParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyGroupParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}group"/>
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
@XmlType(name = "ModifyGroupParameters", propOrder = {
    "group",
    "groupCn",
    "token"
})
public class ModifyGroupParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected Groups group;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String groupCn;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String token;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroup(Groups value) {
        this.group = value;
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
