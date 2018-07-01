public class ContaBancaria {
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;
	
	public ContaBancaria (Cliente cliente){
		this.cliente = cliente;
		id = ++contador;
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
	
	public int getId() {		
		return this.id;
	}
}
