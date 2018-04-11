
public class PessoaFisica extends Cliente{
	private String cpf;

	public PessoaFisica(String cliente, String cpf) {
		super(cliente);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
}
