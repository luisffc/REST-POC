//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.11 at 12:47:48 PM BRST 
//


package br.com.soaexpert.ged.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Permissao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Permissao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atributo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoAcesso" type="{http://services.soaexpert.com.br/AccessControl}TipoAcesso"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Permissao", propOrder = {
    "atributo",
    "tipoAcesso"
})
public class Permissao {

    @XmlElement(namespace = "http://services.soaexpert.com.br/AccessControl", required = true)
    protected String atributo;
    @XmlElement(namespace = "http://services.soaexpert.com.br/AccessControl", required = true)
    protected TipoAcesso tipoAcesso;

    /**
     * Gets the value of the atributo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtributo() {
        return atributo;
    }

    /**
     * Sets the value of the atributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtributo(String value) {
        this.atributo = value;
    }

    /**
     * Gets the value of the tipoAcesso property.
     * 
     * @return
     *     possible object is
     *     {@link TipoAcesso }
     *     
     */
    public TipoAcesso getTipoAcesso() {
        return tipoAcesso;
    }

    /**
     * Sets the value of the tipoAcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAcesso }
     *     
     */
    public void setTipoAcesso(TipoAcesso value) {
        this.tipoAcesso = value;
    }

}
