public class PessoaJuridica extends Cliente {
	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
		// TODO Auto-generated constructor stub
	}
	public String getcnpj(){
		return cnpj;
	}

}
