
public class ContaBancaria {

	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = contador++;
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
		if (valorSaque > 0 && valorSaque <= saldo) {
			saldo -= valorSaque;
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
