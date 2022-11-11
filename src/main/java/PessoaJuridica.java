public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	protected PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cnpj;
	}
}
