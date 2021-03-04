public class PessoaFisica extends Cliente {
	private java.lang.String cpf;

	public PessoaFisica(java.lang.String nome, java.lang.String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	public java.lang.String getCpf() {
		return cpf;
	}

}
