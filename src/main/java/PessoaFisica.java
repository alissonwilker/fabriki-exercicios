package lpoo2905;

public class PessoaFisica extends Cliente{
    public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String nome, cpf;
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	

}
