
public class ContaBancaria {
	
	private static int contador;
	private int id;
	private int saldo;
	private Cliente cliente;
	
	public ContaBancaria(Cliente cliente) {
		contador ++;
		id=contador;
		this.cliente=cliente;
	}

	public Object getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public int depositar(int valorDeposito) {
		if (valorDeposito>0) {
			saldo=saldo+valorDeposito;}
		
		return saldo;
		// TODO Auto-generated method stub
		
	}

	public int sacar(int valorSaque) {

		if (valorSaque>0 && valorSaque<=saldo) {
			saldo=saldo-valorSaque;
		}
		return valorSaque;
		
	}

	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
