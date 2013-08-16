
package com.tl.ssows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import language_builtins.lang.ArrayOfString;


/**
 * <p>Java class for TLPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows}c"/>
 *         &lt;element ref="{java:com.tl.ssows}cn"/>
 *         &lt;element ref="{java:com.tl.ssows}createTimestamp"/>
 *         &lt;element ref="{java:com.tl.ssows}creatorsName"/>
 *         &lt;element ref="{java:com.tl.ssows}departmentNumber"/>
 *         &lt;element ref="{java:com.tl.ssows}dn"/>
 *         &lt;element ref="{java:com.tl.ssows}employeeNumber"/>
 *         &lt;element ref="{java:com.tl.ssows}facsimileTelephoneNumber"/>
 *         &lt;element ref="{java:com.tl.ssows}givenName"/>
 *         &lt;element ref="{java:com.tl.ssows}groups"/>
 *         &lt;element ref="{java:com.tl.ssows}guid"/>
 *         &lt;element ref="{java:com.tl.ssows}homePhone"/>
 *         &lt;element ref="{java:com.tl.ssows}homePostalAddress"/>
 *         &lt;element ref="{java:com.tl.ssows}instructor"/>
 *         &lt;element ref="{java:com.tl.ssows}l"/>
 *         &lt;element ref="{java:com.tl.ssows}mail"/>
 *         &lt;element ref="{java:com.tl.ssows}middleInitial"/>
 *         &lt;element ref="{java:com.tl.ssows}mobile"/>
 *         &lt;element ref="{java:com.tl.ssows}modifiersName"/>
 *         &lt;element ref="{java:com.tl.ssows}modifyTimestamp"/>
 *         &lt;element ref="{java:com.tl.ssows}orclSecondaryUID"/>
 *         &lt;element ref="{java:com.tl.ssows}ou"/>
 *         &lt;element ref="{java:com.tl.ssows}pager"/>
 *         &lt;element ref="{java:com.tl.ssows}postalCode"/>
 *         &lt;element ref="{java:com.tl.ssows}resourceItems"/>
 *         &lt;element ref="{java:com.tl.ssows}restrictedUser"/>
 *         &lt;element ref="{java:com.tl.ssows}searchBase"/>
 *         &lt;element ref="{java:com.tl.ssows}sn"/>
 *         &lt;element ref="{java:com.tl.ssows}st"/>
 *         &lt;element ref="{java:com.tl.ssows}street"/>
 *         &lt;element ref="{java:com.tl.ssows}TLAgeRange"/>
 *         &lt;element ref="{java:com.tl.ssows}TLB2BSiteId"/>
 *         &lt;element ref="{java:com.tl.ssows}TLCheckPointA"/>
 *         &lt;element ref="{java:com.tl.ssows}TLCheckPointQ"/>
 *         &lt;element ref="{java:com.tl.ssows}TLCity"/>
 *         &lt;element ref="{java:com.tl.ssows}TLCrms8AccountId"/>
 *         &lt;element ref="{java:com.tl.ssows}TLCrms8ContactId"/>
 *         &lt;element ref="{java:com.tl.ssows}TLCrmsContactId"/>
 *         &lt;element ref="{java:com.tl.ssows}TLCrmsValidatedInstructor"/>
 *         &lt;element ref="{java:com.tl.ssows}TLErightsId"/>
 *         &lt;element ref="{java:com.tl.ssows}TLEveningPhone"/>
 *         &lt;element ref="{java:com.tl.ssows}TLGender"/>
 *         &lt;element ref="{java:com.tl.ssows}TLInstitutionId"/>
 *         &lt;element ref="{java:com.tl.ssows}TLJDEBillTo"/>
 *         &lt;element ref="{java:com.tl.ssows}TLJDEShipTo"/>
 *         &lt;element ref="{java:com.tl.ssows}TLPWHint"/>
 *         &lt;element ref="{java:com.tl.ssows}TLPrefLang"/>
 *         &lt;element ref="{java:com.tl.ssows}TLPubcoId"/>
 *         &lt;element ref="{java:com.tl.ssows}TLRegion"/>
 *         &lt;element ref="{java:com.tl.ssows}TLSchoolAffiliation"/>
 *         &lt;element ref="{java:com.tl.ssows}TLSealedMediaUser"/>
 *         &lt;element ref="{java:com.tl.ssows}TLSerialNumbers"/>
 *         &lt;element ref="{java:com.tl.ssows}TLShipToC"/>
 *         &lt;element ref="{java:com.tl.ssows}TLShipToCity"/>
 *         &lt;element ref="{java:com.tl.ssows}TLShipToL"/>
 *         &lt;element ref="{java:com.tl.ssows}TLShipToPostalAddress"/>
 *         &lt;element ref="{java:com.tl.ssows}TLShipToPostalCode"/>
 *         &lt;element ref="{java:com.tl.ssows}TLShipToSt"/>
 *         &lt;element ref="{java:com.tl.ssows}TLTCCreationDate"/>
 *         &lt;element ref="{java:com.tl.ssows}TLTCExpireDate"/>
 *         &lt;element ref="{java:com.tl.ssows}TLTCIdCode"/>
 *         &lt;element ref="{java:com.tl.ssows}TLTCOriginalZone"/>
 *         &lt;element ref="{java:com.tl.ssows}TLTCServices"/>
 *         &lt;element ref="{java:com.tl.ssows}TLTCStatus"/>
 *         &lt;element ref="{java:com.tl.ssows}TLThomsonNowInstitutionId"/>
 *         &lt;element ref="{java:com.tl.ssows}TLUserType"/>
 *         &lt;element ref="{java:com.tl.ssows}uid"/>
 *         &lt;element ref="{java:com.tl.ssows}userPassword"/>
 *         &lt;element ref="{java:com.tl.ssows}workPhone"/>
 *         &lt;element ref="{java:com.tl.ssows}TLOptInCengage"/>
 *         &lt;element ref="{java:com.tl.ssows}TLOptInIchapters"/>
 *         &lt;element ref="{java:com.tl.ssows}emailValidated" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows}timeZone" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows}apliaTcAccepted" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows}TLInstitutionName" minOccurs="0"/>
 *         &lt;element ref="{java:com.tl.ssows}pendingInstructor"/>
 *         &lt;element ref="{java:com.tl.ssows}userType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLPerson", propOrder = {
    "c",
    "cn",
    "createTimestamp",
    "creatorsName",
    "departmentNumber",
    "dn",
    "employeeNumber",
    "facsimileTelephoneNumber",
    "givenName",
    "groups",
    "guid",
    "homePhone",
    "homePostalAddress",
    "instructor",
    "l",
    "mail",
    "middleInitial",
    "mobile",
    "modifiersName",
    "modifyTimestamp",
    "orclSecondaryUID",
    "ou",
    "pager",
    "postalCode",
    "resourceItems",
    "restrictedUser",
    "searchBase",
    "sn",
    "st",
    "street",
    "tlAgeRange",
    "tlb2BSiteId",
    "tlCheckPointA",
    "tlCheckPointQ",
    "tlCity",
    "tlCrms8AccountId",
    "tlCrms8ContactId",
    "tlCrmsContactId",
    "tlCrmsValidatedInstructor",
    "tlErightsId",
    "tlEveningPhone",
    "tlGender",
    "tlInstitutionId",
    "tljdeBillTo",
    "tljdeShipTo",
    "tlpwHint",
    "tlPrefLang",
    "tlPubcoId",
    "tlRegion",
    "tlSchoolAffiliation",
    "tlSealedMediaUser",
    "tlSerialNumbers",
    "tlShipToC",
    "tlShipToCity",
    "tlShipToL",
    "tlShipToPostalAddress",
    "tlShipToPostalCode",
    "tlShipToSt",
    "tltcCreationDate",
    "tltcExpireDate",
    "tltcIdCode",
    "tltcOriginalZone",
    "tltcServices",
    "tltcStatus",
    "tlThomsonNowInstitutionId",
    "tlUserType",
    "uid",
    "userPassword",
    "workPhone",
    "tlOptInCengage",
    "tlOptInIchapters",
    "emailValidated",
    "timeZone",
    "apliaTcAccepted",
    "tlInstitutionName",
    "pendingInstructor",
    "userType"
})
public class TLPerson {

    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String c;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String cn;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTimestamp;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String creatorsName;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String departmentNumber;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String dn;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String employeeNumber;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String facsimileTelephoneNumber;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String givenName;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected ArrayOfString groups;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String guid;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String homePhone;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String homePostalAddress;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected boolean instructor;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String l;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String mail;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String middleInitial;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String mobile;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String modifiersName;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTimestamp;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String orclSecondaryUID;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String ou;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String pager;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String postalCode;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected ArrayOfString resourceItems;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected boolean restrictedUser;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String searchBase;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String sn;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String st;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String street;
    @XmlElement(name = "TLAgeRange", namespace = "java:com.tl.ssows", required = true)
    protected String tlAgeRange;
    @XmlElement(name = "TLB2BSiteId", namespace = "java:com.tl.ssows", required = true)
    protected String tlb2BSiteId;
    @XmlElement(name = "TLCheckPointA", namespace = "java:com.tl.ssows", required = true)
    protected String tlCheckPointA;
    @XmlElement(name = "TLCheckPointQ", namespace = "java:com.tl.ssows", required = true)
    protected String tlCheckPointQ;
    @XmlElement(name = "TLCity", namespace = "java:com.tl.ssows", required = true)
    protected String tlCity;
    @XmlElement(name = "TLCrms8AccountId", namespace = "java:com.tl.ssows", required = true)
    protected String tlCrms8AccountId;
    @XmlElement(name = "TLCrms8ContactId", namespace = "java:com.tl.ssows", required = true)
    protected String tlCrms8ContactId;
    @XmlElement(name = "TLCrmsContactId", namespace = "java:com.tl.ssows", required = true)
    protected String tlCrmsContactId;
    @XmlElement(name = "TLCrmsValidatedInstructor", namespace = "java:com.tl.ssows")
    protected boolean tlCrmsValidatedInstructor;
    @XmlElement(name = "TLErightsId", namespace = "java:com.tl.ssows", required = true)
    protected String tlErightsId;
    @XmlElement(name = "TLEveningPhone", namespace = "java:com.tl.ssows", required = true)
    protected String tlEveningPhone;
    @XmlElement(name = "TLGender", namespace = "java:com.tl.ssows", required = true)
    protected String tlGender;
    @XmlElement(name = "TLInstitutionId", namespace = "java:com.tl.ssows", required = true)
    protected String tlInstitutionId;
    @XmlElement(name = "TLJDEBillTo", namespace = "java:com.tl.ssows", required = true)
    protected String tljdeBillTo;
    @XmlElement(name = "TLJDEShipTo", namespace = "java:com.tl.ssows", required = true)
    protected String tljdeShipTo;
    @XmlElement(name = "TLPWHint", namespace = "java:com.tl.ssows", required = true)
    protected String tlpwHint;
    @XmlElement(name = "TLPrefLang", namespace = "java:com.tl.ssows", required = true)
    protected String tlPrefLang;
    @XmlElement(name = "TLPubcoId", namespace = "java:com.tl.ssows", required = true)
    protected String tlPubcoId;
    @XmlElement(name = "TLRegion", namespace = "java:com.tl.ssows", required = true)
    protected String tlRegion;
    @XmlElement(name = "TLSchoolAffiliation", namespace = "java:com.tl.ssows", required = true)
    protected String tlSchoolAffiliation;
    @XmlElement(name = "TLSealedMediaUser", namespace = "java:com.tl.ssows", required = true)
    protected String tlSealedMediaUser;
    @XmlElement(name = "TLSerialNumbers", namespace = "java:com.tl.ssows", required = true)
    protected String tlSerialNumbers;
    @XmlElement(name = "TLShipToC", namespace = "java:com.tl.ssows", required = true)
    protected String tlShipToC;
    @XmlElement(name = "TLShipToCity", namespace = "java:com.tl.ssows", required = true)
    protected String tlShipToCity;
    @XmlElement(name = "TLShipToL", namespace = "java:com.tl.ssows", required = true)
    protected String tlShipToL;
    @XmlElement(name = "TLShipToPostalAddress", namespace = "java:com.tl.ssows", required = true)
    protected String tlShipToPostalAddress;
    @XmlElement(name = "TLShipToPostalCode", namespace = "java:com.tl.ssows", required = true)
    protected String tlShipToPostalCode;
    @XmlElement(name = "TLShipToSt", namespace = "java:com.tl.ssows", required = true)
    protected String tlShipToSt;
    @XmlElement(name = "TLTCCreationDate", namespace = "java:com.tl.ssows", required = true)
    protected String tltcCreationDate;
    @XmlElement(name = "TLTCExpireDate", namespace = "java:com.tl.ssows", required = true)
    protected String tltcExpireDate;
    @XmlElement(name = "TLTCIdCode", namespace = "java:com.tl.ssows", required = true)
    protected String tltcIdCode;
    @XmlElement(name = "TLTCOriginalZone", namespace = "java:com.tl.ssows", required = true)
    protected String tltcOriginalZone;
    @XmlElement(name = "TLTCServices", namespace = "java:com.tl.ssows", required = true)
    protected String tltcServices;
    @XmlElement(name = "TLTCStatus", namespace = "java:com.tl.ssows", required = true)
    protected String tltcStatus;
    @XmlElement(name = "TLThomsonNowInstitutionId", namespace = "java:com.tl.ssows", required = true)
    protected String tlThomsonNowInstitutionId;
    @XmlElement(name = "TLUserType", namespace = "java:com.tl.ssows", required = true)
    protected String tlUserType;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String uid;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String userPassword;
    @XmlElement(namespace = "java:com.tl.ssows", required = true)
    protected String workPhone;
    @XmlElement(name = "TLOptInCengage", namespace = "java:com.tl.ssows", required = true)
    protected String tlOptInCengage;
    @XmlElement(name = "TLOptInIchapters", namespace = "java:com.tl.ssows", required = true)
    protected String tlOptInIchapters;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected String emailValidated;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected String timeZone;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected String apliaTcAccepted;
    @XmlElement(name = "TLInstitutionName", namespace = "java:com.tl.ssows")
    protected String tlInstitutionName;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected boolean pendingInstructor;
    @XmlElement(namespace = "java:com.tl.ssows")
    protected String userType;

    /**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC(String value) {
        this.c = value;
    }

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
     * Gets the value of the createTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * Sets the value of the createTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTimestamp(XMLGregorianCalendar value) {
        this.createTimestamp = value;
    }

    /**
     * Gets the value of the creatorsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorsName() {
        return creatorsName;
    }

    /**
     * Sets the value of the creatorsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorsName(String value) {
        this.creatorsName = value;
    }

    /**
     * Gets the value of the departmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentNumber() {
        return departmentNumber;
    }

    /**
     * Sets the value of the departmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentNumber(String value) {
        this.departmentNumber = value;
    }

    /**
     * Gets the value of the dn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDn() {
        return dn;
    }

    /**
     * Sets the value of the dn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDn(String value) {
        this.dn = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the facsimileTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacsimileTelephoneNumber() {
        return facsimileTelephoneNumber;
    }

    /**
     * Sets the value of the facsimileTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacsimileTelephoneNumber(String value) {
        this.facsimileTelephoneNumber = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGroups(ArrayOfString value) {
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
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the homePostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePostalAddress() {
        return homePostalAddress;
    }

    /**
     * Sets the value of the homePostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePostalAddress(String value) {
        this.homePostalAddress = value;
    }

    /**
     * Gets the value of the instructor property.
     * 
     */
    public boolean isInstructor() {
        return instructor;
    }

    /**
     * Sets the value of the instructor property.
     * 
     */
    public void setInstructor(boolean value) {
        this.instructor = value;
    }

    /**
     * Gets the value of the l property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL(String value) {
        this.l = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the middleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Sets the value of the middleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the modifiersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiersName() {
        return modifiersName;
    }

    /**
     * Sets the value of the modifiersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiersName(String value) {
        this.modifiersName = value;
    }

    /**
     * Gets the value of the modifyTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyTimestamp() {
        return modifyTimestamp;
    }

    /**
     * Sets the value of the modifyTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyTimestamp(XMLGregorianCalendar value) {
        this.modifyTimestamp = value;
    }

    /**
     * Gets the value of the orclSecondaryUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrclSecondaryUID() {
        return orclSecondaryUID;
    }

    /**
     * Sets the value of the orclSecondaryUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrclSecondaryUID(String value) {
        this.orclSecondaryUID = value;
    }

    /**
     * Gets the value of the ou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOu() {
        return ou;
    }

    /**
     * Sets the value of the ou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOu(String value) {
        this.ou = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPager(String value) {
        this.pager = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
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

    /**
     * Gets the value of the restrictedUser property.
     * 
     */
    public boolean isRestrictedUser() {
        return restrictedUser;
    }

    /**
     * Sets the value of the restrictedUser property.
     * 
     */
    public void setRestrictedUser(boolean value) {
        this.restrictedUser = value;
    }

    /**
     * Gets the value of the searchBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchBase() {
        return searchBase;
    }

    /**
     * Sets the value of the searchBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchBase(String value) {
        this.searchBase = value;
    }

    /**
     * Gets the value of the sn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSn() {
        return sn;
    }

    /**
     * Sets the value of the sn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSn(String value) {
        this.sn = value;
    }

    /**
     * Gets the value of the st property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt() {
        return st;
    }

    /**
     * Sets the value of the st property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt(String value) {
        this.st = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the tlAgeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLAgeRange() {
        return tlAgeRange;
    }

    /**
     * Sets the value of the tlAgeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLAgeRange(String value) {
        this.tlAgeRange = value;
    }

    /**
     * Gets the value of the tlb2BSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLB2BSiteId() {
        return tlb2BSiteId;
    }

    /**
     * Sets the value of the tlb2BSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLB2BSiteId(String value) {
        this.tlb2BSiteId = value;
    }

    /**
     * Gets the value of the tlCheckPointA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLCheckPointA() {
        return tlCheckPointA;
    }

    /**
     * Sets the value of the tlCheckPointA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLCheckPointA(String value) {
        this.tlCheckPointA = value;
    }

    /**
     * Gets the value of the tlCheckPointQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLCheckPointQ() {
        return tlCheckPointQ;
    }

    /**
     * Sets the value of the tlCheckPointQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLCheckPointQ(String value) {
        this.tlCheckPointQ = value;
    }

    /**
     * Gets the value of the tlCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLCity() {
        return tlCity;
    }

    /**
     * Sets the value of the tlCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLCity(String value) {
        this.tlCity = value;
    }

    /**
     * Gets the value of the tlCrms8AccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLCrms8AccountId() {
        return tlCrms8AccountId;
    }

    /**
     * Sets the value of the tlCrms8AccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLCrms8AccountId(String value) {
        this.tlCrms8AccountId = value;
    }

    /**
     * Gets the value of the tlCrms8ContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLCrms8ContactId() {
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
    public void setTLCrms8ContactId(String value) {
        this.tlCrms8ContactId = value;
    }

    /**
     * Gets the value of the tlCrmsContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLCrmsContactId() {
        return tlCrmsContactId;
    }

    /**
     * Sets the value of the tlCrmsContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLCrmsContactId(String value) {
        this.tlCrmsContactId = value;
    }

    /**
     * Gets the value of the tlCrmsValidatedInstructor property.
     * 
     */
    public boolean isTLCrmsValidatedInstructor() {
        return tlCrmsValidatedInstructor;
    }

    /**
     * Sets the value of the tlCrmsValidatedInstructor property.
     * 
     */
    public void setTLCrmsValidatedInstructor(boolean value) {
        this.tlCrmsValidatedInstructor = value;
    }

    /**
     * Gets the value of the tlErightsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLErightsId() {
        return tlErightsId;
    }

    /**
     * Sets the value of the tlErightsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLErightsId(String value) {
        this.tlErightsId = value;
    }

    /**
     * Gets the value of the tlEveningPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLEveningPhone() {
        return tlEveningPhone;
    }

    /**
     * Sets the value of the tlEveningPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLEveningPhone(String value) {
        this.tlEveningPhone = value;
    }

    /**
     * Gets the value of the tlGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLGender() {
        return tlGender;
    }

    /**
     * Sets the value of the tlGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLGender(String value) {
        this.tlGender = value;
    }

    /**
     * Gets the value of the tlInstitutionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLInstitutionId() {
        return tlInstitutionId;
    }

    /**
     * Sets the value of the tlInstitutionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLInstitutionId(String value) {
        this.tlInstitutionId = value;
    }

    /**
     * Gets the value of the tljdeBillTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLJDEBillTo() {
        return tljdeBillTo;
    }

    /**
     * Sets the value of the tljdeBillTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLJDEBillTo(String value) {
        this.tljdeBillTo = value;
    }

    /**
     * Gets the value of the tljdeShipTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLJDEShipTo() {
        return tljdeShipTo;
    }

    /**
     * Sets the value of the tljdeShipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLJDEShipTo(String value) {
        this.tljdeShipTo = value;
    }

    /**
     * Gets the value of the tlpwHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLPWHint() {
        return tlpwHint;
    }

    /**
     * Sets the value of the tlpwHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLPWHint(String value) {
        this.tlpwHint = value;
    }

    /**
     * Gets the value of the tlPrefLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLPrefLang() {
        return tlPrefLang;
    }

    /**
     * Sets the value of the tlPrefLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLPrefLang(String value) {
        this.tlPrefLang = value;
    }

    /**
     * Gets the value of the tlPubcoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLPubcoId() {
        return tlPubcoId;
    }

    /**
     * Sets the value of the tlPubcoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLPubcoId(String value) {
        this.tlPubcoId = value;
    }

    /**
     * Gets the value of the tlRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLRegion() {
        return tlRegion;
    }

    /**
     * Sets the value of the tlRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLRegion(String value) {
        this.tlRegion = value;
    }

    /**
     * Gets the value of the tlSchoolAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLSchoolAffiliation() {
        return tlSchoolAffiliation;
    }

    /**
     * Sets the value of the tlSchoolAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLSchoolAffiliation(String value) {
        this.tlSchoolAffiliation = value;
    }

    /**
     * Gets the value of the tlSealedMediaUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLSealedMediaUser() {
        return tlSealedMediaUser;
    }

    /**
     * Sets the value of the tlSealedMediaUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLSealedMediaUser(String value) {
        this.tlSealedMediaUser = value;
    }

    /**
     * Gets the value of the tlSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLSerialNumbers() {
        return tlSerialNumbers;
    }

    /**
     * Sets the value of the tlSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLSerialNumbers(String value) {
        this.tlSerialNumbers = value;
    }

    /**
     * Gets the value of the tlShipToC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLShipToC() {
        return tlShipToC;
    }

    /**
     * Sets the value of the tlShipToC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLShipToC(String value) {
        this.tlShipToC = value;
    }

    /**
     * Gets the value of the tlShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLShipToCity() {
        return tlShipToCity;
    }

    /**
     * Sets the value of the tlShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLShipToCity(String value) {
        this.tlShipToCity = value;
    }

    /**
     * Gets the value of the tlShipToL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLShipToL() {
        return tlShipToL;
    }

    /**
     * Sets the value of the tlShipToL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLShipToL(String value) {
        this.tlShipToL = value;
    }

    /**
     * Gets the value of the tlShipToPostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLShipToPostalAddress() {
        return tlShipToPostalAddress;
    }

    /**
     * Sets the value of the tlShipToPostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLShipToPostalAddress(String value) {
        this.tlShipToPostalAddress = value;
    }

    /**
     * Gets the value of the tlShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLShipToPostalCode() {
        return tlShipToPostalCode;
    }

    /**
     * Sets the value of the tlShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLShipToPostalCode(String value) {
        this.tlShipToPostalCode = value;
    }

    /**
     * Gets the value of the tlShipToSt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLShipToSt() {
        return tlShipToSt;
    }

    /**
     * Sets the value of the tlShipToSt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLShipToSt(String value) {
        this.tlShipToSt = value;
    }

    /**
     * Gets the value of the tltcCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLTCCreationDate() {
        return tltcCreationDate;
    }

    /**
     * Sets the value of the tltcCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLTCCreationDate(String value) {
        this.tltcCreationDate = value;
    }

    /**
     * Gets the value of the tltcExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLTCExpireDate() {
        return tltcExpireDate;
    }

    /**
     * Sets the value of the tltcExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLTCExpireDate(String value) {
        this.tltcExpireDate = value;
    }

    /**
     * Gets the value of the tltcIdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLTCIdCode() {
        return tltcIdCode;
    }

    /**
     * Sets the value of the tltcIdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLTCIdCode(String value) {
        this.tltcIdCode = value;
    }

    /**
     * Gets the value of the tltcOriginalZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLTCOriginalZone() {
        return tltcOriginalZone;
    }

    /**
     * Sets the value of the tltcOriginalZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLTCOriginalZone(String value) {
        this.tltcOriginalZone = value;
    }

    /**
     * Gets the value of the tltcServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLTCServices() {
        return tltcServices;
    }

    /**
     * Sets the value of the tltcServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLTCServices(String value) {
        this.tltcServices = value;
    }

    /**
     * Gets the value of the tltcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLTCStatus() {
        return tltcStatus;
    }

    /**
     * Sets the value of the tltcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLTCStatus(String value) {
        this.tltcStatus = value;
    }

    /**
     * Gets the value of the tlThomsonNowInstitutionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLThomsonNowInstitutionId() {
        return tlThomsonNowInstitutionId;
    }

    /**
     * Sets the value of the tlThomsonNowInstitutionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLThomsonNowInstitutionId(String value) {
        this.tlThomsonNowInstitutionId = value;
    }

    /**
     * Gets the value of the tlUserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLUserType() {
        return tlUserType;
    }

    /**
     * Sets the value of the tlUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLUserType(String value) {
        this.tlUserType = value;
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
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the tlOptInCengage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLOptInCengage() {
        return tlOptInCengage;
    }

    /**
     * Sets the value of the tlOptInCengage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLOptInCengage(String value) {
        this.tlOptInCengage = value;
    }

    /**
     * Gets the value of the tlOptInIchapters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLOptInIchapters() {
        return tlOptInIchapters;
    }

    /**
     * Sets the value of the tlOptInIchapters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLOptInIchapters(String value) {
        this.tlOptInIchapters = value;
    }

    /**
     * Gets the value of the emailValidated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailValidated() {
        return emailValidated;
    }

    /**
     * Sets the value of the emailValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailValidated(String value) {
        this.emailValidated = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the apliaTcAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApliaTcAccepted() {
        return apliaTcAccepted;
    }

    /**
     * Sets the value of the apliaTcAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApliaTcAccepted(String value) {
        this.apliaTcAccepted = value;
    }

    /**
     * Gets the value of the tlInstitutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLInstitutionName() {
        return tlInstitutionName;
    }

    /**
     * Sets the value of the tlInstitutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLInstitutionName(String value) {
        this.tlInstitutionName = value;
    }

    /**
     * Gets the value of the pendingInstructor property.
     * 
     */
    public boolean isPendingInstructor() {
        return pendingInstructor;
    }

    /**
     * Sets the value of the pendingInstructor property.
     * 
     */
    public void setPendingInstructor(boolean value) {
        this.pendingInstructor = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
