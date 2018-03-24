import java.util.Collection;
import java.util.HashSet;

/**
 * Classe abstrata que representa um cliente (pessoa física ou pessoa jurídica).
 *
 */
public abstract class Cliente {
    /**
     * O nome do cliente.
     */
    private String nome;

    /**
     * As contas vinculadas ao cliente.
     */
    private Collection<ContaBancaria> contasBancarias = new HashSet<>();

    /**
     * Construtor que recebe o nome do cliente.
     * 
     * @param nome
     *            o nome do cliente.
     */
    protected Cliente(String nome) {
        this.nome = nome;
    }

    /**
     * Recupera o nome do cliente.
     * 
     * @return o nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Adiciona uma conta bancária a esse cliente.
     * 
     * @param contaBancaria
     *            a conta bancária a ser adicionada a esse cliente.
     */
    public void adicionarContaBancaria(ContaBancaria contaBancaria) {
        contasBancarias.add(contaBancaria);
    }

    /**
     * Recupera as contas bancárias do cliente.
     * 
     * @return as contas bancárias do cliente.
     */
    public Collection<ContaBancaria> getContasBancarias() {
        return contasBancarias;
    }

}
