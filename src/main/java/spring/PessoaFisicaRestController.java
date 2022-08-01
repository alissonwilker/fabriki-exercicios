package spring;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("pessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController {
    @Autowired
    private PessoaFisicaRepository PessoaFisicaRepository;
   
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica>  list() {
        return PessoaFisicaRepository.findAll();}


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getContact(@PathVariable Integer id) {
        return PessoaFisicaRepository.findById(id);
    }
    
    
    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addContact(@RequestBody PessoaFisica PessoaFisica) {
        return persistirContact(PessoaFisica);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updateContact(@PathVariable Integer id, @RequestBody PessoaFisica PessoaFisica) {
        return persistirContact(PessoaFisica);}

    private PessoaFisica persistirContact(PessoaFisica PessoaFisica) {
        PessoaFisica Pf = PessoaFisica;
        if (PessoaFisica.getId() != null) {
            Pf = PessoaFisicaRepository.findById(PessoaFisica.getId()).get();
            Pf.setCpf(PessoaFisica.getCpf());
        }
        return PessoaFisicaRepository.save(Pf);
    }
    
    @DeleteMapping(value = "/{id}")
    public void deletePessoaFisica(@PathVariable Integer id) {
        PessoaFisicaRepository.deleteById(id);
    }    

}
