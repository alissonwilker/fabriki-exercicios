public class PessoaJuridica extends Cliente{

	private String cnpj;

	protected PessoaJuridica(String cliente, String cnpj) {
		super(cliente);
		this.setCnpj(cnpj);		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
