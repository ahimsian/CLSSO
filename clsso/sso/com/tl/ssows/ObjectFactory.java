
package com.tl.ssows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.tl.ssows.ws.ArrayOfTLPerson;
import com.tl.ssows.ws.TLPerson;
import language_builtins.lang.ArrayOfString;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tl.ssows package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TLShipToPostalCode_QNAME = new QName("java:com.tl.ssows", "TLShipToPostalCode");
    private final static QName _TLInstitutionId_QNAME = new QName("java:com.tl.ssows", "TLInstitutionId");
    private final static QName _DepartmentNumber_QNAME = new QName("java:com.tl.ssows", "departmentNumber");
    private final static QName _TLCheckPointQ_QNAME = new QName("java:com.tl.ssows", "TLCheckPointQ");
    private final static QName _TLSchoolAffiliation_QNAME = new QName("java:com.tl.ssows", "TLSchoolAffiliation");
    private final static QName _TLTCCreationDate_QNAME = new QName("java:com.tl.ssows", "TLTCCreationDate");
    private final static QName _PendingInstructor_QNAME = new QName("java:com.tl.ssows", "pendingInstructor");
    private final static QName _TLTCStatus_QNAME = new QName("java:com.tl.ssows", "TLTCStatus");
    private final static QName _L_QNAME = new QName("java:com.tl.ssows", "l");
    private final static QName _C_QNAME = new QName("java:com.tl.ssows", "c");
    private final static QName _TLCheckPointA_QNAME = new QName("java:com.tl.ssows", "TLCheckPointA");
    private final static QName _Pager_QNAME = new QName("java:com.tl.ssows", "pager");
    private final static QName _TLTCExpireDate_QNAME = new QName("java:com.tl.ssows", "TLTCExpireDate");
    private final static QName _Dn_QNAME = new QName("java:com.tl.ssows", "dn");
    private final static QName _Token_QNAME = new QName("java:com.tl.ssows", "token");
    private final static QName _TLThomsonNowInstitutionId_QNAME = new QName("java:com.tl.ssows", "TLThomsonNowInstitutionId");
    private final static QName _TLCrmsContactId_QNAME = new QName("java:com.tl.ssows", "TLCrmsContactId");
    private final static QName _TLGender_QNAME = new QName("java:com.tl.ssows", "TLGender");
    private final static QName _BranchDesignator_QNAME = new QName("java:com.tl.ssows", "branchDesignator");
    private final static QName _ApliaTcAccepted_QNAME = new QName("java:com.tl.ssows", "apliaTcAccepted");
    private final static QName _GivenName_QNAME = new QName("java:com.tl.ssows", "givenName");
    private final static QName _TLB2BSiteId_QNAME = new QName("java:com.tl.ssows", "TLB2BSiteId");
    private final static QName _TLOptInIchapters_QNAME = new QName("java:com.tl.ssows", "TLOptInIchapters");
    private final static QName _TLPerson_QNAME = new QName("java:com.tl.ssows", "TLPerson");
    private final static QName _TLErightsId_QNAME = new QName("java:com.tl.ssows", "TLErightsId");
    private final static QName _TLJDEShipTo_QNAME = new QName("java:com.tl.ssows", "TLJDEShipTo");
    private final static QName _TLTCServices_QNAME = new QName("java:com.tl.ssows", "TLTCServices");
    private final static QName _HomePostalAddress_QNAME = new QName("java:com.tl.ssows", "homePostalAddress");
    private final static QName _OrclSecondaryUID_QNAME = new QName("java:com.tl.ssows", "orclSecondaryUID");
    private final static QName _Host_QNAME = new QName("java:com.tl.ssows", "host");
    private final static QName _Ou_QNAME = new QName("java:com.tl.ssows", "ou");
    private final static QName _Groups_QNAME = new QName("java:com.tl.ssows", "groups");
    private final static QName _TLShipToC_QNAME = new QName("java:com.tl.ssows", "TLShipToC");
    private final static QName _PostalCode_QNAME = new QName("java:com.tl.ssows", "postalCode");
    private final static QName _TLCrms8ContactId_QNAME = new QName("java:com.tl.ssows", "TLCrms8ContactId");
    private final static QName _TLShipToL_QNAME = new QName("java:com.tl.ssows", "TLShipToL");
    private final static QName _ModifyTimestamp_QNAME = new QName("java:com.tl.ssows", "modifyTimestamp");
    private final static QName _UserPassword_QNAME = new QName("java:com.tl.ssows", "userPassword");
    private final static QName _Street_QNAME = new QName("java:com.tl.ssows", "street");
    private final static QName _Instructor_QNAME = new QName("java:com.tl.ssows", "instructor");
    private final static QName _EmailValidated_QNAME = new QName("java:com.tl.ssows", "emailValidated");
    private final static QName _EmployeeNumber_QNAME = new QName("java:com.tl.ssows", "employeeNumber");
    private final static QName _ModifiersName_QNAME = new QName("java:com.tl.ssows", "modifiersName");
    private final static QName _TLPubcoId_QNAME = new QName("java:com.tl.ssows", "TLPubcoId");
    private final static QName _MiddleInitial_QNAME = new QName("java:com.tl.ssows", "middleInitial");
    private final static QName _TLCity_QNAME = new QName("java:com.tl.ssows", "TLCity");
    private final static QName _ResourceItems_QNAME = new QName("java:com.tl.ssows", "resourceItems");
    private final static QName _Guid_QNAME = new QName("java:com.tl.ssows", "guid");
    private final static QName _TLShipToPostalAddress_QNAME = new QName("java:com.tl.ssows", "TLShipToPostalAddress");
    private final static QName _TLPrefLang_QNAME = new QName("java:com.tl.ssows", "TLPrefLang");
    private final static QName _ResultDescription_QNAME = new QName("java:com.tl.ssows", "resultDescription");
    private final static QName _TLInstitutionName_QNAME = new QName("java:com.tl.ssows", "TLInstitutionName");
    private final static QName _Mail_QNAME = new QName("java:com.tl.ssows", "mail");
    private final static QName _ERightsId_QNAME = new QName("java:com.tl.ssows", "ERightsId");
    private final static QName _WorkPhone_QNAME = new QName("java:com.tl.ssows", "workPhone");
    private final static QName _ResultCode_QNAME = new QName("java:com.tl.ssows", "resultCode");
    private final static QName _CreatorsName_QNAME = new QName("java:com.tl.ssows", "creatorsName");
    private final static QName _TLUserType_QNAME = new QName("java:com.tl.ssows", "TLUserType");
    private final static QName _TimeZone_QNAME = new QName("java:com.tl.ssows", "timeZone");
    private final static QName _TLShipToSt_QNAME = new QName("java:com.tl.ssows", "TLShipToSt");
    private final static QName _FacsimileTelephoneNumber_QNAME = new QName("java:com.tl.ssows", "facsimileTelephoneNumber");
    private final static QName _Mobile_QNAME = new QName("java:com.tl.ssows", "mobile");
    private final static QName _TLCrmsValidatedInstructor_QNAME = new QName("java:com.tl.ssows", "TLCrmsValidatedInstructor");
    private final static QName _Cn_QNAME = new QName("java:com.tl.ssows", "cn");
    private final static QName _TLSerialNumbers_QNAME = new QName("java:com.tl.ssows", "TLSerialNumbers");
    private final static QName _TLCrms8AccountId_QNAME = new QName("java:com.tl.ssows", "TLCrms8AccountId");
    private final static QName _TLShipToCity_QNAME = new QName("java:com.tl.ssows", "TLShipToCity");
    private final static QName _RestrictedUser_QNAME = new QName("java:com.tl.ssows", "restrictedUser");
    private final static QName _TLPWHint_QNAME = new QName("java:com.tl.ssows", "TLPWHint");
    private final static QName _TLAgeRange_QNAME = new QName("java:com.tl.ssows", "TLAgeRange");
    private final static QName _Sn_QNAME = new QName("java:com.tl.ssows", "sn");
    private final static QName _TLTCOriginalZone_QNAME = new QName("java:com.tl.ssows", "TLTCOriginalZone");
    private final static QName _SearchBase_QNAME = new QName("java:com.tl.ssows", "searchBase");
    private final static QName _TLRegion_QNAME = new QName("java:com.tl.ssows", "TLRegion");
    private final static QName _TLEveningPhone_QNAME = new QName("java:com.tl.ssows", "TLEveningPhone");
    private final static QName _St_QNAME = new QName("java:com.tl.ssows", "st");
    private final static QName _TLOptInCengage_QNAME = new QName("java:com.tl.ssows", "TLOptInCengage");
    private final static QName _TLTCIdCode_QNAME = new QName("java:com.tl.ssows", "TLTCIdCode");
    private final static QName _CreateTimestamp_QNAME = new QName("java:com.tl.ssows", "createTimestamp");
    private final static QName _TLSealedMediaUser_QNAME = new QName("java:com.tl.ssows", "TLSealedMediaUser");
    private final static QName _UserType_QNAME = new QName("java:com.tl.ssows", "userType");
    private final static QName _HomePhone_QNAME = new QName("java:com.tl.ssows", "homePhone");
    private final static QName _TLJDEBillTo_QNAME = new QName("java:com.tl.ssows", "TLJDEBillTo");
    private final static QName _Users_QNAME = new QName("java:com.tl.ssows", "users");
    private final static QName _Uid_QNAME = new QName("java:com.tl.ssows", "uid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tl.ssows
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Groups }
     * 
     */
    public Groups createGroups() {
        return new Groups();
    }

    /**
     * Create an instance of {@link ArrayOfGroups }
     * 
     */
    public ArrayOfGroups createArrayOfGroups() {
        return new ArrayOfGroups();
    }

    /**
     * Create an instance of {@link ArrayOfGroupRef }
     * 
     */
    public ArrayOfGroupRef createArrayOfGroupRef() {
        return new ArrayOfGroupRef();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLShipToPostalCode")
    public JAXBElement<String> createTLShipToPostalCode(String value) {
        return new JAXBElement<String>(_TLShipToPostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLInstitutionId")
    public JAXBElement<String> createTLInstitutionId(String value) {
        return new JAXBElement<String>(_TLInstitutionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "departmentNumber")
    public JAXBElement<String> createDepartmentNumber(String value) {
        return new JAXBElement<String>(_DepartmentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLCheckPointQ")
    public JAXBElement<String> createTLCheckPointQ(String value) {
        return new JAXBElement<String>(_TLCheckPointQ_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLSchoolAffiliation")
    public JAXBElement<String> createTLSchoolAffiliation(String value) {
        return new JAXBElement<String>(_TLSchoolAffiliation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLTCCreationDate")
    public JAXBElement<String> createTLTCCreationDate(String value) {
        return new JAXBElement<String>(_TLTCCreationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "pendingInstructor")
    public JAXBElement<Boolean> createPendingInstructor(Boolean value) {
        return new JAXBElement<Boolean>(_PendingInstructor_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLTCStatus")
    public JAXBElement<String> createTLTCStatus(String value) {
        return new JAXBElement<String>(_TLTCStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "l")
    public JAXBElement<String> createL(String value) {
        return new JAXBElement<String>(_L_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "c")
    public JAXBElement<String> createC(String value) {
        return new JAXBElement<String>(_C_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLCheckPointA")
    public JAXBElement<String> createTLCheckPointA(String value) {
        return new JAXBElement<String>(_TLCheckPointA_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "pager")
    public JAXBElement<String> createPager(String value) {
        return new JAXBElement<String>(_Pager_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLTCExpireDate")
    public JAXBElement<String> createTLTCExpireDate(String value) {
        return new JAXBElement<String>(_TLTCExpireDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "dn")
    public JAXBElement<String> createDn(String value) {
        return new JAXBElement<String>(_Dn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "token")
    public JAXBElement<String> createToken(String value) {
        return new JAXBElement<String>(_Token_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLThomsonNowInstitutionId")
    public JAXBElement<String> createTLThomsonNowInstitutionId(String value) {
        return new JAXBElement<String>(_TLThomsonNowInstitutionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLCrmsContactId")
    public JAXBElement<String> createTLCrmsContactId(String value) {
        return new JAXBElement<String>(_TLCrmsContactId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLGender")
    public JAXBElement<String> createTLGender(String value) {
        return new JAXBElement<String>(_TLGender_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "branchDesignator")
    public JAXBElement<Integer> createBranchDesignator(Integer value) {
        return new JAXBElement<Integer>(_BranchDesignator_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "apliaTcAccepted")
    public JAXBElement<String> createApliaTcAccepted(String value) {
        return new JAXBElement<String>(_ApliaTcAccepted_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "givenName")
    public JAXBElement<String> createGivenName(String value) {
        return new JAXBElement<String>(_GivenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLB2BSiteId")
    public JAXBElement<String> createTLB2BSiteId(String value) {
        return new JAXBElement<String>(_TLB2BSiteId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLOptInIchapters")
    public JAXBElement<String> createTLOptInIchapters(String value) {
        return new JAXBElement<String>(_TLOptInIchapters_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TLPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLPerson")
    public JAXBElement<TLPerson> createTLPerson(TLPerson value) {
        return new JAXBElement<TLPerson>(_TLPerson_QNAME, TLPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLErightsId")
    public JAXBElement<String> createTLErightsId(String value) {
        return new JAXBElement<String>(_TLErightsId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLJDEShipTo")
    public JAXBElement<String> createTLJDEShipTo(String value) {
        return new JAXBElement<String>(_TLJDEShipTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLTCServices")
    public JAXBElement<String> createTLTCServices(String value) {
        return new JAXBElement<String>(_TLTCServices_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "homePostalAddress")
    public JAXBElement<String> createHomePostalAddress(String value) {
        return new JAXBElement<String>(_HomePostalAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "orclSecondaryUID")
    public JAXBElement<String> createOrclSecondaryUID(String value) {
        return new JAXBElement<String>(_OrclSecondaryUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "host")
    public JAXBElement<String> createHost(String value) {
        return new JAXBElement<String>(_Host_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "ou")
    public JAXBElement<String> createOu(String value) {
        return new JAXBElement<String>(_Ou_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "groups")
    public JAXBElement<ArrayOfString> createGroups(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_Groups_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLShipToC")
    public JAXBElement<String> createTLShipToC(String value) {
        return new JAXBElement<String>(_TLShipToC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "postalCode")
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLCrms8ContactId")
    public JAXBElement<String> createTLCrms8ContactId(String value) {
        return new JAXBElement<String>(_TLCrms8ContactId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLShipToL")
    public JAXBElement<String> createTLShipToL(String value) {
        return new JAXBElement<String>(_TLShipToL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "modifyTimestamp")
    public JAXBElement<XMLGregorianCalendar> createModifyTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ModifyTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "userPassword")
    public JAXBElement<String> createUserPassword(String value) {
        return new JAXBElement<String>(_UserPassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "street")
    public JAXBElement<String> createStreet(String value) {
        return new JAXBElement<String>(_Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "instructor")
    public JAXBElement<Boolean> createInstructor(Boolean value) {
        return new JAXBElement<Boolean>(_Instructor_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "emailValidated")
    public JAXBElement<String> createEmailValidated(String value) {
        return new JAXBElement<String>(_EmailValidated_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "employeeNumber")
    public JAXBElement<String> createEmployeeNumber(String value) {
        return new JAXBElement<String>(_EmployeeNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "modifiersName")
    public JAXBElement<String> createModifiersName(String value) {
        return new JAXBElement<String>(_ModifiersName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLPubcoId")
    public JAXBElement<String> createTLPubcoId(String value) {
        return new JAXBElement<String>(_TLPubcoId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "middleInitial")
    public JAXBElement<String> createMiddleInitial(String value) {
        return new JAXBElement<String>(_MiddleInitial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLCity")
    public JAXBElement<String> createTLCity(String value) {
        return new JAXBElement<String>(_TLCity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "resourceItems")
    public JAXBElement<ArrayOfString> createResourceItems(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ResourceItems_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLShipToPostalAddress")
    public JAXBElement<String> createTLShipToPostalAddress(String value) {
        return new JAXBElement<String>(_TLShipToPostalAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLPrefLang")
    public JAXBElement<String> createTLPrefLang(String value) {
        return new JAXBElement<String>(_TLPrefLang_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "resultDescription")
    public JAXBElement<String> createResultDescription(String value) {
        return new JAXBElement<String>(_ResultDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLInstitutionName")
    public JAXBElement<String> createTLInstitutionName(String value) {
        return new JAXBElement<String>(_TLInstitutionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "mail")
    public JAXBElement<String> createMail(String value) {
        return new JAXBElement<String>(_Mail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "ERightsId")
    public JAXBElement<String> createERightsId(String value) {
        return new JAXBElement<String>(_ERightsId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "workPhone")
    public JAXBElement<String> createWorkPhone(String value) {
        return new JAXBElement<String>(_WorkPhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "resultCode")
    public JAXBElement<Integer> createResultCode(Integer value) {
        return new JAXBElement<Integer>(_ResultCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "creatorsName")
    public JAXBElement<String> createCreatorsName(String value) {
        return new JAXBElement<String>(_CreatorsName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLUserType")
    public JAXBElement<String> createTLUserType(String value) {
        return new JAXBElement<String>(_TLUserType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "timeZone")
    public JAXBElement<String> createTimeZone(String value) {
        return new JAXBElement<String>(_TimeZone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLShipToSt")
    public JAXBElement<String> createTLShipToSt(String value) {
        return new JAXBElement<String>(_TLShipToSt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "facsimileTelephoneNumber")
    public JAXBElement<String> createFacsimileTelephoneNumber(String value) {
        return new JAXBElement<String>(_FacsimileTelephoneNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "mobile")
    public JAXBElement<String> createMobile(String value) {
        return new JAXBElement<String>(_Mobile_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLCrmsValidatedInstructor")
    public JAXBElement<Boolean> createTLCrmsValidatedInstructor(Boolean value) {
        return new JAXBElement<Boolean>(_TLCrmsValidatedInstructor_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "cn")
    public JAXBElement<String> createCn(String value) {
        return new JAXBElement<String>(_Cn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLSerialNumbers")
    public JAXBElement<String> createTLSerialNumbers(String value) {
        return new JAXBElement<String>(_TLSerialNumbers_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLCrms8AccountId")
    public JAXBElement<String> createTLCrms8AccountId(String value) {
        return new JAXBElement<String>(_TLCrms8AccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLShipToCity")
    public JAXBElement<String> createTLShipToCity(String value) {
        return new JAXBElement<String>(_TLShipToCity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "restrictedUser")
    public JAXBElement<Boolean> createRestrictedUser(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictedUser_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLPWHint")
    public JAXBElement<String> createTLPWHint(String value) {
        return new JAXBElement<String>(_TLPWHint_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLAgeRange")
    public JAXBElement<String> createTLAgeRange(String value) {
        return new JAXBElement<String>(_TLAgeRange_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "sn")
    public JAXBElement<String> createSn(String value) {
        return new JAXBElement<String>(_Sn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLTCOriginalZone")
    public JAXBElement<String> createTLTCOriginalZone(String value) {
        return new JAXBElement<String>(_TLTCOriginalZone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "searchBase")
    public JAXBElement<String> createSearchBase(String value) {
        return new JAXBElement<String>(_SearchBase_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLRegion")
    public JAXBElement<String> createTLRegion(String value) {
        return new JAXBElement<String>(_TLRegion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLEveningPhone")
    public JAXBElement<String> createTLEveningPhone(String value) {
        return new JAXBElement<String>(_TLEveningPhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "st")
    public JAXBElement<String> createSt(String value) {
        return new JAXBElement<String>(_St_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLOptInCengage")
    public JAXBElement<String> createTLOptInCengage(String value) {
        return new JAXBElement<String>(_TLOptInCengage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLTCIdCode")
    public JAXBElement<String> createTLTCIdCode(String value) {
        return new JAXBElement<String>(_TLTCIdCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "createTimestamp")
    public JAXBElement<XMLGregorianCalendar> createCreateTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLSealedMediaUser")
    public JAXBElement<String> createTLSealedMediaUser(String value) {
        return new JAXBElement<String>(_TLSealedMediaUser_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "userType")
    public JAXBElement<String> createUserType(String value) {
        return new JAXBElement<String>(_UserType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "homePhone")
    public JAXBElement<String> createHomePhone(String value) {
        return new JAXBElement<String>(_HomePhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "TLJDEBillTo")
    public JAXBElement<String> createTLJDEBillTo(String value) {
        return new JAXBElement<String>(_TLJDEBillTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTLPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "users")
    public JAXBElement<ArrayOfTLPerson> createUsers(ArrayOfTLPerson value) {
        return new JAXBElement<ArrayOfTLPerson>(_Users_QNAME, ArrayOfTLPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "java:com.tl.ssows", name = "uid")
    public JAXBElement<String> createUid(String value) {
        return new JAXBElement<String>(_Uid_QNAME, String.class, null, value);
    }

}
