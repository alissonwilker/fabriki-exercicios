public class PessoaFisica extends Cliente {

	private String cpf;
	
	public PessoaFisica(String nome, String cpf){
		super(cpf);		
	}

	public String getCpf() {
		return cpf;
	}
	
}