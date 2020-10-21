package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Classe que representa uma conta bancaria.
 *
 */
@Entity
@Table(name = "tb_pessoafisica")

public class PessoaFisica extends Cliente{
	
	
    /**
     * O cpf do cliente.
     */
    @Column(updatable = true, nullable = false, unique = true)
    private String cpf; 

    /**
     * Construtor padrao.
     */
    protected PessoaFisica() {}

    /**
     * Construtor que recebe o nome do cliente e cpf.
     * 
     * @param nome, cpf
     *            o nome do cliente.
     */
    protected PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    //Métodos Getter e Setter
    
    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
     * Recupera o nome do cliente.
     * 
     * @return o nome do cliente.
     */
    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
}
