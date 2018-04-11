
public class ContaBancaria {

	private int saldo;
	private Cliente cliente;
	
	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}
	
	public void depositar(int valor){
		if(valor>0){
			this.saldo=saldo+valor;
		}
	}
	
	public int sacar(int valor){
		if(valor<=saldo){
			this.saldo=saldo-valor;
		}
		return this.saldo;
	}
	
}
