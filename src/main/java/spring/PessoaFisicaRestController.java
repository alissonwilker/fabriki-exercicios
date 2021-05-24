package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller REST de entidades <code>PessoaFisica</code>.
 */
@RestController
@RequestMapping("pessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController {
    /**
     * Referencia para o repositorio de entidades <code>PessoaFisica</code>.
     * 
     */
    @Autowired
    private PessoaFisicaRepository pfRepository;

    /**
     * Recupera a lista completa de pessoas físicas.
     * 
     * @return a lista de todas as pessoas físicas.
     */
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> getPessoasFisicas() {
        return pfRepository.findAll();
    }

    /**
     * Recupera uma pessoa física pelo ID.
     * 
     * @param id o ID da pessoa física a ser recuperada.
     * @return a pessoa física recuperada ou null, se nao existir.
     */
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
        return pfRepository.findById(id);
    }

    /**
     * Adiciona uma pessoa física no repositório.
     * 
     * @param pessoaFisica a pessoa física a ser adicionada.
     * 
     * @return a conta bancaria adicionada.
     */
    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }

    /**
     * Altera uma pessoa física identificada pelo ID.
     * 
     * @param id            o ID da pessoa física a ser alterada.
     * @param pessoaFisica a pessoa física ser alterada.
     * 
     * @return a pessoa física alterada.
     * 
     */
    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable String id,
            @RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }

    /**
     * Persiste uma alteração em uma pessoa física existente ou persiste uma nova
     * pessoa física.
     * 
     * @param pessoaFisica a pessoa física a ser alterada ou criada.
     * 
     * @return a pessoa física alterada.
     */
    private PessoaFisica persistirPessoaFisica(PessoaFisica pessoaFisica) {
        return pfRepository.save(pessoaFisica);
    }

    /**
     * Remove uma pessoa física identificada pelo ID.
     * 
     * @param id o ID da pessoa física a ser removida.
     */
    @DeleteMapping(value = "/{id}")
    public void deletePessoaFisica(@PathVariable Integer id) {
        pfRepository.deleteById(id);
    }

}
