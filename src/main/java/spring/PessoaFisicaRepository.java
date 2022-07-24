
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifb.java_web_dev.model.PessoaFisica;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> {

    // PessoaFisica insert(PessoaFisica pf);

    // PessoaFisica update(PessoaFisica pf);
    
}
