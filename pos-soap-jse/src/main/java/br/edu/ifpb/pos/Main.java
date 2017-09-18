package br.edu.ifpb.pos;

import br.edu.ifpb.pos.client.calculadora.Calculadora;
import br.edu.ifpb.pos.client.calculadora.CalculadoraService;
import br.edu.ifpb.pos.client.pessoa.ServicePessoa;
import br.edu.ifpb.pos.client.pessoa.ServicePessoaService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 18/09/2017, 10:09:53
 */
public class Main {

    public static void main(String[] args) {
        serviceCalculadora();
        servicePessoa();

    }

    private static void serviceCalculadora() {
        //Calculadora
        CalculadoraService proxy = new CalculadoraService();
        Calculadora service = proxy.getCalculadoraPort();
        service.imprimirNumero(2355); //Documento
        int somar = service.somarNumeros(1, 4); //RPC
        System.out.println("soma: " + somar);
    }

    private static void servicePessoa() {

        //Service Pessoa
        ServicePessoaService proxyPessoa = new ServicePessoaService();
        ServicePessoa servicePessoa = proxyPessoa.getServicePessoaPort();
        servicePessoa.todasAsPessoas().forEach(pessoa -> System.out.println(pessoa.getNome()));

//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome("Chaves");
//        servicePessoa.salvar(pessoa);
        servicePessoa.todasAsPessoas().forEach(p -> System.out.println(p.getNome()));
    }

}
