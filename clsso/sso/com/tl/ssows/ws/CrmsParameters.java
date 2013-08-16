
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrmsParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmsParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows.parameters}tlCrms8ContactId" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows.parameters}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmsParameters", propOrder = {
    "tlCrms8ContactId",
    "token"
})
public class CrmsParameters {

    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String tlCrms8ContactId;
    @XmlElement(namespace = "java:com.tl.ssows.parameters")
    protected String token;

    /**
     * Gets the value of the tlCrms8ContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlCrms8ContactId() {
        return tlCrms8ContactId;
    }

    /**
     * Sets the value of the tlCrms8ContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlCrms8ContactId(String value) {
        this.tlCrms8ContactId = value;
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
