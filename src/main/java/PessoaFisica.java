public class PessoaFisica extends Cliente{
	
	private String CPF;

	public PessoaFisica(String nome, String cPF) {
		super(nome);
		this.CPF = cPF;
	}

	public String getCPF() {
		return CPF;
	}
	
	
	 }

