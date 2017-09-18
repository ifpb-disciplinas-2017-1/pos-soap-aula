
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

    private final static QName _Numeros_QNAME = new QName("http://pos.ifpb.edu.br/", "numeros");
    private final static QName _SomarInteiros_QNAME = new QName("http://pos.ifpb.edu.br/", "somarInteiros");
    private final static QName _SomarInteirosResponse_QNAME = new QName("http://pos.ifpb.edu.br/", "somarInteirosResponse");
    private final static QName _Subtrair_QNAME = new QName("http://pos.ifpb.edu.br/", "subtrair");
    private final static QName _SubtrairResponse_QNAME = new QName("http://pos.ifpb.edu.br/", "subtrairResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.client.calculadora
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SomarInteirosResponse }
     * 
     */
    public SomarInteirosResponse createSomarInteirosResponse() {
        return new SomarInteirosResponse();
    }

    /**
     * Create an instance of {@link Numeros }
     * 
     */
    public Numeros createNumeros() {
        return new Numeros();
    }

    /**
     * Create an instance of {@link SomarInteiros }
     * 
     */
    public SomarInteiros createSomarInteiros() {
        return new SomarInteiros();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Numeros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "numeros")
    public JAXBElement<Numeros> createNumeros(Numeros value) {
        return new JAXBElement<Numeros>(_Numeros_QNAME, Numeros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarInteiros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "somarInteiros")
    public JAXBElement<SomarInteiros> createSomarInteiros(SomarInteiros value) {
        return new JAXBElement<SomarInteiros>(_SomarInteiros_QNAME, SomarInteiros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarInteirosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "somarInteirosResponse")
    public JAXBElement<SomarInteirosResponse> createSomarInteirosResponse(SomarInteirosResponse value) {
        return new JAXBElement<SomarInteirosResponse>(_SomarInteirosResponse_QNAME, SomarInteirosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtrair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "subtrair")
    public JAXBElement<Subtrair> createSubtrair(Subtrair value) {
        return new JAXBElement<Subtrair>(_Subtrair_QNAME, Subtrair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtrairResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "subtrairResponse")
    public JAXBElement<SubtrairResponse> createSubtrairResponse(SubtrairResponse value) {
        return new JAXBElement<SubtrairResponse>(_SubtrairResponse_QNAME, SubtrairResponse.class, null, value);
    }

}
