
public class ContaBancaria {
	private Cliente cliente;
	private int saldo;
	private int	id;
	private static int contador;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = ++contador;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
	
	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		ContaBancaria.contador = contador;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int depositar(int valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		}
		return saldo;
	}

	public int sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		}
		return saldo;
	}

}
