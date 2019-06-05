public class ContaBancaria {

	private static int contador;
	private int id, saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {

		this.cliente = cliente;
		contador++;
		id = contador;

	}

	public int getSaldo() {

		return saldo;

	}

	public int depositar(int valorDeposito) {

		if (valorDeposito > 0)
			saldo += valorDeposito;

		return saldo;

	}

	public int sacar(int valorSaque) {

		if (valorSaque > 0 && valorSaque <= getSaldo())
			saldo -= valorSaque;

		return saldo;

	}

	public Cliente getCliente() {

		return cliente;

	}

	public int getId() {

		return id;

	}
}
