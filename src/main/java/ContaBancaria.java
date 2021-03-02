
public class ContaBancaria {
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
		this.id = ++contador;
		this.cliente = cliente;
	}

	public int getSaldo() {		
		return this.saldo;
	}

	public int depositar(int valor) {
		if(valor > 0) {
			this.saldo = this.saldo + valor;
			return this.saldo;
		}
		
		return this.saldo;
				
	}

	public int sacar(int valor) {
		if(valor > 0 && valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			return this.saldo;
		}
		
		return this.saldo;
			
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public int getId() {
		return this.id;
	}

}
