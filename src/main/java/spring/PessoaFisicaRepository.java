package spring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepository extends JpaRepository<ContaBancaria, Integer> {
    
}
