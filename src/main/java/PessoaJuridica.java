public class PessoaJuridica extends Cliente {

	private String cnpj;
	
	// Contrutor
	protected PessoaJuridica(String cnpj, String nome) {
		super(nome);
	}

	public String getCnpj() {
		return cnpj;
	}
}
