public class PessoaFisica extends Cliente {
	private String cpf;

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.setCpf(cpf);
		// TODO Auto-generated constructor stub
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
