//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.10 at 10:15:41 PM EDT 
//


package net.edmacdonald.fantasyGrounds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ability"/>
 *         &lt;element ref="{}armor"/>
 *         &lt;element ref="{}base"/>
 *         &lt;element ref="{}misc"/>
 *         &lt;element ref="{}temporary"/>
 *         &lt;element ref="{}total"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ability",
    "armor",
    "base",
    "misc",
    "temporary",
    "total"
})
@XmlRootElement(name = "reflex")
public class Reflex {

    @XmlElement(required = true)
    protected Ability ability;
    @XmlElement(required = true)
    protected Armor armor;
    @XmlElement(required = true)
    protected Base base;
    @XmlElement(required = true)
    protected Misc misc;
    @XmlElement(required = true)
    protected Temporary temporary;
    @XmlElement(required = true)
    protected Total total;

    /**
     * Gets the value of the ability property.
     * 
     * @return
     *     possible object is
     *     {@link Ability }
     *     
     */
    public Ability getAbility() {
        return ability;
    }

    /**
     * Sets the value of the ability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ability }
     *     
     */
    public void setAbility(Ability value) {
        this.ability = value;
    }

    /**
     * Gets the value of the armor property.
     * 
     * @return
     *     possible object is
     *     {@link Armor }
     *     
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * Sets the value of the armor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Armor }
     *     
     */
    public void setArmor(Armor value) {
        this.armor = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link Base }
     *     
     */
    public Base getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base }
     *     
     */
    public void setBase(Base value) {
        this.base = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link Misc }
     *     
     */
    public Misc getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Misc }
     *     
     */
    public void setMisc(Misc value) {
        this.misc = value;
    }

    /**
     * Gets the value of the temporary property.
     * 
     * @return
     *     possible object is
     *     {@link Temporary }
     *     
     */
    public Temporary getTemporary() {
        return temporary;
    }

    /**
     * Sets the value of the temporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temporary }
     *     
     */
    public void setTemporary(Temporary value) {
        this.temporary = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Total }
     *     
     */
    public Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Total }
     *     
     */
    public void setTotal(Total value) {
        this.total = value;
    }

}
