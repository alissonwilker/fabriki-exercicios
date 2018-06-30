public class PessoaJuridica extends Cliente {
	private String CNPJ;
		
	public PessoaJuridica(String nomeCliente, String cnpj) {
		super(nomeCliente);
		this.CNPJ = cnpj;
		// TODO Auto-generated constructor stub
	}
	
	public String getCNPJ() {
		return this.CNPJ;
	}
}
