package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente {
	/**
     * O nome do cliente.
     */
    @Column
    private String cpf; 

    /**
     * Construtor padrao.
     */
    protected PessoaFisica() {}

   
    public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf= cpf;
	}

    

	public String getCpf() {
		return this.cpf;
	}

	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
    
}
