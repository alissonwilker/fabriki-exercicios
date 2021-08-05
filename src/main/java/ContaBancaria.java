public class ContaBancaria {
    private static Integer contador = 0;

    private final Cliente cliente;
    private final int id;
    private int saldo;

    public ContaBancaria(Cliente cliente) {
        this.id = contador++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
        }
    }

    public void sacar(int valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
        }
    }
}
