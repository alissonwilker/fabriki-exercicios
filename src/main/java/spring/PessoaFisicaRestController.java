package spring;

import java.util.List;
import java.util.Optional;

public class PessoaFisicaRestController extends Object{

	private PessoaFisicaRepository pfRepository; 
	
	
	  
	    public PessoaFisicaRestController() {
		super();
	}



		public PessoaFisica addPessoaFisica( PessoaFisica pessoaFisica) {
	        return persistirPessoaFisica(pessoaFisica);
	    }
		
	    private PessoaFisica persistirPessoaFisica(PessoaFisica pessoaFisica) {
	        return pfRepository.save(pessoaFisica);
	    }		
	    
	    public void deletePessoaFisica(Integer id) {
	        pfRepository.deleteById(id);
	    }
	    
	    public Optional<PessoaFisica> getPessoaFisica(Integer id) {
	        return pfRepository.findById(id);
	    }
	
	    public List<PessoaFisica> getPessoasFisicas() {
	        return pfRepository.findAll();
	    }
	    
	    public PessoaFisica updatePessoaFisica(String id, PessoaFisica pessoaFisica) {
	        return persistirPessoaFisica(pessoaFisica);
	    }
}
