public class ContaBancaria {
	private int saldo;
	private int id;
	private static int contador = 0;
	private Cliente cliente;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		contador ++;
		this.id = contador;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public static final int getContador() {
	    return contador;
	}

	public int depositar(int valorDeposito) {
		if(valorDeposito >= 0){
			saldo += valorDeposito; 
			return saldo;
		}else{
			return saldo;
		}
		
	}

	public int sacar(int valorSaque) {
		if(valorSaque >= 0 &&  valorSaque <= saldo){
			saldo -= valorSaque; 
			return saldo;
		}else{
			return saldo;
		}
		
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public int getId() {
		return id;
	}
}
