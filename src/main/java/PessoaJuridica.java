public class PessoaJuridica extends Cliente {

	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}

	public PessoaJuridica(String nome, String cnpj) {
		// TODO Auto-generated constructor stub
		super(nome);
		this.cnpj = cnpj;
	}

}
