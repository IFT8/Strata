//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Deprecated: A type defining a USI for the a subproduct component of a strategy.
 * 
 * <p>Java class for ProductComponentIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductComponentIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premiumProductReference" type="{http://www.fpml.org/FpML-5/pretrade}ProductReference" minOccurs="0"/>
 *         &lt;element name="issuer" type="{http://www.fpml.org/FpML-5/pretrade}IssuerId" minOccurs="0"/>
 *         &lt;element name="tradeId" type="{http://www.fpml.org/FpML-5/pretrade}TradeId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductComponentIdentifier", propOrder = {
    "premiumProductReference",
    "issuer",
    "tradeId"
})
public class ProductComponentIdentifier {

    protected ProductReference premiumProductReference;
    protected IssuerId issuer;
    protected TradeId tradeId;

    /**
     * Gets the value of the premiumProductReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReference }
     *     
     */
    public ProductReference getPremiumProductReference() {
        return premiumProductReference;
    }

    /**
     * Sets the value of the premiumProductReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReference }
     *     
     */
    public void setPremiumProductReference(ProductReference value) {
        this.premiumProductReference = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerId }
     *     
     */
    public IssuerId getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerId }
     *     
     */
    public void setIssuer(IssuerId value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the tradeId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeId }
     *     
     */
    public TradeId getTradeId() {
        return tradeId;
    }

    /**
     * Sets the value of the tradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeId }
     *     
     */
    public void setTradeId(TradeId value) {
        this.tradeId = value;
    }

}