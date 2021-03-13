package spring;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> { }
