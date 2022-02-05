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
	private PessoaFisicaRepository pfRepository;
	
	 /**
     * Recupera a lista completa de pessoas físicas.
     * 
     * @return a lista de todas as pessoas fisicas.
     */
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> getPessoasFisicas() {
        return pfRepository.findAll();
    }
    
    /**
     * Recupera uma conta bancaria pelo ID.
     * 
     * @param id o ID da pessoa física  a ser recuperada.
     * @return a pessoa física recuperada ou null, se nao existir.
     */
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
        return pfRepository.findById(id);
    }
    
    /**
     * Adiciona uma pessoa física no repositorio.
     * 
     * @param PessoaFisica a pessoa física a ser adicionada.
     * 
     * @return a pessoa física adicionada.
     */
    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }
    
    /**
     * Altera uma pessoa fisica identificada pelo ID.
     * 
     * @param id            o ID da pessoa fisica a ser alterada.
     * @param pessoaFisica a pessoa fisica ser alterada.
     * 
     * @return a pessoa fisica alterada.
     * 
     */
    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable String id,
            @RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }
        

    /**
     * Remove uma PF identificada pelo ID.
     * 
     * @param id o ID da PF a ser removida.
     */
    @DeleteMapping(value = "/{id}")
    public void deletePessoaFisica(@PathVariable Integer id) {
    	pfRepository.deleteById(id);
    }
    
    /**
     * Persiste uma alteracao em uma pessoa física já cadastrada ou persiste uma nova
     * PF.
     * 
     * @param PessoaFisica a pessoa física a ser alterada ou criada.
     * 
     * @return a PF criada/alterada.
     */
    private PessoaFisica persistirPessoaFisica(PessoaFisica pessoaFisica) {
        return pfRepository.save(pessoaFisica);
    }
    
    
}
