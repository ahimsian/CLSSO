package com.tl.ssows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import language_builtins.lang.ArrayOfString;


/**
 * <p>
 * Java class for Groups complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Groups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessCategory" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="cn" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="createTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/>
 *         &lt;element name="creatorsName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="dn" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="groupRefs" type="{java:com.tl.ssows}ArrayOfGroupRef" form="qualified"/>
 *         &lt;element name="groups" type="{java:language_builtins.lang}ArrayOfString" form="qualified"/>
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="modifiersName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="modifyTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/>
 *         &lt;element name="numSubordinates" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="resourceItems" type="{java:language_builtins.lang}ArrayOfString" form="qualified"/>
 *         &lt;element name="searchBase" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="seeAlso" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TLErightsId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="uniqueGroupMembers" type="{java:language_builtins.lang}ArrayOfString" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Groups", propOrder =
{ "businessCategory", "businessUnit", "cn", "createTimestamp", "creatorsName", "description", "dn", "groupRefs", "groups",
		"host", "modifiersName", "modifyTimestamp", "numSubordinates", "owner", "resourceItems", "searchBase", "seeAlso",
		"tlErightsId", "uniqueGroupMembers" })
public class Groups
{

	@XmlElement(required = true)
	protected String businessCategory;
	@XmlElement(required = true)
	protected String businessUnit;
	@XmlElement(required = true)
	protected String cn;
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar createTimestamp;
	@XmlElement(required = true)
	protected String creatorsName;
	@XmlElement(required = true)
	protected String description;
	@XmlElement(required = true)
	protected String dn;
	@XmlElement(required = true)
	protected ArrayOfGroupRef groupRefs;
	@XmlElement(required = true)
	protected ArrayOfString groups;
	@XmlElement(required = true)
	protected String host;
	@XmlElement(required = true)
	protected String modifiersName;
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar modifyTimestamp;
	@XmlElement(required = true)
	protected String numSubordinates;
	@XmlElement(required = true)
	protected String owner;
	@XmlElement(required = true)
	protected ArrayOfString resourceItems;
	@XmlElement(required = true)
	protected String searchBase;
	@XmlElement(required = true)
	protected String seeAlso;
	@XmlElement(name = "TLErightsId", required = true)
	protected String tlErightsId;
	@XmlElement(required = true)
	protected ArrayOfString uniqueGroupMembers;

	/**
	 * Gets the value of the businessCategory property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBusinessCategory()
	{
		return businessCategory;
	}

	/**
	 * Sets the value of the businessCategory property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setBusinessCategory(final String value)
	{
		this.businessCategory = value;
	}

	/**
	 * Gets the value of the businessUnit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBusinessUnit()
	{
		return businessUnit;
	}

	/**
	 * Sets the value of the businessUnit property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setBusinessUnit(final String value)
	{
		this.businessUnit = value;
	}

	/**
	 * Gets the value of the cn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCn()
	{
		return cn;
	}

	/**
	 * Sets the value of the cn property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setCn(final String value)
	{
		this.cn = value;
	}

	/**
	 * Gets the value of the createTimestamp property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCreateTimestamp()
	{
		return createTimestamp;
	}

	/**
	 * Sets the value of the createTimestamp property.
	 * 
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCreateTimestamp(final XMLGregorianCalendar value)
	{
		this.createTimestamp = value;
	}

	/**
	 * Gets the value of the creatorsName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatorsName()
	{
		return creatorsName;
	}

	/**
	 * Sets the value of the creatorsName property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setCreatorsName(final String value)
	{
		this.creatorsName = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setDescription(final String value)
	{
		this.description = value;
	}

	/**
	 * Gets the value of the dn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDn()
	{
		return dn;
	}

	/**
	 * Sets the value of the dn property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setDn(final String value)
	{
		this.dn = value;
	}

	/**
	 * Gets the value of the groupRefs property.
	 * 
	 * @return possible object is {@link ArrayOfGroupRef }
	 * 
	 */
	public ArrayOfGroupRef getGroupRefs()
	{
		return groupRefs;
	}

	/**
	 * Sets the value of the groupRefs property.
	 * 
	 * @param value
	 *           allowed object is {@link ArrayOfGroupRef }
	 * 
	 */
	public void setGroupRefs(final ArrayOfGroupRef value)
	{
		this.groupRefs = value;
	}

	/**
	 * Gets the value of the groups property.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getGroups()
	{
		return groups;
	}

	/**
	 * Sets the value of the groups property.
	 * 
	 * @param value
	 *           allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setGroups(final ArrayOfString value)
	{
		this.groups = value;
	}

	/**
	 * Gets the value of the host property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHost()
	{
		return host;
	}

	/**
	 * Sets the value of the host property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setHost(final String value)
	{
		this.host = value;
	}

	/**
	 * Gets the value of the modifiersName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModifiersName()
	{
		return modifiersName;
	}

	/**
	 * Sets the value of the modifiersName property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setModifiersName(final String value)
	{
		this.modifiersName = value;
	}

	/**
	 * Gets the value of the modifyTimestamp property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getModifyTimestamp()
	{
		return modifyTimestamp;
	}

	/**
	 * Sets the value of the modifyTimestamp property.
	 * 
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setModifyTimestamp(final XMLGregorianCalendar value)
	{
		this.modifyTimestamp = value;
	}

	/**
	 * Gets the value of the numSubordinates property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumSubordinates()
	{
		return numSubordinates;
	}

	/**
	 * Sets the value of the numSubordinates property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setNumSubordinates(final String value)
	{
		this.numSubordinates = value;
	}

	/**
	 * Gets the value of the owner property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOwner()
	{
		return owner;
	}

	/**
	 * Sets the value of the owner property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setOwner(final String value)
	{
		this.owner = value;
	}

	/**
	 * Gets the value of the resourceItems property.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getResourceItems()
	{
		return resourceItems;
	}

	/**
	 * Sets the value of the resourceItems property.
	 * 
	 * @param value
	 *           allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setResourceItems(final ArrayOfString value)
	{
		this.resourceItems = value;
	}

	/**
	 * Gets the value of the searchBase property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSearchBase()
	{
		return searchBase;
	}

	/**
	 * Sets the value of the searchBase property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSearchBase(final String value)
	{
		this.searchBase = value;
	}

	/**
	 * Gets the value of the seeAlso property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeeAlso()
	{
		return seeAlso;
	}

	/**
	 * Sets the value of the seeAlso property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSeeAlso(final String value)
	{
		this.seeAlso = value;
	}

	/**
	 * Gets the value of the tlErightsId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTLErightsId()
	{
		return tlErightsId;
	}

	/**
	 * Sets the value of the tlErightsId property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setTLErightsId(final String value)
	{
		this.tlErightsId = value;
	}

	/**
	 * Gets the value of the uniqueGroupMembers property.
	 * 
	 * @return possible object is {@link ArrayOfString }
	 * 
	 */
	public ArrayOfString getUniqueGroupMembers()
	{
		return uniqueGroupMembers;
	}

	/**
	 * Sets the value of the uniqueGroupMembers property.
	 * 
	 * @param value
	 *           allowed object is {@link ArrayOfString }
	 * 
	 */
	public void setUniqueGroupMembers(final ArrayOfString value)
	{
		this.uniqueGroupMembers = value;
	}

}
