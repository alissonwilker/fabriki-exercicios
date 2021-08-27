package spring;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController extends Object{


	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;

	public PessoaFisicaRestController() {}

	@GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody public List<PessoaFisica> getPessoasFisicas(){
		return pfRepository.findAll();
	}

	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody public Optional<PessoaFisica> getPessoaFisica​(@PathVariable Integer id){
		return pfRepository.findById(id);
	}

	@PostMapping(path="/", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody public PessoaFisica addPessoaFisica​(@RequestBody PessoaFisica pessoaFisica) {
		return persistirPessoaFisica​(pessoaFisica);

	}
	@PutMapping(path="/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody public PessoaFisica updatePessoaFisica​(@PathVariable Integer id, @RequestBody PessoaFisica pessoaFisica){
		return  persistirPessoaFisica​(pessoaFisica);
	}

	private PessoaFisica persistirPessoaFisica​(PessoaFisica pessoaFisica) {
		return pfRepository.save(pessoaFisica);
	}

	@DeleteMapping("/{id}" produces = MediaType.APPLICATION_JSON_VALUE)
	public void deletePessoaFisica​(@PathVariable Integer id) {
		pfRepository.deleteById(id);
	}

}
