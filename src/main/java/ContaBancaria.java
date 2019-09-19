
public class ContaBancaria {
	
	private Cliente	cliente;
	private static int contador = 1;
	private int	id;
	private int	saldo;
	
	
	public ContaBancaria(Cliente cliente) {
		this.id = contador;
		this.cliente = cliente;
		contador++;
	}

	public void depositar(int valorDeposito) {
		if (valorDeposito > 0 ) { 
			this.saldo = this.saldo + valorDeposito;
		}
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public int getId() {
		return id;
	}
	
	public Object getSaldo() {
		return this.saldo;
	}
	
	public void sacar(int valorSaque) {
		if (valorSaque <= this.saldo ) {
			this.saldo = this.saldo - valorSaque;
		}
	}

}
