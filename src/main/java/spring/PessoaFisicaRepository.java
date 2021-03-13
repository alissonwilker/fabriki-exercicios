package spring;

import org.springframework.data.repository.CrudRepository<PessoaFisica,​Integer>
import org.springframework.data.jpa.repository.JpaRepository<PessoaFisica,​Integer>
import org.springframework.data.repository.PagingAndSortingRepository<PessoaFisica,​Integer>
import org.springframework.data.repository.Repository<PessoaFisica,​Integer>
import org.springframework.data.repository.query.QueryByExampleExecutor<PessoaFisica>
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> { }
