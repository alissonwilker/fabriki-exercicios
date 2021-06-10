public class ContaBancaria {
	
	private static int contador;
	private int id;
	private int saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = contador++;
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
		if (valor > 0) {
			saldo += valor;
		}
		return saldo;
	}

	public int sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		}
		return valor;
	}
}
