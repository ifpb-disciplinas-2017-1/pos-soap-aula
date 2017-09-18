
package br.edu.ifpb.pos.client.calculadora;

import javax.jws.Oneway;
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
@WebService(name = "Calculadora", targetNamespace = "http://ws.pos.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculadora {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtrair", targetNamespace = "http://ws.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.client.calculadora.Subtrair")
    @ResponseWrapper(localName = "subtrairResponse", targetNamespace = "http://ws.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.client.calculadora.SubtrairResponse")
    public int subtrair(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param primeiro
     * @param segundo
     * @return
     *     returns int
     */
    @WebMethod(operationName = "SomarNumeros")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SomarNumeros", targetNamespace = "http://ws.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.client.calculadora.SomarNumeros")
    @ResponseWrapper(localName = "SomarNumerosResponse", targetNamespace = "http://ws.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.client.calculadora.SomarNumerosResponse")
    public int somarNumeros(
        @WebParam(name = "primeiro", targetNamespace = "")
        int primeiro,
        @WebParam(name = "segundo", targetNamespace = "")
        int segundo);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "imprimirNumero", targetNamespace = "http://ws.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.client.calculadora.ImprimirNumero")
    public void imprimirNumero(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
