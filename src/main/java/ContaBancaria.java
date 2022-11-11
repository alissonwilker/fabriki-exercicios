public class ContaBancaria {
	
	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void depositar(int valor) {
		if (valor > 0) {
			valor += saldo;
		}
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}

	public int getSaldo() {
		return saldo;
	}

	public void sacar(int valor) {
		if(valor > 0 && valor <= saldo) {
			valor -= saldo;
		}
	}
}
