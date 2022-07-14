public class ContaBancaria {
	private static int contador;
	private int id = contador;
	private int saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente pessoaFisica) {
		this.cliente = pessoaFisica;
		contador++;
	}

	public Object getSaldo() {
		return saldo;
	}

	public void depositar(int valorDeposito) {
		if (valorDeposito >= 0) {
			saldo += valorDeposito;
		}
	}

	public void sacar(int valorSaque) {
		if (valorSaque >= 0 && valorSaque <= saldo) {
			saldo -= valorSaque;
		}
	}

	public Object getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}
}
