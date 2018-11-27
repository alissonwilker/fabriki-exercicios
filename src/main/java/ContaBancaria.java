public class ContaBancaria extends Cliente {

	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente pessoaFisica) {
		// TODO Auto-generated constructor stub

	}

	public Object getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		if (valorDeposito > 0) {
			saldo = valorDeposito;
		}

		else {
			saldo = 0;
		}

	}

	public void sacar(int valorSaque) {
		// TODO Auto-generated method stub
		if ((valorSaque > 0) && (valorSaque < saldo || valorSaque == saldo)) {
			saldo -= valorSaque;
		}

		else {
			saldo = saldo;

		}

	}

	public Cliente getCliente() {
		return cliente;
		// TODO Auto-generated method stub

	}

	public int getId() {
		// TODO Auto-generated method stub
		return 1;
	}

}
