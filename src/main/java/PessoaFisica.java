public class PessoaFisica extends Cliente {
	private String cpf;

	public PessoaFisica(String nome, String cpf) {
		super (nome);
		this.cpf=cpf;
		// TODO Auto-generated constructor stub
	}
	
	public String getCpf() {
		return cpf;
	}

}
