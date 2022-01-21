public class ContaBancaria {

    private static int contador;
    private int id;
    private int saldo = 0;
    private Cliente cliente;

  
    public ContaBancaria(Cliente cliente) {
        this.id = ++contador;
        this.cliente = cliente;
    }


    public int getId() {
        return id;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public int getSaldo() {
        return saldo;
    }

    
    public int depositar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
        return saldo;
    }
    
    public int sacar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        }
        return saldo;
    }

}
