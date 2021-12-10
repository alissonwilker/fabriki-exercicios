public class ContaBancaria extends java.lang.Object{
	private static int contador;
	private int id;
	private int saldo;
	private Cliente cliente;
 
	public ContaBancaria(Cliente cliente) {
		id = ContaBancaria.contador++;
		this.cliente = cliente;
		// TODO Auto-generated constructor stub
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public int depositar(int valorDeposito) {
		if(valorDeposito > 0) {
			this.saldo = this.saldo + valorDeposito;
			return this.saldo;
		}else {
			return this.saldo;
		}
		// TODO Auto-generated method stub
		
	}

	public int sacar(int valorSaque) {
		if (this.saldo >= valorSaque) {
			this.saldo = this.saldo - valorSaque;
			return this.saldo;
		}else {
			return this.saldo;
		}
	}

	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public String toStrin() {
		return cliente.getNome();
	}

}
