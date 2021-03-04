
public class ContaBancaria extends java.lang.Object {
	private static int contador;
	private int id;
	private int saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {

		super();
		id= ++contador;
		this.cliente = cliente;

	}

	public int getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getSaldo() {
		return saldo;
	}

	public boolean depositar(int valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}

	public boolean sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

}
