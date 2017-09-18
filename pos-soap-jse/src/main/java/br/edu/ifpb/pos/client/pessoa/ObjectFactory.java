
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

    private final static QName _Pessoa_QNAME = new QName("http://pos.ifpb.edu.br/", "pessoa");
    private final static QName _ListarTodas_QNAME = new QName("http://pos.ifpb.edu.br/", "listarTodas");
    private final static QName _SalvarResponse_QNAME = new QName("http://pos.ifpb.edu.br/", "salvarResponse");
    private final static QName _ListarTodasResponse_QNAME = new QName("http://pos.ifpb.edu.br/", "listarTodasResponse");
    private final static QName _Salvar_QNAME = new QName("http://pos.ifpb.edu.br/", "salvar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.client.pessoa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link ListarTodas }
     * 
     */
    public ListarTodas createListarTodas() {
        return new ListarTodas();
    }

    /**
     * Create an instance of {@link SalvarResponse }
     * 
     */
    public SalvarResponse createSalvarResponse() {
        return new SalvarResponse();
    }

    /**
     * Create an instance of {@link ListarTodasResponse }
     * 
     */
    public ListarTodasResponse createListarTodasResponse() {
        return new ListarTodasResponse();
    }

    /**
     * Create an instance of {@link Salvar }
     * 
     */
    public Salvar createSalvar() {
        return new Salvar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "pessoa")
    public JAXBElement<Pessoa> createPessoa(Pessoa value) {
        return new JAXBElement<Pessoa>(_Pessoa_QNAME, Pessoa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "listarTodas")
    public JAXBElement<ListarTodas> createListarTodas(ListarTodas value) {
        return new JAXBElement<ListarTodas>(_ListarTodas_QNAME, ListarTodas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "salvarResponse")
    public JAXBElement<SalvarResponse> createSalvarResponse(SalvarResponse value) {
        return new JAXBElement<SalvarResponse>(_SalvarResponse_QNAME, SalvarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "listarTodasResponse")
    public JAXBElement<ListarTodasResponse> createListarTodasResponse(ListarTodasResponse value) {
        return new JAXBElement<ListarTodasResponse>(_ListarTodasResponse_QNAME, ListarTodasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salvar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pos.ifpb.edu.br/", name = "salvar")
    public JAXBElement<Salvar> createSalvar(Salvar value) {
        return new JAXBElement<Salvar>(_Salvar_QNAME, Salvar.class, null, value);
    }

}
