package br.edu.ifpb.pos.ws;

import br.edu.ifpb.pos.domain.Pessoa;
import br.edu.ifpb.pos.infra.RepositoryPessoa;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 18/09/2017, 16:17:09
 */
@WebService
public class ServicePessoa {

    @EJB
    private RepositoryPessoa repository;
    
    public void salvar(Pessoa pessoa){
        repository.salvar(pessoa);
    }
    public Pessoa[] todasAsPessoas(){
        return repository.listarTodasAsPessoas();
    }
    
}
