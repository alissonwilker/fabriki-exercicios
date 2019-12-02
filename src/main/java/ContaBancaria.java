public class ContaBancaria {

	private Cliente cliente;
	private static int contador = 1;
	private int id = 0;
	private int saldo = 0;
	
	
	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
		this.id = this.contador;
		contador++;
	}

	public Object getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		
		
		if(valorDeposito > 0) {
		this.saldo += valorDeposito;
		}
	}

	public void sacar(int valorSaque) {
		// TODO Auto-generated method stub
		
		
		if(valorSaque < saldo) {
		this.saldo -= valorSaque;
		}
	}

	public Object getCliente() {
		// TODO Auto-generated method stub
		return this.cliente;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
