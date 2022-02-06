package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import spring.PessoaFisica;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente{
	
	@Column
	private String cpf;
	
	public PessoaFisica() {}
	public PessoaFisica(java.lang.String nome, java.lang.String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	public String getCpf(){
		return cpf;
		
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	
	
}
