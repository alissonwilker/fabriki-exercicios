public class PessoaFisicaRestController extends Object{
	

	@Autowired
	private PessoaFisicaRepository pfRepository;
	
	public PessoaFisicaRestController() {}
	
	@GetMapping(value="/", produces= MediaType.APPLICATION_JSON_VALUE)
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
	
	@DeleteMapping("/{id}")
	public void deletePessoaFisica​(@PathVariable Integer id) {
		pfRepository.deleteById(id);
	}
	 
}
