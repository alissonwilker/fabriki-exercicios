public class ContaBancaria {
	
	private static int contador;
	private int id;
	private int saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = ++contador;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public int getId() {
		return id;
	}
	
	public int depositar(int valor) {
		if (valor > 0) {
			saldo += valor;
		}
		return getSaldo();
	}

	public int sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		}
		return getSaldo();
	}
}
