public class ContaBancaria {
	
	private Cliente cliente;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getSaldo() {
		return saldo;
	}

	public int sacar(int valorSaque) {
		if (valorSaque <= saldo && valorSaque > 0){
			this.saldo = saldo - valorSaque;
		}	
		return saldo;
	}
	
	public void depositar(int valorDeposito) {
		if (valorDeposito > 0){
			this.saldo = saldo + valorDeposito;
		}
	}

}