package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Classe que representa uma pessoa fisica.
 *
 */
@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente {

    /**
     * O CPF da pessoa fisica.
     */
    @Column(updatable = false, nullable = false, unique = true)
    private String cpf;

    /**
     * Construtor padrao.
     * 
     */
    public PessoaFisica() {}

    /**
     * Construtor que recebe nome e CPF da pessoa fisica.
     * 
     * @param nome
     *            o nome da pessoa fisica.
     * @param cpf
     *            o CPF da pessoa fisica.
     */
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    /**
     * Recupera o CPF da pessoa fisica.
     * 
     * @return o CPF da pessoa fisica.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Altera o CPF da pessoa fisica.
     * 
     * @param cpf o novo CPF da pessoa fisica.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
