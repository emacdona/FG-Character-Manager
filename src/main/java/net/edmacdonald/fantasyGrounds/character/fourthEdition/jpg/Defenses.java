//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.10 at 10:15:41 PM EDT 
//


package net.edmacdonald.fantasyGrounds.character.fourthEdition.jpg;

import net.edmacdonald.fantasyGrounds.character.fourthEdition.jpg.Ac;

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
 *         &lt;element ref="{}ac"/>
 *         &lt;element ref="{}fortitude"/>
 *         &lt;element ref="{}reflex"/>
 *         &lt;element ref="{}save"/>
 *         &lt;element ref="{}will"/>
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
    "ac",
    "fortitude",
    "reflex",
    "save",
    "will"
})
@XmlRootElement(name = "defenses")
public class Defenses {

    @XmlElement(required = true)
    protected Ac ac;
    @XmlElement(required = true)
    protected Fortitude fortitude;
    @XmlElement(required = true)
    protected Reflex reflex;
    @XmlElement(required = true)
    protected Save save;
    @XmlElement(required = true)
    protected Will will;

    /**
     * Gets the value of the ac property.
     * 
     * @return
     *     possible object is
     *     {@link Ac }
     *     
     */
    public Ac getAc() {
        return ac;
    }

    /**
     * Sets the value of the ac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ac }
     *     
     */
    public void setAc(Ac value) {
        this.ac = value;
    }

    /**
     * Gets the value of the fortitude property.
     * 
     * @return
     *     possible object is
     *     {@link Fortitude }
     *     
     */
    public Fortitude getFortitude() {
        return fortitude;
    }

    /**
     * Sets the value of the fortitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fortitude }
     *     
     */
    public void setFortitude(Fortitude value) {
        this.fortitude = value;
    }

    /**
     * Gets the value of the reflex property.
     * 
     * @return
     *     possible object is
     *     {@link Reflex }
     *     
     */
    public Reflex getReflex() {
        return reflex;
    }

    /**
     * Sets the value of the reflex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reflex }
     *     
     */
    public void setReflex(Reflex value) {
        this.reflex = value;
    }

    /**
     * Gets the value of the save property.
     * 
     * @return
     *     possible object is
     *     {@link Save }
     *     
     */
    public Save getSave() {
        return save;
    }

    /**
     * Sets the value of the save property.
     * 
     * @param value
     *     allowed object is
     *     {@link Save }
     *     
     */
    public void setSave(Save value) {
        this.save = value;
    }

    /**
     * Gets the value of the will property.
     * 
     * @return
     *     possible object is
     *     {@link Will }
     *     
     */
    public Will getWill() {
        return will;
    }

    /**
     * Sets the value of the will property.
     * 
     * @param value
     *     allowed object is
     *     {@link Will }
     *     
     */
    public void setWill(Will value) {
        this.will = value;
    }

}
