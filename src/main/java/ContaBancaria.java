
public class ContaBancaria {
	private Cliente cliente;
	private int Saldo;



	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void depositar(int valorDepositor) {
		if(valorDepositor > 0) {
			this.Saldo += valorDepositor;
		}
	}

	public int sacar(int valorSaque){
		if(valorSaque > 0 && valorSaque <=Saldo){
			this.Saldo -= valorSaque;

		}
		return Saldo;
	  	}
	public int getSaldo() {
		// TODO Auto-generated method stub
		return Saldo;
	}



}
