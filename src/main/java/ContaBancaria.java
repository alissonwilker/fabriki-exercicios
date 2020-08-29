public class ContaBancaria {
	private Cliente cliente;
	private int id;
	private static int contador;
	private int saldo;	
	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
		contador++;
		id = contador;
	}
	public Object getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	public int depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		if (valorDeposito > 0) {
			saldo += valorDeposito;
		}
		return saldo;
	}
	public int sacar(int valorSaque) {
		// TODO Auto-generated method stub
		if (valorSaque > 0 && valorSaque <= saldo) {
			saldo -= valorSaque;
		}
		return saldo;
	}
	public Object getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
}
