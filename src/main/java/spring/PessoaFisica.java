package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PESSOAFISICA")
public class PessoaFisica extends Cliente {

	@Column
	private String cpf;

	public PessoaFisica() {
	}

	public PessoaFisica(String cpf, String nome) {
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
