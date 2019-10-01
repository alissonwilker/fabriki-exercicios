public class ContaBancaria {
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
		this.saldo = 0;
		ContaBancaria.contador++;
		this.id = ContaBancaria.contador;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public int getId() {
		return this.id;
	}

	public void depositar(int valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public void sacar(int valor) {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
		}
	}

}
