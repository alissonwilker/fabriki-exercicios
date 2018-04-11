public class PessoaJuridica extends Cliente {

	private String cpf;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cpf = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

}
