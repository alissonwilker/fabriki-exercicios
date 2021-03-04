public class PessoaJuridica extends Cliente {
	private java.lang.String cnpj;

	public PessoaJuridica(java.lang.String nome, java.lang.String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	public java.lang.String getCnpj() {
		return cnpj;
	}

}
