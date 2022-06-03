public class ContaBancaria {
	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;
	

	public ContaBancaria(Cliente cliente) {
		id = ContaBancaria.contador++;
		this.cliente = cliente;
	}

	public void depositar(int valorDeposito) {
		
	}

	public Object getSaldo() {
		return null;
	}

	public void sacar(int valorSaque) {
		
	}

	public Object getCliente() {
		return null;
	}

	public int getId() {
		return 0;
	}

}
