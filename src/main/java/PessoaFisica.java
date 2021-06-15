public class PessoaFisica extends Cliente{
	private String cpf; 
	//private String nome;
	
	public String getcpf() {
		return this.cpf;
	}
	@Override
	public String getNome(){
	  return super.getNome();
	}
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
}
