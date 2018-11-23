public class ContaBancaria {

	private int saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente){
	this.cliente=cliente;	
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public int getSaldo() {
		return saldo;
	}

	public void depositar(int valor) {
		if(valor>0){
			saldo=valor+saldo;
		}
	}

	public int sacar(int valor) {
		if (valor>0&&valor<=saldo) {
			saldo=saldo-valor;
		}
			
		return saldo;
		
	}
	
}
