
public class PessoaFisica extends Cliente {
	
	private String CPF;

	public PessoaFisica(String nome, String CPF) {
		super(nome);
		this.CPF = CPF;
		
		// TODO Auto-generated constructor stub
	}
	public String getCPF(){
		return CPF;
	}

}
