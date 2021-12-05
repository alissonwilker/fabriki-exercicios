public class ContaBancaria {

	private int saldo;

	public ContaBancaria(Cliente pessoaFisica) {
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub

	}

	public Object getCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
