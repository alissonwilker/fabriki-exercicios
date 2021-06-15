public class PessoaJuridica extends Cliente {
	private String cnpj;
	
	public String getcnpj() {
		return this.cnpj;
	}
	@Override
	public String getNome(){
	  return super.getNome();
	}
	
	public PessoaJuridica(String cnpj, String nome) {
		super(nome);
		this.cnpj = cnpj;
	}
}
