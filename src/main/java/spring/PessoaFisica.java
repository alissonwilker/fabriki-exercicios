package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.ifb.java_web_dev.model.Cliente;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente {
	
	@Column(updatable = true, nullable = false, unique = true)
	private String cpf;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String _cpf) {
		this.cpf = _cpf;
	}

}
