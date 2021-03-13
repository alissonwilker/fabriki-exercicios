package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoaFisica")
public class PessoaFisica extends Cliente {
	
    @Id
    @Column(updatable = true)
    private String cpf;


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
