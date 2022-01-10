
public class PessoaFisica extends Cliente {

	String cpf;

	PessoaFisica(String nome, String cpf) {
	
		nome = this.nome;
		cpf = this.cpf;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
