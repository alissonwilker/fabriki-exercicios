public class ContaBancaria {
	private int saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {
		this.cliente=cliente;
	}

	public void depositar(int valor) {

		if (valor > 0) {
			saldo = saldo+valor;
		}

	}

	public int sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			saldo = saldo - valor;

		}
		return saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}
}