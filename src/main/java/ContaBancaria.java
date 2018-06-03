public class ContaBancaria {
	private Cliente cliente;
	private int saldo;
	
	public ContaBancaria (Cliente cliente){
		this.cliente = cliente;
	}
	
	public void depositar (int valor){
		if (valor > 0){
			this.saldo += valor;			
		}
		
	}

	public Cliente getCliente(){
		return cliente;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public int sacar (int valor){
		if (valor > 0 && valor <= this.saldo){
			this.saldo -= valor;
		}
		return this.saldo;
	}
}
