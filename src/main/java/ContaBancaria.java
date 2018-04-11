
public class ContaBancaria {
	private int saldo;
	private Cliente cliente;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public void depositar(int valor) {
		if(valor > 0) {
			this.saldo += valor;
		}
	
	}
	
	public int sacar(int valor) {
		
		if(valor <= saldo) {
			this.saldo -= valor;
		}
		
		return this.saldo;
	}
}
