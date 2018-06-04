public class ContaBancaria {
	
	private Cliente cliente;
	private int saldo;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
	}

	public void depositar(int valorDeposito) {
		if(valorDeposito > 0){
			this.saldo += valorDeposito;
		}
	}

	public int sacar(int valorSaque) {
		if(valorSaque > 0 && valorSaque <= saldo){
			this.saldo -= valorSaque;	
		}
		return valorSaque;
		
	}

	public int getSaldo() {
		return this.saldo;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}	

}
