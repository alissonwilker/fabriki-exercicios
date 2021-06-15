
public class ContaBancaria {

	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = this.contador++;
	}

	public int getSaldo() {
		return this.saldo = saldo;

	}

	public int depositar(int valorDeposito) {
		if (valorDeposito > 0) {
			this.saldo += valorDeposito;
			return this.saldo;
		}
		return 0;
	}

	public int sacar(int valorSaque) {
		if ((valorSaque > 0) && (valorSaque <= getSaldo())) {
			this.saldo -= valorSaque;
			return this.saldo;
		}
		return 0;
	}

	public int getId() {
		return this.id;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

}
