public class ContaBancaria {

	private int saldo;
	private int id;
	private static int contador;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
		this.id = ++contador;
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public int depositar(int valorDeposito) {
		// TODO Auto-generated method stub

		if (valorDeposito > 0) {
			this.saldo += valorDeposito;
		}
		return saldo;
	}

	public int sacar(int valorSaque) {
		// TODO Auto-generated method stub

		if (valorSaque > 0 && valorSaque < saldo) {
			this.saldo -= valorSaque;
		}
		return saldo;
	}

	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
