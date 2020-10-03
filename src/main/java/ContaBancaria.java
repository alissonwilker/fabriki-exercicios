
public class ContaBancaria {

	//atributos
	 private int saldo, id;
	 private static int contador;
	private Cliente cliente;
	
	protected ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		contador++;
		this.cliente=cliente;
		id=contador;
	}

	public Object getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		if(valorDeposito>=0) {
		saldo += valorDeposito;
		}
	}

	public void sacar(int valorSaque) {
		// TODO Auto-generated method stub
		if(valorSaque<=saldo) {
			saldo -= valorSaque;
		}
		else {
			System.out.println("Saque não autorizado");
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

}
