public class PessoaFisica extends Cliente {
	
	private String cpf;
	
	public PessoaFisica(){}

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		int cpf;

	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
