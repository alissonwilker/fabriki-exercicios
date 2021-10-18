package spring;

import javax.persistence.*;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente {

    private String cpf;

    /**
     * Construtor padrao.
     */
    public PessoaFisica() {
    }

    /**
     * Construtor que recebe o nome e o CPF da pessoa física
     *
     * @param nome o nome da pessoa física
     * @param cpf  o cpf da pessoa física
     */
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    /**
     * Recupera o CPF da pessoa física.
     *
     * @return o CPF da pessoa física.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Altera o o CPF da pessoa física.
     *
     * @param cpf o novo CPF da pessoa física.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
