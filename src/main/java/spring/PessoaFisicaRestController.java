[21:29, 18/10/2021] Amor: package spring;

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
@RequestMapping("PessoaFisica")
@CrossOrigin
public class PessoaFisicaRestController {
    
    @Autowired
    private PessoaFisicaRepository pfRepository;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> getPessoaFisicas() {
        return pfRepository.findAll();
    }


    @GetMapping(value = "/{cpf}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer cpf) {
        return pfRepository.findById(cpf);
    }


    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica PessoaFisica) {
        return persistirPessoaFisica(PessoaFisica);
    }


    @PutMapping(path = "/{cpf}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable String cpf, @RequestBody PessoaFisica PessoaFisica) {
        return persistirPessoaFisica(PessoaFisica);
    }


    @DeleteMapping(value = "/{cpf}")
    public void deletePessoaFisica(@PathVariable Integer cpf) {
        pfRepository.deleteByCpf(cpf);
    }
    
    private PessoaFisica persistirPessoaFisica(PessoaFisica PessoaFisica) {
        return pfRepository.save(PessoaFisica);
    }

}
