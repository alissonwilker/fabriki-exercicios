package spring;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name = "tb_pessoafisica")

public class PessoaFisica extends Cliente{
	
//ATRIBUTOS
	
	private String cpf;
	
	
//CONSTRUTORES
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, String cpf) {
		this.cpf = cpf;
	}
	
//GETTERS & SETTERS

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
