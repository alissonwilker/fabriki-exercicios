package spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica {
	
	private String cpf;
	private String nome;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public int getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome, String cpf) {
		this.nome = nome;	
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

        public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
