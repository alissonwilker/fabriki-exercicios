public class ContaBancaria {
	
	private Cliente cliente;
	
	private static int contador;
	
	private int id;
	
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		
		this.cliente = cliente;
		
		contador++;
		
		this.id = contador;
			
	}

	public int getSaldo() {
		
		return saldo;
		
	}

	public int depositar(int valor) {
		
		if (valor > 0) {
			
			saldo = saldo + valor;
			
		}
		
		return saldo;
		
	}

	public int sacar(int valor) {
		
		if (valor > 0 && valor <= saldo) {
			
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
