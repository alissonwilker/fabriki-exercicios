public class ContaBancaria {
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;
	
	public ContaBancaria (Cliente cliente){
		this.cliente = cliente;
		this.id = contador++;		
	}
	
	public int getId() {
		return this.id;
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
	
	public int getSaldo(){
		return this.saldo;
	}
	
	public int depositar(int valor){
		if (valor > 0){
			saldo += valor;
		}
		return this.saldo;		
	}
	
	public int sacar(int valor){
		if (valor > 0 && valor <= this.saldo){
			saldo -= valor;
		}
		return this.saldo;
	}
}
