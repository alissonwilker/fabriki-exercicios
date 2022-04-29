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
	
	@Autowired
	private PessoaFisicaRepository pfRepository ;

	private PessoaFisica persistirPessoaFisica(PessoaFisica pessoafisica) {
		return pfRepository.save(pessoafisica);
	}

	@GetMapping(path="/",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PessoaFisica> getPessoasFisicas(){
		List<PessoaFisica> pessoasfisicas= pfRepository.findAll();
		
		return pessoasfisicas;
	}
	
	@GetMapping(path ="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<PessoaFisica> getPessoaFisica(@PathVariable(value="id") Integer id){
		Optional<PessoaFisica> pessoa = pfRepository.findById(id);
		
		return pessoa;
		
	}
	
	@PostMapping(path="/",consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoafisica) {
		return persistirPessoaFisica(pessoafisica);
	}
	
	@PutMapping(path="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable(value="id") Integer id,@RequestBody PessoaFisica pessoafisica) {
		return persistirPessoaFisica(pessoafisica);
	}
	
	@DeleteMapping(value="/{id}")
	public void deletePessoaFisica(@PathVariable(value="id") Integer id) {
		pfRepository.deleteById(id);
	}
	
	

	
	
	
}
