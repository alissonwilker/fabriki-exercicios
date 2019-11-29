public class PessoaFisica extends Cliente {

	private String CPF;

	public PessoaFisica(String nome,String CPF) {
		super(nome);
		this.CPF = CPF;
	}

	public String getCPF() {
		return CPF;
	}


}
