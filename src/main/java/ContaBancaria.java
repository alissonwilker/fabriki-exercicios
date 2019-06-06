public class ContaBancaria {

	private int saldo, id;
	private static int contador;
	private Cliente cliente;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		contador++;
		id = contador;
	}

	public int getSaldo() {
		
		return saldo;
	}

	public int depositar(int valorDeposito) {
		if (valorDeposito > 0) {
			saldo = saldo + valorDeposito;
		}
			
		return saldo;
		
	}

	public int sacar(int valorSaque) {
		if (valorSaque > 0 && valorSaque <= saldo) {
			saldo = saldo - valorSaque;
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
