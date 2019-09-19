public class PessoaJuridica extends Cliente {

	private String CNPJ;
	
	public PessoaJuridica(String nome, String CNPJ) {
		super(nome);
		this.CNPJ = CNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}


}
