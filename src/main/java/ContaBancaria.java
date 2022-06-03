public class ContaBancaria {
	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;
	

	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.id=ContaBancaria.contador++;
		this.cliente = cliente;
	}

	public Object getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		
	}

	public void sacar(int valorSaque) {
		// TODO Auto-generated method stub
		
	}

	public Object getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
