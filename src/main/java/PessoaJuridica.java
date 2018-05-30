package lpoo2905;

public class PessoaJuridica extends Cliente{
	
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String nomeEmpresa, cnpj;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica(String nomeEmpresa, String cnpj) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
	}
	

}