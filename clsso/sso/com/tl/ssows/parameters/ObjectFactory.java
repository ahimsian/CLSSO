package com.tl.ssows.parameters;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import language_builtins.lang.ArrayOfString;

import com.tl.ssows.Groups;
import com.tl.ssows.ws.TLPerson;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.tl.ssows.parameters package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory
{

	private final static QName _Uid_QNAME = new QName("java:com.tl.ssows.parameters", "uid");
	private final static QName _Password_QNAME = new QName("java:com.tl.ssows.parameters", "password");
	private final static QName _UserToken_QNAME = new QName("java:com.tl.ssows.parameters", "userToken");
	private final static QName _Hosts_QNAME = new QName("java:com.tl.ssows.parameters", "hosts");
	private final static QName _OldUid_QNAME = new QName("java:com.tl.ssows.parameters", "oldUid");
	private final static QName _GetUniqueGroups_QNAME = new QName("java:com.tl.ssows.parameters", "getUniqueGroups");
	private final static QName _GroupCn_QNAME = new QName("java:com.tl.ssows.parameters", "groupCn");
	private final static QName _Path_QNAME = new QName("java:com.tl.ssows.parameters", "path");
	private final static QName _ERightsId_QNAME = new QName("java:com.tl.ssows.parameters", "ERightsId");
	private final static QName _ValidatedInstructor_QNAME = new QName("java:com.tl.ssows.parameters", "validatedInstructor");
	private final static QName _Guid_QNAME = new QName("java:com.tl.ssows.parameters", "guid");
	private final static QName _Group_QNAME = new QName("java:com.tl.ssows.parameters", "group");
	private final static QName _Person_QNAME = new QName("java:com.tl.ssows.parameters", "person");
	private final static QName _Username_QNAME = new QName("java:com.tl.ssows.parameters", "username");
	private final static QName _OldGuid_QNAME = new QName("java:com.tl.ssows.parameters", "oldGuid");
	private final static QName _NewUid_QNAME = new QName("java:com.tl.ssows.parameters", "newUid");
	private final static QName _TlCrms8ContactId_QNAME = new QName("java:com.tl.ssows.parameters", "tlCrms8ContactId");
	private final static QName _ReturnGroups_QNAME = new QName("java:com.tl.ssows.parameters", "returnGroups");
	private final static QName _ResourceItem_QNAME = new QName("java:com.tl.ssows.parameters", "resourceItem");
	private final static QName _GroupName_QNAME = new QName("java:com.tl.ssows.parameters", "groupName");
	private final static QName _AdminToken_QNAME = new QName("java:com.tl.ssows.parameters", "adminToken");
	private final static QName _Token_QNAME = new QName("java:com.tl.ssows.parameters", "token");
	private final static QName _Dn_QNAME = new QName("java:com.tl.ssows.parameters", "dn");
	private final static QName _HostNames_QNAME = new QName("java:com.tl.ssows.parameters", "hostNames");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.tl.ssows.parameters
	 * 
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "uid")
	public JAXBElement<String> createUid(final String value)
	{
		return new JAXBElement<String>(_Uid_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "password")
	public JAXBElement<String> createPassword(final String value)
	{
		return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "userToken")
	public JAXBElement<String> createUserToken(final String value)
	{
		return new JAXBElement<String>(_UserToken_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "hosts")
	public JAXBElement<ArrayOfString> createHosts(final ArrayOfString value)
	{
		return new JAXBElement<ArrayOfString>(_Hosts_QNAME, ArrayOfString.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "oldUid")
	public JAXBElement<String> createOldUid(final String value)
	{
		return new JAXBElement<String>(_OldUid_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "getUniqueGroups")
	public JAXBElement<Boolean> createGetUniqueGroups(final Boolean value)
	{
		return new JAXBElement<Boolean>(_GetUniqueGroups_QNAME, Boolean.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "groupCn")
	public JAXBElement<String> createGroupCn(final String value)
	{
		return new JAXBElement<String>(_GroupCn_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "path")
	public JAXBElement<String> createPath(final String value)
	{
		return new JAXBElement<String>(_Path_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "ERightsId")
	public JAXBElement<String> createERightsId(final String value)
	{
		return new JAXBElement<String>(_ERightsId_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "validatedInstructor")
	public JAXBElement<String> createValidatedInstructor(final String value)
	{
		return new JAXBElement<String>(_ValidatedInstructor_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "guid")
	public JAXBElement<String> createGuid(final String value)
	{
		return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Groups }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "group")
	public JAXBElement<Groups> createGroup(final Groups value)
	{
		return new JAXBElement<Groups>(_Group_QNAME, Groups.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TLPerson }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "person")
	public JAXBElement<TLPerson> createPerson(final TLPerson value)
	{
		return new JAXBElement<TLPerson>(_Person_QNAME, TLPerson.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "username")
	public JAXBElement<String> createUsername(final String value)
	{
		return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "oldGuid")
	public JAXBElement<String> createOldGuid(final String value)
	{
		return new JAXBElement<String>(_OldGuid_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "newUid")
	public JAXBElement<String> createNewUid(final String value)
	{
		return new JAXBElement<String>(_NewUid_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "tlCrms8ContactId")
	public JAXBElement<String> createTlCrms8ContactId(final String value)
	{
		return new JAXBElement<String>(_TlCrms8ContactId_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "returnGroups")
	public JAXBElement<String> createReturnGroups(final String value)
	{
		return new JAXBElement<String>(_ReturnGroups_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "resourceItem")
	public JAXBElement<String> createResourceItem(final String value)
	{
		return new JAXBElement<String>(_ResourceItem_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "groupName")
	public JAXBElement<String> createGroupName(final String value)
	{
		return new JAXBElement<String>(_GroupName_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "adminToken")
	public JAXBElement<String> createAdminToken(final String value)
	{
		return new JAXBElement<String>(_AdminToken_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "token")
	public JAXBElement<String> createToken(final String value)
	{
		return new JAXBElement<String>(_Token_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "dn")
	public JAXBElement<String> createDn(final String value)
	{
		return new JAXBElement<String>(_Dn_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "java:com.tl.ssows.parameters", name = "hostNames")
	public JAXBElement<ArrayOfString> createHostNames(final ArrayOfString value)
	{
		return new JAXBElement<ArrayOfString>(_HostNames_QNAME, ArrayOfString.class, null, value);
	}

}
