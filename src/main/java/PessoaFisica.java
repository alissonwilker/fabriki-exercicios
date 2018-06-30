public class PessoaFisica extends Cliente {
	private String CPF;
	
	public PessoaFisica(String nomeCliente, String CPF) {
		super(nomeCliente);
		this.CPF = CPF;
		// TODO Auto-generated constructor stub
	}
	
	public String getCPF() {
		return this.CPF;
	}
}
