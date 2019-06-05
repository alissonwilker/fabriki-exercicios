public class PessoaFisica extends Cliente {
	private String cpf;

	public PessoaFisica(String nome, String cpf) {

		super(nome);
		this.cpf = cpf;

	}

	public String getCnpj() {

		return cpf;
	}
}
