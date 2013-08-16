
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tl.ssows.ArrayOfGroups;


/**
 * <p>Java class for SSOwsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSOwsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows}branchDesignator"/>
 *         &lt;element name="groups" type="{java:com.tl.ssows}ArrayOfGroups" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows}guid" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows}resultCode"/>
 *         &lt;element ref="{java:com.tl.ssows}resultDescription"/>
 *         &lt;element ref="{java:com.tl.ssows}token"/>
 *         &lt;element ref="{java:com.tl.ssows}uid"/>
 *         &lt;element ref="{java:com.tl.ssows}users" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSOwsResult", propOrder = {
    "branchDesignator",
    "groups",
    "guid",
    "resultCode",
    "resultDescription",
    "token",
    "uid",
    "users"
})
public class SSOwsResult {

    @XmlElement(namespace = "java:com.tl.ssows")
    protected int branchDesignator;
    @XmlElement(namespace = "")
    protected ArrayOfGroups groups;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected String guid;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected int resultCode;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String resultDescription;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String token;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String uid;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected ArrayOfTLPerson users;

    /**
     * Gets the value of the branchDesignator property.
     * 
     */
    public int getBranchDesignator() {
        return branchDesignator;
    }

    /**
     * Sets the value of the branchDesignator property.
     * 
     */
    public void setBranchDesignator(int value) {
        this.branchDesignator = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroups }
     *     
     */
    public ArrayOfGroups getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroups }
     *     
     */
    public void setGroups(ArrayOfGroups value) {
        this.groups = value;
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
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDescription(String value) {
        this.resultDescription = value;
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
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTLPerson }
     *     
     */
    public ArrayOfTLPerson getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTLPerson }
     *     
     */
    public void setUsers(ArrayOfTLPerson value) {
        this.users = value;
    }

}
