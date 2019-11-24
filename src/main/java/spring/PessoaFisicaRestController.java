@RestController
@RequestMapping("pessoasFisicas")
@CrossOrigin
public class PessoaFisicaRestController {
	
	@Autowired
	private PessoaFisicaRepository pfRepository;
	
	  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody List<PessoaFisica> getPessoasFisicas() {
	        return pfRepository.findAll();
	    }
	
	  
	   @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable String id) {
	        return pfRepository.findById(id);
	    }
	
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
	    public void deletePessoaFisica(@PathVariable String id) {
	        pfRepository.deleteById(id);
	    }
	   
	   private PessoaFisica persistirPessoaFisica(PessoaFisica pessoaFisica) {
	        return pfRepository.save(pessoaFisica);
	    }

}
