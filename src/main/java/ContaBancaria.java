public class ContaBancaria {
	private int saldo=0;
	private Cliente cliente;
	
	
	public ContaBancaria(Cliente cliente){
		 this.cliente=cliente;
		 
	 }
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public int getSaldo(){
		return saldo;
	}
	
	public void depositar(int valor){
		if(valor>0){
		this.saldo+=valor;
		}
	}
	public int sacar(int saque){
		if(saque<=saldo){
		this.saldo-=saque;
		}
		return saldo;
	}
} 
