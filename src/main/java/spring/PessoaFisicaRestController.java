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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("pessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController {
	@Autowired 
    private PessoaFisicaRepository pessoaFisicaRepository;
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE) 
    public @ResponseBody List<PessoaFisica> list() {                             
        return pessoaFisicaRepository.findAll();   
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)  
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {//optional parao caso do id estar vazio não voltar nada.@PathVariable
        return pessoaFisicaRepository.findById(id);
    }
    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }
    
    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable Integer id, @RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }

    private PessoaFisica  persistirPessoaFisica(PessoaFisica pessoaFisica) {
        PessoaFisica c = pessoaFisica;
        if (pessoaFisica.getId() != null) {
            c = pessoaFisicaRepository.findById(pessoaFisica.getId()).get();
            c.setName(pessoaFisica.getName());
        }
        return pessoaFisicaRepository.save(c);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteContact(@PathVariable Integer id) {
        pessoaFisicaRepository.deleteById(id);
    }


}
