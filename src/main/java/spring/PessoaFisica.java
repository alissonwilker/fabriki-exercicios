public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, String cpf) {
		this.cpf = cpf;
		super(nome);
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
