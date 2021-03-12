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

import br.edu.ifb.java_web_dev.model.Contact;
import br.edu.ifb.java_web_dev.persistence.ContactRepository;

@RestController
@RequestMapping("pessoaFisica")
@CrossOrigin
public class PessoaFisicaRestController {
    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> list() {
        return PessoaFisicaRepository.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
        return PessoaFisicaRepository.findById(id);
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoaFisica1) {
        return persistirPessoaFisica(pessoaFisica1);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable Integer id, @RequestBody PessoaFisica pessoaFisica1) {
        return persistirPessoaFisica(pessoaFisica1);
    }

    private PessoaFisica persistirPessoaFisica(PessoaFisica pessoaFisica1) {
        return PessoaFisicaRepository.save(pessoaFisica1);
    }

    @DeleteMapping(value = "/{id}")
    public void deletePessoaFisica(@PathVariable Integer id) {
        PessoaFisicaRepository.deleteById(id);
    }

}
