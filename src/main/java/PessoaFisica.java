/**
 * Classe que representa uma pessoa fÃ­sica.
 *
 */
public class PessoaFisica extends Cliente {
    /**
     * O CPF da pessoa fÃ­sica.
     */
    private String cpf;

    /**
     * Construtor que recebe nome e CPF da pessoa fÃ­sica.
     * 
     * @param nome
     *            o nome da pessoa fÃ­sica.
     * @param cpf
     *            o CPF da pessoa fÃ­sica.
     */
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    /**
     * Recupera o CPF da pessoa fÃ­sica.
     * 
     * @return o CPF da pessoa fÃ­sica.
     */
    public String getCpf() {
        return cpf;
    }

}
