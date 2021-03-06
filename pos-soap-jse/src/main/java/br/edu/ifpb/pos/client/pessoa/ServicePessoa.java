
package br.edu.ifpb.pos.client.pessoa;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ServicePessoa", targetNamespace = "http://ws.pos.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicePessoa {


    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.pos.client.pessoa.Pessoa>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "todasAsPessoas", targetNamespace = "http://ws.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.client.pessoa.TodasAsPessoas")
    @ResponseWrapper(localName = "todasAsPessoasResponse", targetNamespace = "http://ws.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.client.pessoa.TodasAsPessoasResponse")
    public List<Pessoa> todasAsPessoas();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "salvar", targetNamespace = "http://ws.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.client.pessoa.Salvar")
    @ResponseWrapper(localName = "salvarResponse", targetNamespace = "http://ws.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.client.pessoa.SalvarResponse")
    public void salvar(
        @WebParam(name = "arg0", targetNamespace = "")
        Pessoa arg0);

}
