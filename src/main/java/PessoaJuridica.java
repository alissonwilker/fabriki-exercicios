
public class PessoaJuridica extends Cliente {
	public String nome;
	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}

}
