public class ContaBancaria {
	private int saldo;
	private int id;
	private Cliente cliente;
	private int contador;

	public ContaBancaria(Cliente cliente, int contador) {
		contador++;
		id = contador;
		this.cliente = cliente;
	}	

	public int getSaldo() {
		return saldo;
	}

	public int depositar(int valorDeposito) {
		if (valorDeposito > 0) {
			saldo += valorDeposito;
		}
		return saldo;
	}

	public void sacar(int valorSaque) {
		if (saldo >= valorSaque) {
			saldo = saldo - valorSaque;
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}

}
