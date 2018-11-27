public class ContaBancaria extends java.lang.Object {

	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		getCliente();
		id = contador;
		contador++;
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Object getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void depositar(int valorDeposito) {
		if (valorDeposito > 0) {
			saldo = saldo + valorDeposito;
		}
	}

	public void sacar(int valorSaque) {
		// TODO Auto-generated method stub
		if ((valorSaque > 0) && (valorSaque <= saldo)) {
			saldo = saldo - valorSaque;
		}
	}

	public static int getContador() {
		return contador;
	}

}
