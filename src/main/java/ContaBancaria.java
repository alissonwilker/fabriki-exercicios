public class ContaBancaria {
	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;
	

	public ContaBancaria(Cliente cliente) {
		this.id = ContaBancaria.contador++;
		this.cliente = cliente;
	}

	public void depositar(int valorDeposito) {
		
	}

	public Object getSaldo() {
		return saldo;
	}

	public void sacar(int valorSaque) {
		
	}

	public Object getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}

}
