package spring;

public class PessoaFisica extends ContaBancaria {

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public Object getNome() {
		return this.getNome();
	}

	public void setNome(String string) {
		
	}
	
	public Object getCpf() {
		return this.getCpf();
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

 @Override
	public Object getId() {
		return null;
	}

}
