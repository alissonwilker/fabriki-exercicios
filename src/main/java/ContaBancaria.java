
public class ContaBancaria {
	private int saldo = 0;
	private int id = 0;
	private static int contador = 0;
	private Cliente cliente;
	int deposito01 = 0;
	int saque01 = 0;
	
	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		contador++;
		id=contador;
		
		this.cliente = cliente;
	}
	public Object getSaldo() {
		// TODO Auto-generated method stub
		if(saldo > 0) {
		return saldo;
	}else {
		return saldo;
	}
		
	}

	public void depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		if(valorDeposito > 0) {
			
		deposito01 = saldo += valorDeposito;
		}else {
			saldo = saldo;
		}
	}

	public void sacar(int valorSaque) {
		// TODO Auto-generated method stub
		if(valorSaque < saldo) {
			saque01 = saldo -= valorSaque;
		}else {
			saldo = saldo;
		}
	}

	public Object getCliente() {
		return cliente;
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		// TODO Auto-generated method stub	
		return id;
	}

	
}
