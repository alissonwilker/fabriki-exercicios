public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	String getCnpj() {
		return cnpj;
	}
}