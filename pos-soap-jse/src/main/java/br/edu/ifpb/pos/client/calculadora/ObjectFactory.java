
package br.edu.ifpb.pos.client.calculadora;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.client.calculadora package. 
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

    private final static QName _ImprimirNumero_QNAME = new QName("http://ws.pos.ifpb.edu.br/", "imprimirNumero");
    private final static QName _SomarNumeros_QNAME = new QName("http://ws.pos.ifpb.edu.br/", "SomarNumeros");
    private final static QName _Subtrair_QNAME = new QName("http://ws.pos.ifpb.edu.br/", "subtrair");
    private final static QName _SubtrairResponse_QNAME = new QName("http://ws.pos.ifpb.edu.br/", "subtrairResponse");
    private final static QName _SomarNumerosResponse_QNAME = new QName("http://ws.pos.ifpb.edu.br/", "SomarNumerosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.client.calculadora
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SomarNumerosResponse }
     * 
     */
    public SomarNumerosResponse createSomarNumerosResponse() {
        return new SomarNumerosResponse();
    }

    /**
     * Create an instance of {@link ImprimirNumero }
     * 
     */
    public ImprimirNumero createImprimirNumero() {
        return new ImprimirNumero();
    }

    /**
     * Create an instance of {@link SomarNumeros }
     * 
     */
    public SomarNumeros createSomarNumeros() {
        return new SomarNumeros();
    }

    /**
     * Create an instance of {@link Subtrair }
     * 
     */
    public Subtrair createSubtrair() {
        return new Subtrair();
    }

    /**
     * Create an instance of {@link SubtrairResponse }
     * 
     */
    public SubtrairResponse createSubtrairResponse() {
        return new SubtrairResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImprimirNumero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pos.ifpb.edu.br/", name = "imprimirNumero")
    public JAXBElement<ImprimirNumero> createImprimirNumero(ImprimirNumero value) {
        return new JAXBElement<ImprimirNumero>(_ImprimirNumero_QNAME, ImprimirNumero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarNumeros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pos.ifpb.edu.br/", name = "SomarNumeros")
    public JAXBElement<SomarNumeros> createSomarNumeros(SomarNumeros value) {
        return new JAXBElement<SomarNumeros>(_SomarNumeros_QNAME, SomarNumeros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtrair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pos.ifpb.edu.br/", name = "subtrair")
    public JAXBElement<Subtrair> createSubtrair(Subtrair value) {
        return new JAXBElement<Subtrair>(_Subtrair_QNAME, Subtrair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtrairResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pos.ifpb.edu.br/", name = "subtrairResponse")
    public JAXBElement<SubtrairResponse> createSubtrairResponse(SubtrairResponse value) {
        return new JAXBElement<SubtrairResponse>(_SubtrairResponse_QNAME, SubtrairResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarNumerosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pos.ifpb.edu.br/", name = "SomarNumerosResponse")
    public JAXBElement<SomarNumerosResponse> createSomarNumerosResponse(SomarNumerosResponse value) {
        return new JAXBElement<SomarNumerosResponse>(_SomarNumerosResponse_QNAME, SomarNumerosResponse.class, null, value);
    }

}
