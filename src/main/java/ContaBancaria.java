/**
 * Classe que representa uma conta bancÃ¡ria.
 *
 */
public class ContaBancaria {
    /**
     * Saldo da conta bancÃ¡ria.
     */
    private int saldo = 0;

    /**
     * O cliente dono da conta bancÃ¡ria.
     */
    private Cliente cliente;

    /**
     * Construtor que recebe o cliente dono da nova conta bancÃ¡ria. 
     * 
     * @param cliente
     *            o cliente dono da conta bancÃ¡ria.
     */
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Recupera o cliente dono da conta bancÃ¡ria.
     * 
     * @return o cliente dono da conta bancÃ¡ria.
     */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * Recupera o saldo da conta bancÃ¡ria.
     * 
     * @return o saldo da conta bancÃ¡ria.
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Deposita um valor na conta bancÃ¡ria, desde que esse valor seja positivo.
     * 
     * @param valor
     *            o valor a ser depositado na conta bancÃ¡ria. O valor a ser depositado deve ser
     *            positivo.
     */
    public void depositar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    /**
     * Saca um valor da conta bancÃ¡ria, se esse valor for positivo e menor ou igual ao saldo.
     * 
     * @param valor
     *            o valor a ser sacado da conta bancÃ¡ria. O valor a ser sacado deve ser positivo e menor
     *            ou igual ao saldo da conta bancÃ¡ria.
     * @return o novo saldo da conta bancÃ¡ria, apÃ³s o saque.
     */
    public int sacar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        }
        return saldo;
    }

}
