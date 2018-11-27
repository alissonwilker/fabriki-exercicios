public class PessoaFisica extends Cliente {
	private String cpf = "XXX.XXX.XXX-ZZ";

	public PessoaFisica(String nome, String cpf) {
		// TODO Auto-generated constructor stu
		this.cpf = cpf;
		this.nome = "Carlos";

	}

	public String getCpf() {
		return cpf;

	}

}
