public class ContaBancaria {
	private Cliente cliente;
	private int saldo;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		// TODO Auto-generated constructor stub
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	public void depositar(int valorDeposito) {
		if (valorDeposito > 0) {
		this.saldo += valorDeposito;
		// TODO Auto-generated method stub
		}
	}

	public int sacar(int valorSaque) {
		if (valorSaque > 0 && valorSaque <= saldo) {
		this.saldo -= valorSaque; 
		// TODO Auto-generated method stub
		}
		return saldo;
	}

	public Cliente getCliente() {
		
		// TODO Auto-generated method stub
		return this.cliente;
	}

}
