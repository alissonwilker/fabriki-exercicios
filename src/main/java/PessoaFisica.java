public class PessoaFisica extends Cliente{

	private String cpf;
	
	// Contrutor
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	// getter and setter
	public String getCpf() {
		return cpf;
	}
}
