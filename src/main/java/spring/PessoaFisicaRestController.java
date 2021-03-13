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

@RestController
@RequestMapping("pessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController {

	// instancia um repositorio de pessoafisica
	@Autowired
	private PessoaFisicaRepository pfRepository;

	// requisição do tipo get para listar todas as pessoas fisicas
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<PessoaFisica> getPessoaFisica() {
		return pfRepository.findAll();
	}

	// requisição do tipo get para buscar a pessoa fisica pelo id
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
		return pfRepository.findById(id);
	}

	// requisição do tipo post para cadastrar uma pessoa fisica recebendo uma pessoa
	// fisica como parametro
	@PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
		return persistirPessoaFisica(pessoaFisica);
	}

	@PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable String id,
			@RequestBody PessoaFisica pessoaFisica) {
		return persistirPessoaFisica(pessoaFisica);
	}

	@DeleteMapping(value = "/{id}")
	public void deletePessoaFisica(@PathVariable Integer id) {
		pfRepository.deleteById(id);
	}

	// Metodo para salvar uma pessoa fisica dentro do repositorio
	private PessoaFisica persistirPessoaFisica(PessoaFisica pessoafisica) {
		return pfRepository.save(pessoafisica);
	}

}
