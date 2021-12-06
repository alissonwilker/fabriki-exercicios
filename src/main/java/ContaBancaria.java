
public class ContaBancaria {
	
	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		contador = getContador() + 1; 
		id = contador;
		this.cliente = cliente;
	}

	public Object getSaldo() {
		return saldo;
	}

	public void depositar(int valorDeposito) {
		if (valorDeposito > 0) {
			saldo += valorDeposito;
		}
	}

	public void sacar(int valorSaque) {
		if (valorSaque > 0 && valorSaque <= saldo) {
			saldo -= valorSaque;
		}		
	}

	public Object getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}

	public static int getContador() {
		return contador;
	}

}
