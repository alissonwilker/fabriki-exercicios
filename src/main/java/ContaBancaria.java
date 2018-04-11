public class ContaBancaria{
	
	private Cliente cliente;
	

	private int saldo;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
	}

	public void depositar(int valorDeposito) {
		if(valorDeposito > 0){
			saldo = valorDeposito + saldo;
		}
	}

	public int sacar(int valorSaque) {
		
		if(saldo >= valorSaque){
		saldo = saldo - valorSaque;
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
