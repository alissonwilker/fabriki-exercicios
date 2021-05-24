package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pessoasFisicas")
public class PessoaFisicaRestController {

    @Autowired
    private PessoaFisicaRepository pfRepository;


    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> getPessoasFisicas() {
        return pfRepository.findAll();
    }


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(
    		@PathVariable Integer id) {
        return pfRepository.findById(id);
    }


    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(
    		@RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }


    @PutMapping(
    		path = "/{id}", 
    		consumes = MediaType.APPLICATION_JSON_VALUE, 
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(
    		@PathVariable String id,
            @RequestBody PessoaFisica pessoaFisica) {
        return persistirPessoaFisica(pessoaFisica);
    }


    private PessoaFisica persistirPessoaFisica(PessoaFisica pessoaFisica) {
        return pfRepository.save(pessoaFisica);
    }


    @DeleteMapping(value = "/{id}")
    public void deletePessoaFisica(@PathVariable Integer id) {
        pfRepository.deleteById(id);
    }

}
