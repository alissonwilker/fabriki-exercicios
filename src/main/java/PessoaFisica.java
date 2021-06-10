
public class PessoaFisica extends Cliente{
	
	private String cpf; 

	public PessoaFisica(String nome, String cpf) {
		this.cpf = cpf;
		nome = this.getNome();
	}
	
	public String getCpf() {
		return this.cpf;
	} 

}
