public class PessoaFisica extends Cliente{
	private String cpf; 
	
	public String getCpf() {
		return cpf;
	}

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
}
