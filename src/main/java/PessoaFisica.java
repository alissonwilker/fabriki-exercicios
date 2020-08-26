
public class PessoaFisica extends Cliente{

	private String cpf;
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
}
