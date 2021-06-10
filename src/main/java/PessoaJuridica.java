
public class PessoaJuridica extends Cliente {

	private String cnpj;


	public PessoaJuridica(String nome, String cnpj) {
		this.cnpj = cnpj;
		nome = this.getNome();
	}
	
	public String getCnpj() {
		return this.cnpj;
	}

}
