package spring;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dspesquisa.entities.PessoaFisica;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> { }
