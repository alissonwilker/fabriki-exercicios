package spring;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente{

	@Column
	private String cpf;
	
	@OneToMany
	private List<ContaBancaria> contaBancaria;
	
	public PessoaFisica() {}
	
	public PessoaFisica(String nome, String cpf) {
		this.nome = nome;
		this.cpf =  cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
