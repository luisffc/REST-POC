//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.11 at 12:47:48 PM BRST 
//


package br.com.soaexpert.ged.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.soaexpert.ged.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Documento_QNAME = new QName("http://services.soaexpert.com.br/GEDSOA/Documento", "documento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.soaexpert.ged.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link Papel }
     * 
     */
    public Papel createPapel() {
        return new Papel();
    }

    /**
     * Create an instance of {@link Permissao }
     * 
     */
    public Permissao createPermissao() {
        return new Permissao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soaexpert.com.br/GEDSOA/Documento", name = "documento")
    public JAXBElement<Documento> createDocumento(Documento value) {
        return new JAXBElement<Documento>(_Documento_QNAME, Documento.class, null, value);
    }

}
