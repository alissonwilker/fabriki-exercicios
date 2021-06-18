public class PessoaJuridica extends Cliente {
	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}
	
	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
}
