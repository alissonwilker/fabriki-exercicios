package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController {

    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> getPessoasFisicas(){
        return pessoaFisicaRepository.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer  id){
        return pessoaFisicaRepository.findById(id);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoaFisica){
        return persistirPessoaFisica(pessoaFisica);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable Integer id, @RequestBody PessoaFisica pessoaFisica){
        Optional<PessoaFisica> pessoaFisicaO = pessoaFisicaRepository.findById(id);
        pessoaFisica.setId(pessoaFisicaO.get().getId());
        return persistirPessoaFisica(pessoaFisica);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void deletePessoaFisica(@PathVariable Integer id){
        pessoaFisicaRepository.deleteById(id);
    }

    private PessoaFisica persistirPessoaFisica(PessoaFisica pessoaFisica){
        return pessoaFisicaRepository.save(pessoaFisica);
    }

}
