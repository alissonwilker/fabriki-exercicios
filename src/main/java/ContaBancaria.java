
public class ContaBancaria {
	private Cliente cliente;
	private int saldo;
	private int	id;
	private static int contador;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = ++contador;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public int depositar(int valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		}
		return saldo;
	}

	public int sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		}
		return saldo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
	
	public int getId() {
		return id;
	}
}
