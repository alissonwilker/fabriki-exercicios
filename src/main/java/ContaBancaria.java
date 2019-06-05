public class ContaBancaria {
    private Cliente cliente;
    private int Saldo;

    public ContaBancaria(Cliente cliente) {
        this.cliente=cliente;
    }

    public int depositar(int valor) {
        if (valor > 0) {
            Saldo = Saldo + valor;
        }
        return Saldo;
    }

    public int sacar(int valor) {
        if (valor > 0 && valor <= Saldo) {
            Saldo = Saldo - valor;

        }
        return Saldo;
    }
    public Cliente getCliente(){
        return cliente;
    }

    public int getSaldo(){
        return Saldo;
    }

} 
