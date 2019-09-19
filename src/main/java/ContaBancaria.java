
public class ContaBancaria {

	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = contador++;
	}

	public int depositar(int valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
		return this.saldo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public int getId() {
		return this.id;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public int sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			this.saldo -= valor;
		}
		return this.saldo;
	}

}
