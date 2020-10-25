import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifb.java_web_dev.model.Contact;
import br.edu.ifb.java_web_dev.persistence.ContactRepository;
@RestController
@RequestMapping("PessoasFisicas")
public class PessoaFisicaRestController {

	@Autowired
	private PessoaFisicaRepository pfRepository;

	/*public PessoaFisicaRestController(PessoaFisicaRepository pfRepository) {
		this.pfRepository = pfRepository;
	}*/

	
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> getPessoasFisicas() {
        return pfRepository.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
        return pfRepository.findById(id);
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Contact addContact(@RequestBody PessoaFisica contato) {
        return persistirContact(contato);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Contact updateContact(@PathVariable Integer id, @RequestBody PessoaFisica contato) {
        return persistirContact(contato);
    }

    private Contact persistirContact(PessoaFisica contato) {
        PessoaFisica c = contato;
        if (contato.getId() != null) {
            c = pfRepository.findById(contato.getId()).get();
            c.setName(contato.getName());
        }
        return pfRepository.save(c);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteContact(@PathVariable Integer id) {
    	pfRepository.deleteById(id);
    }

	
}
