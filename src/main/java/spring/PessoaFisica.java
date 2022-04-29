package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_pessoafisica")
public class PessoaFisica extends Cliente{
	
	@Column
	private String cpf;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String cpf,String nome) {
		this.cpf = cpf;
		this.setNome(nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
