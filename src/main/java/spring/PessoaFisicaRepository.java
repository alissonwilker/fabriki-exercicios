package spring;

import org.springframework.data.Crud.repository.CrudRepository;

@Repository
public interface PessoaFisicaRepository extends CrudRepository<PessoaFisica, Integer> {
}
