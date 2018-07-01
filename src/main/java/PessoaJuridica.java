public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	
	public PessoaJuridica(String nome, String cnpj) {
		super(cnpj);
	}
	
	public String getCnpj() {
		return cnpj;
	}

}