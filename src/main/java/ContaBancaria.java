public class ContaBancaria {

    private static int contador = 0;

    private final Cliente cliente;
    private final int id;
    private int saldo;

    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.id = ++contador;
        this.saldo = 0;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        }
    }

    public void sacar(int valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldo) {
            this.saldo -= valorSaque;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }
}
