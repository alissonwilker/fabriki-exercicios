
public class PessoaJuridica extends Cliente{
	
	private Cliente cnpj;

	protected PessoaJuridica(Cliente nome, Cliente cnpj) {
		super(nome);

		this.cnpj = cnpj;
	}

	public Cliente getCnpj() {
		return cnpj;
	}
}
