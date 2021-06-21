
/**
 * Classe que representa uma conta bancaria.
 */
public class ContaBancaria {

    /**
     * O cliente dono da conta bancaria.
     */
    private Cliente cliente;

    /**
     * Contador de instancias da classe ContaBancaria.
     */
    private static int contador;
    /**
     * Identificador da conta.
     */
    private int id;
    /**
     * Saldo da conta bancaria.
     */
    private int saldo;

    /**
     * Construtor que recebe o cliente dono da nova conta bancaria. Tambem
     * configura o id da conta de acordo com o contador de instancias, que eh
     * incrementado por este construtor.
     *
     * @param cliente o cliente dono da conta bancaria.
     */
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.id = ++ContaBancaria.contador;
        this.saldo = 0;
    }

    /**
     * Recupera o saldo da conta bancaria.
     *
     * @return o saldo da conta bancaria.
     */
    public int getSaldo() {
        return this.saldo;
    }

    /**
     * Deposita um valor na conta bancaria, desde que esse valor seja positivo.
     *
     * @param valor o valor a ser depositado na conta bancaria. O valor a ser
     * depositado deve ser positivo.
     * @return o novo saldo da conta bancaria, apos o deposito.
     */
    public int depositar(int valor) {
        if (valor < 0) valor=0;
        this.saldo += valor;
        return this.saldo;
    }

    /**
     * Saca um valor da conta bancaria, se esse valor for positivo e menor ou
     * igual ao saldo.
     *
     * @param valor o valor a ser sacado da conta bancaria. O valor a ser sacado
     * deve ser positivo e menor ou igual ao saldo da conta bancaria.
     * @return o novo saldo da conta bancaria, apos o saque.
     */
    public int sacar(int valor) {
        if (valor < 0) valor=0;
        if (valor > this.saldo) valor=0;
        this.saldo -= valor;
        return this.saldo;
    }

    /**
     * Recupera o cliente dono da conta bancaria.
     *
     * @return o cliente dono da conta bancaria.
     */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * Recupera o identificador da conta.
     *
     * @return o id da conta.
     */
    public int getId() {
        return this.id;
    }

}
