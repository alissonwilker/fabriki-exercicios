public class ContaBancaria {

	private static int contador = 0;
	private int id;
	private int saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {
		this.id = contador++;
		this.cliente = cliente;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public int depositar(int valorDeposito) {

		if (valorDeposito > 0) {
			saldo += valorDeposito;
		}
		return saldo;

	}

	public int getSaldo() {
		return saldo;
	}

	public int sacar(int valorSaque) {
		if (valorSaque <= saldo && valorSaque > 0) {
			saldo -= valorSaque;
		}
		return saldo;

	}

	public int getId() {	     
		return id;
	}

}
