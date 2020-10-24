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
 * Controller REST de entidades <code>ContaBancaria</code>.
 */
@RestController
@RequestMapping("pessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController {
    /**
     * Referencia para o repositorio de entidades <code>ContaBancaria</code>.
     * 
     */
    @Autowired
    private PessoaFisicaRepository pfRepository;

    /**
     * Recupera a lista completa de contas bancarias.
     * 
     * @return a lista de todas as contas bancarias.
     */
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> getPessoasFisicas() {
        return pfRepository.findAll();
    }

    /**
     * Recupera uma conta bancaria pelo ID.
     * 
     * @param id o ID da pconta bancaria a ser recuperada.
     * @return a conta bancaria recuperada ou null, se nao existir.
     */
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
        return pfRepository.findById(id);
    }

    /**
     * Adiciona uma conta bancaria no repositorio.
     * 
     * @param contaBancaria a conta bancaria a ser adicionada.
     * 
     * @return a conta bancaria adicionada.
     */
    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }

    /**
     * Altera uma conta bancaria identificada pelo ID.
     * 
     * @param id            o ID da conta bancaria a ser alterada.
     * @param contaBancaria a conta bancaria ser alterada.
     * 
     * @return a conta bancaria alterada.
     * 
     */
    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable String id,
            @RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }

    /**
     * Persiste uma alteracao em uma conta bancaria existente ou persiste uma nova
     * conta bancaria.
     * 
     * @param contaBancaria a conta bancaria a ser alterada ou criada.
     * 
     * @return a conta bancaria alterada.
     */
    private PessoaFisica persistirPessoaFisica(PessoaFisica pessoaFisica) {
        return pfRepository.save(pessoaFisica);
    }

    /**
     * Remove uma conta bancaria identificada pelo ID.
     * 
     * @param id o ID da conta bancaria a ser removida.
     */
    @DeleteMapping(value = "/{id}")
    public void deletePessoaFisica(@PathVariable Integer id) {
    	pfRepository.deleteById(id);
    }

}
