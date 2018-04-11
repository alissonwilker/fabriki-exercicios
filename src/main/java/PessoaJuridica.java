
public class PessoaJuridica extends Cliente {
	
	private String CNPJ;

	public PessoaJuridica(String nome, String CNPJ) {
		super(nome);
		this.CNPJ = CNPJ;
		
		// TODO Auto-generated constructor stub
	}
	public String getCNPJ(){
		return CNPJ;
	}

}
