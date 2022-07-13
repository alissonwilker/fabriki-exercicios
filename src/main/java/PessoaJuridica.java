public class PessoaJuridica extends Cliente {

	private String Cnpj;

	public PessoaJuridica(String Nome, String Cnpj) {

		super(Nome);
		this.Cnpj=Cnpj;
	}

	public String getCnpj() {
		return Cnpj;
	}





}
