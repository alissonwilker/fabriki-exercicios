
public class ContaBancaria {
    private Cliente cliente;
    private static int contador = 0;
    private int id;
    private int saldo;

    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.id = ++contador;
        this.saldo = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

    public int getSaldo() {
        return saldo;
    }

    public int depositar(int valorDeposito) {
        if(valorDeposito > 0) {
            this.saldo = valorDeposito;
            return  this.saldo;
        }
        return 0 ;
    }

    public int sacar(int valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldo){
            this.saldo -= valorSaque;
        return  this.saldo;
    }
        return 0 ;
    }

}
