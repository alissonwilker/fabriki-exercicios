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

/**
 * Controller REST de entidades <code>PessoaFisica</code>.
 */
@RestController
@RequestMapping("PessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController extends PessoaFisica {
    /**
     * Referencia para o repositorio de entidades <code>PessoaFisica</code>.
     * 
     */
    @Autowired
    private PessoaFisicaRepository pfRepository;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Cliente> getPessoaFisicas() {
    	// exibe todas as pessoas fisicas 
        return pfRepository.findAll();
    }


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<Cliente> getPessoaFisica(@PathVariable Integer id) {
       // retorna a pessoa por id 
    	return pfRepository.findById(id);
    }


    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica PessoaFisica) {
        return persistirPessoaFisica(PessoaFisica);
    }


    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable String id,
            @RequestBody PessoaFisica PessoaFisica) {
        return persistirPessoaFisica(PessoaFisica);
    }


    private PessoaFisica persistirPessoaFisica(PessoaFisica PessoaFisica) {
        return pfRepository.save(PessoaFisica);
    }

    @DeleteMapping(value = "/{id}")
    public void deletePessoaFisica(@PathVariable Integer id) {
    	pfRepository.deleteById(id);
    }

}
