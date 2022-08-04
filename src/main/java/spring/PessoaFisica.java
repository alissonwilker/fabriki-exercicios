import javax.persistence.Column;

public class PessoaFisica extends Cliente {
	
	@Column(updatable = true, nullable = false, unique = true)
	private String cpf;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String _cpf) {
		this.cpf = _cpf;
	}

}
