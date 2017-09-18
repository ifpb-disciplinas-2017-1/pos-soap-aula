
package br.edu.ifpb.pos.client.pessoa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.client.pessoa package. 
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

    private final static QName _Salvar_QNAME = new QName("http://ws.pos.ifpb.edu.br/", "salvar");
    private final static QName _TodasAsPessoas_QNAME = new QName("http://ws.pos.ifpb.edu.br/", "todasAsPessoas");
    private final static QName _TodasAsPessoasResponse_QNAME = new QName("http://ws.pos.ifpb.edu.br/", "todasAsPessoasResponse");
    private final static QName _SalvarResponse_QNAME = new QName("http://ws.pos.ifpb.edu.br/", "salvarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.client.pessoa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TodasAsPessoas }
     * 
     */
    public TodasAsPessoas createTodasAsPessoas() {
        return new TodasAsPessoas();
    }

    /**
     * Create an instance of {@link TodasAsPessoasResponse }
     * 
     */
    public TodasAsPessoasResponse createTodasAsPessoasResponse() {
        return new TodasAsPessoasResponse();
    }

    /**
     * Create an instance of {@link SalvarResponse }
     * 
     */
    public SalvarResponse createSalvarResponse() {
        return new SalvarResponse();
    }

    /**
     * Create an instance of {@link Salvar }
     * 
     */
    public Salvar createSalvar() {
        return new Salvar();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salvar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pos.ifpb.edu.br/", name = "salvar")
    public JAXBElement<Salvar> createSalvar(Salvar value) {
        return new JAXBElement<Salvar>(_Salvar_QNAME, Salvar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodasAsPessoas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pos.ifpb.edu.br/", name = "todasAsPessoas")
    public JAXBElement<TodasAsPessoas> createTodasAsPessoas(TodasAsPessoas value) {
        return new JAXBElement<TodasAsPessoas>(_TodasAsPessoas_QNAME, TodasAsPessoas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodasAsPessoasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pos.ifpb.edu.br/", name = "todasAsPessoasResponse")
    public JAXBElement<TodasAsPessoasResponse> createTodasAsPessoasResponse(TodasAsPessoasResponse value) {
        return new JAXBElement<TodasAsPessoasResponse>(_TodasAsPessoasResponse_QNAME, TodasAsPessoasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pos.ifpb.edu.br/", name = "salvarResponse")
    public JAXBElement<SalvarResponse> createSalvarResponse(SalvarResponse value) {
        return new JAXBElement<SalvarResponse>(_SalvarResponse_QNAME, SalvarResponse.class, null, value);
    }

}
