package br.edu.ifpb.pos.infra;

import br.edu.ifpb.pos.domain.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 18/09/2017, 16:12:33
 */
@Stateless
public class RepositoryPessoa {

    @PersistenceContext
    private EntityManager em;

    public void salvar(Pessoa pessoa) {
        em.persist(pessoa);
    }

    public Pessoa[] listarTodasAsPessoas() {
        List<Pessoa> resultList = em.createQuery("FROM Pessoa p", Pessoa.class).getResultList();
        return resultList.toArray(new Pessoa[0]);
    }
}
