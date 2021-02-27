
public class ContaBancaria {
	private int saldo;
	private int id;
	private static int contador;
	private Cliente cliente;
	
	public ContaBancaria(Cliente cliente) {
		id=++contador;
		this.cliente = cliente;
	}
	

	public int getSaldo() {
		return saldo;
	}

	public int depositar(int valorDeposito) {

		if(valorDeposito>=0) {
			saldo += valorDeposito;
		}
		
		return saldo;
	}

	public int sacar(int valorSaque) {
		if(valorSaque > 0 && valorSaque <= saldo) {
			saldo -= valorSaque;
		}
		
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		
		return id;
	}

}
