package spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoasFisicas")
public class PessoaFisicaRestController {
  @Autowired
  private PessoaFisicaRepository pfRepository;

  @RequestMapping(method=RequestMethod.GET)
  public List<PessoaFisica> getPessoasFisicas() {
    List<PessoaFisica> pfs = pfRepository.findAll();
    return pfs;
  }

  @RequestMapping(value="/{id}", method=RequestMethod.GET)
  public Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
    Optional<PessoaFisica> pf = pfRepository.findById(id);
    return pf;
  }

  @RequestMapping(method = RequestMethod.POST)
  public PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pf) {
    pf = pfRepository.save(pf);
    return pf;
  }

  @RequestMapping(value="/{cpf}", method = RequestMethod.PUT)
  public PessoaFisica updatePessoaFisica(@RequestBody PessoaFisica pf, String cpf) {
    pf.setCpf(cpf);
    pf = pfRepository.save(pf);
    return pf;
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deletePessoaFisica(@PathVariable Integer id) {
    pfRepository.deleteById(id);
    return null;
  }
}
