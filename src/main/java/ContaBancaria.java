/**
 * Classe que representa uma conta bancária.
 *
 */
public class ContaBancaria {
    /**
     * Saldo da conta bancária.
     */
    private int saldo = 0;

    /**
     * O cliente dono da conta bancária.
     */
    private Cliente cliente;

    /**
     * Número de identificação da conta bancária.
     */
    private int id;

    /**
     * Número sequencial usado para os identificadores (ids) de contas bancárias. Esse sequencial é
     * incrementado a cada criação de conta bancária.
     */
    private static int sequencial = 0;

    /**
     * Construtor que recebe o cliente dono da nova conta bancária. O sequencial é incrementado e o seu
     * valor é atribuído ao id desta nova conta bancária. Em seguida, esta nova conta bancária é
     * adicionada à lista de contas bancárias do cliente.
     * 
     * @param cliente
     *            o cliente dono da conta bancária. A lista de contas bancárias deste cliente é
     *            atualizada com a nova conta bancária criada.
     */
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.id = ++sequencial;
        cliente.adicionarContaBancaria(this);
    }

    /**
     * Recupera o número de identificação da conta bancária.
     * 
     * @return o número de identificação da conta bancária.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Recupera o cliente dono da conta bancária.
     * 
     * @return o cliente dono da conta bancária.
     */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * Recupera o saldo da conta bancária.
     * 
     * @return o saldo da conta bancária.
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Deposita um valor na conta bancária, desde que esse valor seja positivo.
     * 
     * @param valor
     *            o valor a ser depositado na conta bancária. O valor a ser depositado deve ser
     *            positivo.
     */
    public void depositar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    /**
     * Saca um valor da conta bancária, se esse valor for positivo e menor ou igual ao saldo.
     * 
     * @param valor
     *            o valor a ser sacado da conta bancária. O valor a ser sacado deve ser positivo e menor
     *            ou igual ao saldo da conta bancária.
     * @return o novo saldo da conta bancária, após o saque.
     */
    public int sacar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        }
        return saldo;
    }

}
