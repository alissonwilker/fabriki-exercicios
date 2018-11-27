public class PessoaJuridica extends Cliente {

	public java.lang.String cnpj;

	public PessoaJuridica(java.lang.String nome, java.lang.String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	public java.lang.String getCnpj() {
		return cnpj;
	}

}
