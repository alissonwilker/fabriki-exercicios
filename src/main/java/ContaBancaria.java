public class ContaBancaria {

	private int saldo;
	private int id;
	private static int contador;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {

		this.cliente = cliente;
		this.id = ++contador;
	}

	public int getSaldo() {

		return saldo;
	}

	public int depositar(int valorDeposito) {


		if (valorDeposito > 0) {
			this.saldo += valorDeposito;
		}
		return saldo;
	}

	public int sacar(int valorSaque) {


		if (valorSaque > 0 && valorSaque < saldo) {
			this.saldo -= valorSaque;
		}
		return saldo;
	}

	public Cliente getCliente() {

		return cliente;
	}

	public int getId() {

		return id;
	}

}
