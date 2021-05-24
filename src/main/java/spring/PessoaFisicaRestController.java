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
     * Recupera a lista completa de pessoas fisicas.
     * 
     * @return a lista de todas as pessoas fisicas.
     */
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> getPessoasFisicas() {
        return pfRepository.findAll();
    }

    /**
     * Recupera uma pessoa fisica pelo ID.
     * 
     * @param id o ID da pessoa fisica a ser recuperada.
     * @return a pessoa fisica recuperada ou null, se nao existir.
     */
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
        return pfRepository.findById(id);
    }

    /**
     * Adiciona uma pessoa fisica no repositorio.
     * 
     * @param pessoaFisica a pessoa fisica a ser adicionada.
     * 
     * @return a pessoa fisica adicionada.
     */
    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }

    /**
     * Altera uma pessoa fisica identificada pelo ID.
     * 
     * @param id           o ID da pessoa fisica a ser alterada.
     * @param pessoaFisica a pessoa fisica a ser alterada.
     * 
     * @return a pessoa fisica alterada.
     * 
     */
    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable Integer id,
            @RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }

    /**
     * Persiste uma alteracao em uma pessoa fisica existente ou persiste uma nova
     * pessoa fisica.
     * 
     * @param pessoaFisica a pessoa fisica a ser alterada ou criada.
     * 
     * @return a pessoa fisica alterada.
     */
    private PessoaFisica persistirPessoaFisica(PessoaFisica pessoaFisica) {
        PessoaFisica pf = pessoaFisica;
        if (pessoaFisica.getId() != null) {
            pf = pfRepository.findById(pessoaFisica.getId()).get();
            pf.setNome(pessoaFisica.getNome());
        }
        return pfRepository.save(pf);
    }

    /**
     * Remove uma pessoa fisica identificada pelo ID.
     * 
     * @param id o ID da pessoa fisica a ser removida.
     */
    @DeleteMapping(value = "/{id}")
    public void deletePessoaFisica(@PathVariable Integer id) {
        pfRepository.deleteById(id);
    }

}
