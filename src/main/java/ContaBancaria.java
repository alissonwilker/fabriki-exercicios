
public class ContaBancaria {

	private int saldo;
	private int id;
	private Cliente cliente;
	private static int contador;
	
	
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		contador ++;
		this.id = contador;
	}

	public int getSaldo() {
		return saldo;
	}

	public int depositar(int valor) {
		if(valor > 0) {
			saldo += valor;
		}
		return saldo;
		
	}

	public int sacar(int valor) {
		if(valor > 0 && valor <= saldo ) {
			saldo -= valor;
		}
		return saldo;
		
	}

	public Cliente getCliente() {
		return cliente;
	
	}

	public int getId() {
		return id;
	
	}
	

}
