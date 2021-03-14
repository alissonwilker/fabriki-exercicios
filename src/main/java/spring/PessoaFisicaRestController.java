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

/**
 * Controller REST de entidades <code>PessoaFisica</code>.
 */
@RestController
@RequestMapping("pessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController {
	
@Autowired	
	private PessoaFisicaRepository pfRepository;

/**
 * Recupera a lista completa de pessoas fisicas.
 * 
 * @return a lista de todas as pessoas fisicas.
 */

@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody List<PessoaFisica>getPessoaFisica(){
	return pfRepository.findAll();
}

/**
 * Recupera uma conta bancaria pelo ID.
 * 
 * @param id o ID da pconta bancaria a ser recuperada.
 * @return a pessoa fisica recuperada ou null, se nao existir.
 */

@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id){
	return pfRepository.findById(id);
	
}

@PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody PessoaFisica addPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
	return persistirPessoaFisica(pessoaFisica);
}


@PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody PessoaFisica updatePessoaFisica(@PathVariable String id,
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
