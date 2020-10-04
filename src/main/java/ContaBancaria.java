
public class ContaBancaria {
	
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = ++contador;
	}

	public int getSaldo() {
		return saldo;
	}

	public int depositar(int valor) {
		if (valor > 0) {
			this.saldo += valor; // this.saldo = this.saldo + valor;
		}
		return saldo;
	}

	public int sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			this.saldo -= valor; // this.saldo = this.saldo - valor;
		}
		return valor;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public int getId() {
		return id;
	}

}
