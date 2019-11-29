public class ContaBancaria {

	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		id=++ contador;
	}

	public Object getSaldo() {

		return saldo;
	}

	public void depositar(int valorDeposito) {
		if(valorDeposito < 0) {
			System.out.println("Operação indisponivel");

		}
		else {
		 saldo += valorDeposito;
		 }
	}


	public void sacar(int valorSaque) {
		if(valorSaque > saldo) {
			System.out.println("Saldo indisponivel");
		}
		else {
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
