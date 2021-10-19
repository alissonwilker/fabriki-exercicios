package spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica {

    /**
     * Identificador da conta. Representa o numero da instancia de ContaBancaria.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
    /**
     * Cpf da pedssoa.
     */
	private String cpf;
	
    /**
     * Nome da pessoa.
     */
	private String nome;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}

    /**
     * Recupera o identificador da pessoa.
     * 
     * @return o id da pessoa.
     */
	public Integer getId() {
		return id;
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
     * Altera o cpf da pessoa fisica.
     * 
     * @param cpf o novo cpf da pessoa fisica.
     */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
    /**
     * Recupera o nome da pessoa fisica.
     * 
     * @return o nome da pessoa fisica.
     */
	public String getNome() {
		return nome;
	}

    /**
     * Altera o nome da pessoa fisica
     * 
     * @param nome o novo nome da pessoa fisica
     */
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + "]";
	}


}
