public class PessoaFisicaRestController {

	private PessoaFisicaRepository pfRepository;

	public PessoaFisicaRepository getPfRepository() {
		return pfRepository;
	}

	public void setPfRepository(PessoaFisicaRepository pfRepository) {
		this.pfRepository = pfRepository;
	}


	@Autowired
    private PessoaFisicaRepository pfRepository;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PessoaFisica> list() {
        return pfRepository.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<PessoaFisica> getPessoaFisica(@PathVariable Integer id) {
        return pfRepository.findById(id);
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Contact addContact(@RequestBody Contact contato) {
        return persistirContact(contato);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Contact updateContact(@PathVariable Integer id, @RequestBody Contact contato) {
        return persistirContact(contato);
    }

    private Contact persistirContact(PessoaFisica cpf) {
        PessoaFisica c = cpf;
        if (cpf.getId() != null) {
            c = pfRepository.findById(cpf.getId()).get();
            c.setName(cpf.getName());
        }
        return pfRepository.save(c);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteContact(@PathVariable Integer id) {
    	pfRepository.deleteById(id);
    }


}
