public class ContaBancaria {

	private Cliente cliente;
	private int id;
	private static int contador;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		contador++;
		id = contador;
	}

	public int getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;

	}

	public int getSaldo() {
		return saldo;
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
		return saldo;
	}
}
