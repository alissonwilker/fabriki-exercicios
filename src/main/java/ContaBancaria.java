public class ContaBancaria {
	
	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;
	
	public ContaBancaria(Cliente cliente) {
		super();
		this.cliente = cliente;
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
	
	public int depositar(int valor) {
		if(valor >= 0) {
			this.saldo += valor;
		}
		
		return this.saldo;
	}
	
	public int sacar(int valor) {
		if(valor >=0 && valor < this.saldo) {
			this.saldo -= valor;
		}
		return this.saldo;
	}
	
}
