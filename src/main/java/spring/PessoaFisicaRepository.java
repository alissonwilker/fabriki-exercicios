package spring;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, String>{

	Optional<PessoaFisica> findById(Integer id);

	
	

	

}
