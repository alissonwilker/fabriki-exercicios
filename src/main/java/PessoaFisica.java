

public class PessoaFisica extends Cliente {

	private String cpf;
	
	public PessoaFisica(String _nome, String _cpf) {
		super(_nome);
		this.cpf = _cpf;
	}

	public String getCnpj() {
		return cpf;
	}

}
