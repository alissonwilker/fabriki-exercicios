package spring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pessoaFisica")
public class PessoaFisica extends Cliente {

    @Column(updatable = true)
    private String cpf;


	public PessoaFisica(String cpf, String nome) {
           super(nome);
           this.cpf = cpf;
	}

               public PessoaFisica() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
