
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenameParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenameParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}newUid"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}oldGuid"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}oldUid"/>
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
@XmlType(name = "RenameParameters", propOrder = {
    "newUid",
    "oldGuid",
    "oldUid",
    "token"
})
public class RenameParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String newUid;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String oldGuid;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String oldUid;
    @XmlElement(namespace = "java:com.tl.ssows.parameters", required = true)
    protected String token;

    /**
     * Gets the value of the newUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUid() {
        return newUid;
    }

    /**
     * Sets the value of the newUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUid(String value) {
        this.newUid = value;
    }

    /**
     * Gets the value of the oldGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldGuid() {
        return oldGuid;
    }

    /**
     * Sets the value of the oldGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldGuid(String value) {
        this.oldGuid = value;
    }

    /**
     * Gets the value of the oldUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldUid() {
        return oldUid;
    }

    /**
     * Sets the value of the oldUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldUid(String value) {
        this.oldUid = value;
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
