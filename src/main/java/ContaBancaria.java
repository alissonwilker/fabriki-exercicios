
public class ContaBancaria {
	private int id;
	private int saldo;
	private static int contador;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		id = ++contador;
	}

	public int getSaldo() {
		return saldo;
	}

	public int depositar(int valorDepositor) {
		if (valorDepositor >= 0) {
			this.saldo = saldo + valorDepositor;
			return valorDepositor;
		} else {
			return 0;
		}

	}

	public int sacar(int valorSaque) {
		if (valorSaque >= 0) {
			if (valorSaque <= saldo) {
				this.saldo = saldo - valorSaque;
			}
		}

		return saldo;

	}

	public int getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
