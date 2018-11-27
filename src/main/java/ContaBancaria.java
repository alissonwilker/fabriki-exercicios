
public class ContaBancaria {
	
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
	 	
	 	this.cliente = cliente;
		contador++;
		id = contador;
	}

	public int getId() {
	
		return id;
		
	}

	
	
	
	
	public int depositar(int valor) {
		
	
		
		if(valor > 0) {
			this.saldo = valor + saldo;
		}
		
		return saldo;
		
	}



	public int sacar(int valor) {
		
		if(valor >= 0 && valor <= saldo) {
			this.saldo = saldo - valor;
		}else {
			this.saldo = saldo;
		}
		return saldo;
		
	}



	public int getSaldo() {
		
		return saldo;
	}



	public Cliente getCliente() {
		
		return cliente;
	}



	


	



	

}
