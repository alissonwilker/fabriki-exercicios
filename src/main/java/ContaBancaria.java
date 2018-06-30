public class ContaBancaria{
	private Cliente cliente;
	private int saldo;
	
	public ContaBancaria(Cliente cliente){
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void depositar(int valor){
		if(valor > 0){
			saldo += valor;
		}
	}
	
	public int sacar(int valor){
		if(valor > 0 && valor <= saldo){
			saldo -= valor;
		}
		return valor;
	}
}