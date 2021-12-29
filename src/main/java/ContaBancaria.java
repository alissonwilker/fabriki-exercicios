
public class ContaBancaria {
    //atributos
    private int id;
    private Cliente cliente;
    private int saldo = 0;
    private static int contador;


    //métodos Personalisados
    public int depositar(int valor) {
    	
        if (valor > 0) {
            saldo = saldo + valor;
        }
        return saldo;
    }

    public int sacar(int valor) {

        if(valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        }
		return saldo;
    }


    //métodos especiais
    public ContaBancaria(Cliente cliente) {  	
        this.id = ++contador;
        
        this.cliente = cliente;
    }


    public int getId() {
        return id;
    }


    public int getSaldo() {
        return saldo;
    }
    

    public Cliente getCliente() {
        return this.cliente;
    }
}
