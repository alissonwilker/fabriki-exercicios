public class ContaBancaria {

    private int saldo = 0;
    private Cliente cliente;
    private int id;
    private  static int contador=0;

    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        ++contador;
        id = contador;
        
    }

    public int getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

    public int depositar(int valor) {
        if (valor >= 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("Deposite um valor positivo");
        }
        return saldo;
    }

    public int sacar(int valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Não é possível sacar valor");
        }
        return saldo;
    }

}
