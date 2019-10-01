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

	public int depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		
		if(valorDeposito > 0) {
		this.saldo += valorDeposito;
		}
		return saldo;
	}

	public int sacar(int valorSaque) {
		// TODO Auto-generated method stub
		
		
		if(valorSaque > 0 && valorSaque < saldo) {
		this.saldo -= valorSaque;
		return saldo;
		}
		return saldo;
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
