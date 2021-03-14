package spring;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente{
	private String cpf;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;	
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String setCpf(String cpf) {
		this.cpf = cpf;
		return this.cpf;
	}	
}
