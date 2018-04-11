
public class ContaBancaria {
	
	private Cliente cliente;
	
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		// TODO Auto-generated constructor stub
	}

	public void depositar(int valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
		// TODO Auto-generated method stub
		
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public int sacar(int valor) {
		if (valor <= saldo && valor > 0) {
			this.saldo -= valor;
		}
		// TODO Auto-generated method stub
		return saldo;
	}

	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

}
