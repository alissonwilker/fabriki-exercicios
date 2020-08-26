public class ContaBancaria {
	
	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;

	 
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		contador = contador+1;
		id = contador;
		// TODO Auto-generated constructor stub
	}


	public void depositar(int valor) {
		if(valor>0) {
			saldo = saldo + valor;
		}
		
	}

	public int sacar(int valor) {
		if(valor <=saldo) {
			saldo = saldo-valor;
		}
		return this.saldo;
   }
		
	
	public Object getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}
	
	public int getId() {
		
		return id;
		
	}
	public int getSaldo() {
		
		return saldo;
	}

}
