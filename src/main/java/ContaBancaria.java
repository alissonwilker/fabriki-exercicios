public class ContaBancaria {
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = ContaBancaria.contador++;
	}

	public Object getSaldo() {
		return this.saldo ;
	}

	public int depositar(int valorDeposito) {
		if(valorDeposito>0) {
		saldo = saldo + valorDeposito;
			}return 0;
		}

	public int sacar(int valorSaque) {
		if(valorSaque < saldo) {
			saldo = saldo - valorSaque;
		} return this.saldo;
		
	}

	public Object getCliente() {
		return this.cliente;
	}

	public int getId() {
		return this.id;
	}

}
