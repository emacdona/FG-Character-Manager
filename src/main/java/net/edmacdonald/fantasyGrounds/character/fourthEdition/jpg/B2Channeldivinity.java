//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.10 at 10:15:41 PM EDT 
//


package net.edmacdonald.fantasyGrounds.character.fourthEdition.jpg;

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
 *         &lt;element ref="{}power"/>
 *         &lt;element ref="{}usesavailable"/>
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
    "power",
    "usesavailable"
})
@XmlRootElement(name = "b2-channeldivinity")
public class B2Channeldivinity {

    @XmlElement(required = true)
    protected Power power;
    @XmlElement(required = true)
    protected Usesavailable usesavailable;

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link Power }
     *     
     */
    public Power getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link Power }
     *     
     */
    public void setPower(Power value) {
        this.power = value;
    }

    /**
     * Gets the value of the usesavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Usesavailable }
     *     
     */
    public Usesavailable getUsesavailable() {
        return usesavailable;
    }

    /**
     * Sets the value of the usesavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usesavailable }
     *     
     */
    public void setUsesavailable(Usesavailable value) {
        this.usesavailable = value;
    }

}
