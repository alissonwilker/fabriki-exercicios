package spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pessoas")
public class PessoaFisicaRestController {

	@Autowired
	private PessoaFisicaRepository pfRepository;
	

	@GetMapping("/{id}")
	public Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
		return pfRepository.findById(id);
	}
	
	@GetMapping
	public List<PessoaFisica> getPessoasFisicas(){
		List<PessoaFisica> lista = pfRepository.findAll();
		return lista;
	}
	
	@PostMapping
	public PessoaFisica addPessoaFisica(@RequestBody PessoaFisica obj) {
		return pfRepository.save(obj);
	}
	
	@PutMapping
	public PessoaFisica updatePessoaFisica(PessoaFisica obj, String cpf) {
		return pfRepository.save(obj);
	}
	
}
