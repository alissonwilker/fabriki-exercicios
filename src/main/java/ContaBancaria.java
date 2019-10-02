public class ContaBancaria {

	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador = 1;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = contador;
		contador++;
	}

	public int getSaldo() {
		return saldo;
	}

	public int depositar(int valor) {
		if(valor > 0) {
			saldo = saldo + valor;
		}		
		return saldo;
	}

	public int sacar(int valor) {
		if(valor > 0 && valor <= saldo) {
			saldo = saldo - valor;
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
