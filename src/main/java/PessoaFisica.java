public class PessoaFisica extends Cliente {
	private String cpf;


	public PessoaFisica(String nome, String cpf) {
		// TODO Auto-generated constructor stub
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

}
