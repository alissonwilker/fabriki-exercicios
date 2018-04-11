public class ContaBancaria {
	
	private Cliente cliente;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
	}

	public Object getSaldo() {
		
		return saldo;
	}

	public void depositar(int valor) {
		if (valor > 0){
			this.saldo = saldo + valor;
		}
		
		
		
		
	}

	public int sacar(int valor) {
		
		if (valor <= saldo && valor > 0){
			this.saldo = saldo - valor;
		}
		return saldo;
		
	}

	public Object getCliente() {
		
	
		return cliente;
	}

}
