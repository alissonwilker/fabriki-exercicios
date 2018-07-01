public class ContaBancaria {

	public ContaBancaria(Cliente cliente) {
		super();
		id = contador++;
	}
	
	private Cliente cliente;

	private static int contador;

	private int id;
	
	private int saldo;
	
	public int getSaldo() {
		return saldo;
	}

	public int depositar(int valor) {
		return saldo + valor;
	}

	public int sacar(int valor) {
		return saldo - valor;
	}

	public Object getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}
	
}