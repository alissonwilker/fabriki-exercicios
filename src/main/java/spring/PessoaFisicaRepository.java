import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treinaweb.springbootapi.entity.PessoaFisica;
import br.com.treinaweb.springbootapi.entity.Contact;
@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> { }
