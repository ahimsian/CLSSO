
package com.tl.ssows.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTLPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTLPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{java:com.tl.ssows}TLPerson" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTLPerson", propOrder = {
    "tlPerson"
})
public class ArrayOfTLPerson {

    @XmlElement(name = "TLPerson", namespace = "java:com.tl.ssows")
    protected List<TLPerson> tlPerson;

    /**
     * Gets the value of the tlPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tlPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLPerson }
     * 
     * 
     */
    public List<TLPerson> getTLPerson() {
        if (tlPerson == null) {
            tlPerson = new ArrayList<TLPerson>();
        }
        return this.tlPerson;
    }

}
