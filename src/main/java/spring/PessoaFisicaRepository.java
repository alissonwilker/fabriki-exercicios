
import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifb.java_web_dev.model.Contact;
import br.edu.ifb.java_web_dev.model.PessoaFisica;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> {
    
}
