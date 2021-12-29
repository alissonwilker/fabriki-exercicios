
public class ContaBancaria extends java.lang.Object {
    //atributos
    private int id;
    private Cliente cliente;
    private int saldo;
    private static int contador;


    //métodos Personalisados
    public int depositar(int valor) {

        if(valor >= 0) {
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
        this.setCliente(cliente);

        contador = 2;
    }

    public int getId(){
    	return contador --;
    }


    public int getSaldo(){
        return this.saldo;
    }
    

    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
