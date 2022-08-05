package spring;

import javax.persistence.Entity;
import javax.persistence.Table;

/* * Classe que representa uma pessoa fisica. * */@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente {
	private String cpf;

	/* * Construtor padrao. */public PessoaFisica() {
	}

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
}
