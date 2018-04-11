
public class ContaBancaria {

	private int saldo;

	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {

		this.cliente = cliente;
	}

	public Cliente getCliente() {

		return cliente;
	}

	public int getSaldo() {

		return saldo;
	}

	public void depositar(int valorDeposito) {
		if (valorDeposito > 0) {
			saldo += valorDeposito;
		}

	}

	public int sacar(int valorSaque) {

		if (valorSaque <= getSaldo() &&valorSaque>0 ) {
			this.saldo -= valorSaque;

		}
		return this.saldo;

	}

} 