package classes;

public class PessoaJuridica extends Cliente {

	private String cnpj;
	
	public PessoaJuridica(String _nome, String _cnpj) {
		super(_nome);
		this.cnpj = _cnpj;
	}

	public String getCpf() {
		return cnpj;
	}

}
