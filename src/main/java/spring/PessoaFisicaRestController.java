
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifb.java_web_dev.model.PessoaFisica;
import br.edu.ifb.java_web_dev.persistence.PessoaFisicaRepository;

@RestController
@RequestMapping("contacts")
@CrossOrigin
public class PessoaFisicaRestController {
	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;
	
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> list() {
        return pessoaFisicaRepository.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getContact(@PathVariable Integer id) {
        return pessoaFisicaRepository.findById(id);
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addContact(@RequestBody PessoaFisica pf) {
        return persistirContact(pf);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updateContact(@PathVariable Integer id, @RequestBody PessoaFisica pf) {
        return persistirContact(pf);
    }

    private PessoaFisica persistirContact(PessoaFisica pf) {
    	PessoaFisica pessoaF = pf;
        if (pf.getId() != null) {
        	pessoaF = pessoaFisicaRepository.findById(pf.getId()).get();
        	pessoaF.setNome(pf.getNome());
        }
        return pessoaFisicaRepository.save(pessoaF);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteContact(@PathVariable Integer id) {
    	pessoaFisicaRepository.deleteById(id);
    }

}
