package spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoasFisicas")
public class PessoaFisicaRestController {

  @Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;

  @GetMapping
  public List<PessoaFisica> findAll() {
    return pessoaFisicaRepository.findAll();
  }

  @PostMapping
  public PessoaFisica create(@RequestBody PessoaFisica pessoaFisica) {
    return pessoaFisicaRepository.save(pessoaFisica);
  }

  @PutMapping(path = {"/{id}"})
  public ResponseEntity<PessoaFisica> update(@PathVariable Long id, @RequestBody PessoaFisica pessoaFisica) {
    return pessoaFisicaRepository.findById(id)
      .map(record -> {
        record.setName(pessoaFisica.getName());
        record.setEmail(pessoaFisica.getEmail());
        record.setPhone(pessoaFisica.getPhone());
        PessoaFisica updated = pessoaFisicaRepository.save(record);
        return ResponseEntity.ok().body(updated);
      }).orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping(path = {"/{id}"})
  public ResponseEntity<?> delete(@PathVariable Long id) {
    return pessoaFisicaRepository.findById(id)
      .map(record -> {
        pessoaFisicaRepository.deleteById(id);
        return ResponseEntity.ok().build();
      }).orElse(ResponseEntity.notFound().build());
  }
}
