/**
 * Classe que representa uma pessoa jurÃ­dica.
 *
 */
public class PessoaJuridica extends Cliente {
    /**
     * O CNPJ da pessoa jurÃ­dica.
     */
    private String cnpj;

    /**
     * Construtor que recebe o nome e o CNPJ da pessoa jurÃ­dica.
     * 
     * @param nome
     *            o nome da pessoa jurÃ­dica.
     * @param cnpj
     *            o CNPJ da pessoa jurÃ­dica.
     */
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    /**
     * Recupera o CNPJ da pessoa jurÃ­dica.
     * 
     * @return o CNPJ da pessoa jurÃ­dica.
     */
    public String getCnpj() {
        return cnpj;
    }

}
