import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
public class PessoaFisicaRestController extends Object{
	
	@Autowired
	private PessoaFisicaRepository pfRepository;
	
	public PessoaFisicaRestController() {}
	
	
	@GetMapping(value="/", produces="application/json")
	@ResponseBody public List<PessoaFisica> getPessoasFisicas(){
		return pfRepository.findAll();
	}
	
	@GetMapping(value="/{id}", produces="application/json")
	@ResponseBody public Optional<PessoaFisica> getPessoaFisica​(@PathVariable Integer id){
		return pfRepository.findById(id);
	}
	
	@PostMapping(path="/", consumes="application/json")
	@ResponseBody public PessoaFisica addPessoaFisica​(@RequestBody PessoaFisica pessoaFisica) {
		return persistirPessoaFisica​(pessoaFisica);
		
	}
	@PutMapping(path="/{id}", consumes="application/json", produces="application/json")
	@ResponseBody public PessoaFisica updatePessoaFisica​(@PathVariable Integer id, @RequestBody PessoaFisica pessoaFisica){
		return  persistirPessoaFisica​(pessoaFisica);
	}

	private PessoaFisica persistirPessoaFisica​(PessoaFisica pessoaFisica) {
		
		PessoaFisica p = pessoaFisica;
		if(pessoaFisica.getId() != null) {
			p = pfRepository.findById(pessoaFisica.getId()).get();
			p.setNome(pessoaFisica.getNome());
		}
		return pfRepository.save(p);

	}
	
	@DeleteMapping("/{id}")
	public void deletePessoaFisica​(@PathVariable Integer id) {
		pfRepository.deleteById(id);
	}
	 
	

}
