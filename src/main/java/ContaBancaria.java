
public class ContaBancaria {

	private int saldo;
	private Cliente cliente;
	private int id; 
	private static int contador;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		id = contador++;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public void depositar(int valor) {
		if(valor > 0) {
			saldo += valor;
		}
	}
	
	public void sacar(int valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor; 
		}
	}
	
	public int getId() {
		return id;
	}
}
