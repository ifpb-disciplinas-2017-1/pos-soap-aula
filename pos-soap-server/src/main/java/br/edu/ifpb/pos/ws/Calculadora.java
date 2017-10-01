package br.edu.ifpb.pos.ws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 18/09/2017, 16:01:00
 */
@WebService
public class Calculadora {

    @WebMethod(operationName = "SomarNumeros")
    public int somar(
            @WebParam(name = "primeiro") int a,
            @WebParam(name = "segundo") int b) {
        return a + b;
    }

    @WebResult(name = "valorDeRetorno")
    public int subtrair(int a, int b) {
        return a - b;
    }

    @Oneway
    public void imprimirNumero(int numero) {
        System.out.println("numero: " + numero);
    }
}
