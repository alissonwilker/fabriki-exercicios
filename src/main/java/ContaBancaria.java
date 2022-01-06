public class ContaBancaria {
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;
	
	public ContaBancaria(int saldo, Cliente cliente, int id, int contador) {
		super();
		this.saldo = saldo;
		this.cliente = cliente;
		this.id = id;
		this.contador = contador;
	}
	
	public ContaBancaria(Cliente pessoaFisica) {
		this.cliente = pessoaFisica;
		id = contador++;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public int depositar(int valorDeposito) {
		if (valorDeposito > 0) {
			saldo =+ valorDeposito;
		}
		return saldo;
	}
	
	public int sacar(int valorSaque) {
		if (valorSaque <= saldo) {
			saldo =- valorSaque;
		}
		return saldo;
	}

	public int getId() {
		return id;
	}
}
