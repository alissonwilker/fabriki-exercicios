
public class ContaBancaria {
	
	//Atributos
	int saldo;
	Cliente cliente;
	int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
		contador ++;
		id = contador;
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		if (valorDeposito > 0) {
			saldo += valorDeposito;
		}
			
	}

	public void sacar(int valorSaque) {
		// TODO Auto-generated method stub
		if(valorSaque <= saldo) {
			saldo -= valorSaque;
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
