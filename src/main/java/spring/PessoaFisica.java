/**
 * 
 */
package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * classe que representa uma pessoa fisica
 *
 */
@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente {
	
	 /**
     * CPF do cliente.
     */
	 @Column(updatable = false, nullable = false, unique = true)
    private String cpf; 

	/**
     * Construtor padrao.
     *
	 */
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *
     * Construtor que recebe o nome e o cpf da pessoa fisica.
     * 
     * @param nome
     *            nome da pessoa fisica.
     *
	 * 
	 * 
	 * @param cpf
	 *           cpf da pessoa fisica.
	 */
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf=cpf;
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Recupera o cpf da pessoa fisica.
     * 
     * @return o cpf da pessoa fisica.
     */
    public String getCpf() {
        return cpf;
    }
    
    /**
     * seta o cpf da pessoa fisica.
     * 
     * @param cpf: o cpf da pessoa fisica.
     */
    public void setCpf(String cpf) {
        this.cpf=cpf;
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof PessoaFisica) {
        	PessoaFisica p = (PessoaFisica) obj;
            result = p.getId() == this.getId();
        }

        return result;
    }

}
