package spring;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PESSOAFISICA")
public class PessoaFisica extends Cliente{
	
	private String cpf;
	
	public PessoaFisica() {}

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
