public class PessoaJuridica extends Cliente {

	String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj=cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
}
