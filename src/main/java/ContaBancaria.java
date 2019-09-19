
public class ContaBancaria {
	private Cliente cliente;
	
	private static int contador;

	private int saldo;
	
	private int id;
	
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = ++contador;
	}

	
	public int getSaldo() {
		return this.saldo;
	}

	public int getId() {
		return this.id;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public int depositar(int valor) {
		
		
		if (valor > 0) {
			this.saldo += valor;
			
		}
		return this.saldo;
	}
	
	public int sacar (int valor) {
		
		if (valor > 0 && valor <= saldo) {
			this.saldo -= valor;
		}
		return this.saldo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

