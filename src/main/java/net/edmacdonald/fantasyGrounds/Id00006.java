//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.10 at 10:15:41 PM EDT 
//


package net.edmacdonald.fantasyGrounds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}armorcheckmultiplier"/>
 *           &lt;element ref="{}classskill"/>
 *           &lt;element ref="{}label"/>
 *           &lt;element ref="{}misc"/>
 *         &lt;/sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element ref="{}carried"/>
 *             &lt;element ref="{}count"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}action"/>
 *             &lt;element ref="{}attacks"/>
 *             &lt;element ref="{}effects"/>
 *             &lt;element ref="{}keywords"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{}name" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}prepared"/>
 *           &lt;element ref="{}range"/>
 *           &lt;element ref="{}recharge"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}shortcut" minOccurs="0"/>
 *         &lt;element ref="{}showonminisheet" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}weight"/>
 *           &lt;sequence>
 *             &lt;element ref="{}shortdescription"/>
 *             &lt;element ref="{}source"/>
 *             &lt;element ref="{}used"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}statname"/>
 *             &lt;element ref="{}total"/>
 *             &lt;element ref="{}trained"/>
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
    "armorcheckmultiplier",
    "classskill",
    "label",
    "misc",
    "carried",
    "count",
    "action",
    "attacks",
    "effects",
    "keywords",
    "name",
    "prepared",
    "range",
    "recharge",
    "shortcut",
    "showonminisheet",
    "weight",
    "shortdescription",
    "source",
    "used",
    "statname",
    "total",
    "trained"
})
@XmlRootElement(name = "id-00006")
public class Id00006 {

    protected Armorcheckmultiplier armorcheckmultiplier;
    protected Classskill classskill;
    protected Label label;
    protected Misc misc;
    protected Carried carried;
    protected Count count;
    protected Action action;
    protected Attacks attacks;
    protected Effects effects;
    protected Keywords keywords;
    protected Name name;
    protected Prepared prepared;
    protected Range range;
    protected Recharge recharge;
    protected Shortcut shortcut;
    protected Showonminisheet showonminisheet;
    protected Weight weight;
    protected Shortdescription shortdescription;
    protected Source source;
    protected Used used;
    protected Statname statname;
    protected Total total;
    protected Trained trained;

    /**
     * Gets the value of the armorcheckmultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Armorcheckmultiplier }
     *     
     */
    public Armorcheckmultiplier getArmorcheckmultiplier() {
        return armorcheckmultiplier;
    }

    /**
     * Sets the value of the armorcheckmultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Armorcheckmultiplier }
     *     
     */
    public void setArmorcheckmultiplier(Armorcheckmultiplier value) {
        this.armorcheckmultiplier = value;
    }

    /**
     * Gets the value of the classskill property.
     * 
     * @return
     *     possible object is
     *     {@link Classskill }
     *     
     */
    public Classskill getClassskill() {
        return classskill;
    }

    /**
     * Sets the value of the classskill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classskill }
     *     
     */
    public void setClassskill(Classskill value) {
        this.classskill = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
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
     * Gets the value of the carried property.
     * 
     * @return
     *     possible object is
     *     {@link Carried }
     *     
     */
    public Carried getCarried() {
        return carried;
    }

    /**
     * Sets the value of the carried property.
     * 
     * @param value
     *     allowed object is
     *     {@link Carried }
     *     
     */
    public void setCarried(Carried value) {
        this.carried = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Count }
     *     
     */
    public Count getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Count }
     *     
     */
    public void setCount(Count value) {
        this.count = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setAction(Action value) {
        this.action = value;
    }

    /**
     * Gets the value of the attacks property.
     * 
     * @return
     *     possible object is
     *     {@link Attacks }
     *     
     */
    public Attacks getAttacks() {
        return attacks;
    }

    /**
     * Sets the value of the attacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attacks }
     *     
     */
    public void setAttacks(Attacks value) {
        this.attacks = value;
    }

    /**
     * Gets the value of the effects property.
     * 
     * @return
     *     possible object is
     *     {@link Effects }
     *     
     */
    public Effects getEffects() {
        return effects;
    }

    /**
     * Sets the value of the effects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Effects }
     *     
     */
    public void setEffects(Effects value) {
        this.effects = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link Keywords }
     *     
     */
    public Keywords getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keywords }
     *     
     */
    public void setKeywords(Keywords value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the prepared property.
     * 
     * @return
     *     possible object is
     *     {@link Prepared }
     *     
     */
    public Prepared getPrepared() {
        return prepared;
    }

    /**
     * Sets the value of the prepared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prepared }
     *     
     */
    public void setPrepared(Prepared value) {
        this.prepared = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setRange(Range value) {
        this.range = value;
    }

    /**
     * Gets the value of the recharge property.
     * 
     * @return
     *     possible object is
     *     {@link Recharge }
     *     
     */
    public Recharge getRecharge() {
        return recharge;
    }

    /**
     * Sets the value of the recharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recharge }
     *     
     */
    public void setRecharge(Recharge value) {
        this.recharge = value;
    }

    /**
     * Gets the value of the shortcut property.
     * 
     * @return
     *     possible object is
     *     {@link Shortcut }
     *     
     */
    public Shortcut getShortcut() {
        return shortcut;
    }

    /**
     * Sets the value of the shortcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shortcut }
     *     
     */
    public void setShortcut(Shortcut value) {
        this.shortcut = value;
    }

    /**
     * Gets the value of the showonminisheet property.
     * 
     * @return
     *     possible object is
     *     {@link Showonminisheet }
     *     
     */
    public Showonminisheet getShowonminisheet() {
        return showonminisheet;
    }

    /**
     * Sets the value of the showonminisheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Showonminisheet }
     *     
     */
    public void setShowonminisheet(Showonminisheet value) {
        this.showonminisheet = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setWeight(Weight value) {
        this.weight = value;
    }

    /**
     * Gets the value of the shortdescription property.
     * 
     * @return
     *     possible object is
     *     {@link Shortdescription }
     *     
     */
    public Shortdescription getShortdescription() {
        return shortdescription;
    }

    /**
     * Sets the value of the shortdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shortdescription }
     *     
     */
    public void setShortdescription(Shortdescription value) {
        this.shortdescription = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the used property.
     * 
     * @return
     *     possible object is
     *     {@link Used }
     *     
     */
    public Used getUsed() {
        return used;
    }

    /**
     * Sets the value of the used property.
     * 
     * @param value
     *     allowed object is
     *     {@link Used }
     *     
     */
    public void setUsed(Used value) {
        this.used = value;
    }

    /**
     * Gets the value of the statname property.
     * 
     * @return
     *     possible object is
     *     {@link Statname }
     *     
     */
    public Statname getStatname() {
        return statname;
    }

    /**
     * Sets the value of the statname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statname }
     *     
     */
    public void setStatname(Statname value) {
        this.statname = value;
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

    /**
     * Gets the value of the trained property.
     * 
     * @return
     *     possible object is
     *     {@link Trained }
     *     
     */
    public Trained getTrained() {
        return trained;
    }

    /**
     * Sets the value of the trained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trained }
     *     
     */
    public void setTrained(Trained value) {
        this.trained = value;
    }

}
