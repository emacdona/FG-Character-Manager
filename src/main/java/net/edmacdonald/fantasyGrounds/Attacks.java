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
 *         &lt;element ref="{}id-00001" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}id-00002"/>
 *           &lt;sequence>
 *             &lt;element ref="{}base"/>
 *             &lt;element ref="{}damage"/>
 *             &lt;element ref="{}melee"/>
 *             &lt;element ref="{}ranged"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "id00001",
    "id00002",
    "base",
    "damage",
    "melee",
    "ranged"
})
@XmlRootElement(name = "attacks")
public class Attacks {

    @XmlElement(name = "id-00001")
    protected Id00001 id00001;
    @XmlElement(name = "id-00002")
    protected Id00002 id00002;
    protected Base base;
    protected Damage damage;
    protected Melee melee;
    protected Ranged ranged;

    /**
     * Gets the value of the id00001 property.
     * 
     * @return
     *     possible object is
     *     {@link Id00001 }
     *     
     */
    public Id00001 getId00001() {
        return id00001;
    }

    /**
     * Sets the value of the id00001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id00001 }
     *     
     */
    public void setId00001(Id00001 value) {
        this.id00001 = value;
    }

    /**
     * Gets the value of the id00002 property.
     * 
     * @return
     *     possible object is
     *     {@link Id00002 }
     *     
     */
    public Id00002 getId00002() {
        return id00002;
    }

    /**
     * Sets the value of the id00002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id00002 }
     *     
     */
    public void setId00002(Id00002 value) {
        this.id00002 = value;
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
     * Gets the value of the damage property.
     * 
     * @return
     *     possible object is
     *     {@link Damage }
     *     
     */
    public Damage getDamage() {
        return damage;
    }

    /**
     * Sets the value of the damage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Damage }
     *     
     */
    public void setDamage(Damage value) {
        this.damage = value;
    }

    /**
     * Gets the value of the melee property.
     * 
     * @return
     *     possible object is
     *     {@link Melee }
     *     
     */
    public Melee getMelee() {
        return melee;
    }

    /**
     * Sets the value of the melee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Melee }
     *     
     */
    public void setMelee(Melee value) {
        this.melee = value;
    }

    /**
     * Gets the value of the ranged property.
     * 
     * @return
     *     possible object is
     *     {@link Ranged }
     *     
     */
    public Ranged getRanged() {
        return ranged;
    }

    /**
     * Sets the value of the ranged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ranged }
     *     
     */
    public void setRanged(Ranged value) {
        this.ranged = value;
    }

}