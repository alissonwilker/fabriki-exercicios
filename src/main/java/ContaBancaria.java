
public class ContaBancaria {
	
	private static int contador;
	private int id;
	private int saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {
		contador++;
		id = contador;
		this.cliente = cliente;
	}

	public int getSaldo() {
		return saldo;
	}

	public int depositar(int valorDeposito) {
		if (valorDeposito <= 0) return saldo;
		saldo += valorDeposito;
		return saldo;
	}

	public int sacar(int valorSaque) {
		if (valorSaque > saldo) return 0;
		saldo -= valorSaque;
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}

}
