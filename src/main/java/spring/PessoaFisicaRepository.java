public interface PessoaFisicaRepository {

	List<PessoaFisica> findAll();

	Optional<PessoaFisica> findById(Object object);

	Contact save(PessoaFisica c);

	void deleteById(Integer id);

}
