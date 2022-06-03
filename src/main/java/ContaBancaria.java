public class ContaBancaria {
	private Cliente cliente;
	private static int contador = 0;
	private int id;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = this.contador++;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public int depositar(int valor) {
		if (valor >= 0) {
			this.saldo = getSaldo() + valor;
		}
		
		return this.saldo;
		
	}

	public int sacar(int valor) {
		if (valor >= 0 && valor <= getSaldo() ) {
			this.saldo = getSaldo() - valor;
		}
		
		return saldo;
		
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public int getId() {
		return this.id;
	}

}
