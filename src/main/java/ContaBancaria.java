public class ContaBancaria {

    private Cliente cliente;
    private static int contador = 0;
    private int id;
    private int saldo = 0;
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        contador++;
        id = contador;
    }

    public int getSaldo() {
       return this.saldo;
    }

    public void depositar(int valor) {
        if(valor < 0){
            valor = 0;
        }
        this.saldo += valor;
    }

    public void sacar(int valor) {
        if(valor > this.saldo)
            valor = 0;
        this.saldo -= valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }
}
