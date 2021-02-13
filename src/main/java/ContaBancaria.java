
public class ContaBancaria {
	private int saldo;
	private int id;
	private static int contador;
	private Cliente cliente;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		contador++;
		id=contador;
		
	}
	

	public int getSaldo() {
		return saldo;
	}

	public void depositar(int valorDeposito) {
		if(valorDeposito>=0) {
			saldo += valorDeposito;
		}
	}

	public void sacar(int valorSaque) {
		if(saldo>=valorSaque) {
			saldo -= valorSaque;
		}
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		
		return id;
	}

}
