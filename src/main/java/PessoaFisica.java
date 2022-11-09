public class PessoaFisica extends Cliente{

	private String cpf;
	
	protected PessoaFisica(String cliente, String cpf) {
		super(cliente);
		this.setCpf(cpf);
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
