public class ContaBancaria {
	private int saldo;
	private static int contador;
	private int id;
	private Cliente cliente;
	
	public ContaBancaria(Cliente cliente) {
		contador++;
		this.cliente = cliente;
		id = contador;
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
		if (valorSaque >0 && valorSaque <=saldo) {
			saldo-=valorSaque;
		}

	}

	public Cliente getCliente() {
		
		return cliente;
	}

	public int getId() {
		
		return id;
	}

}
