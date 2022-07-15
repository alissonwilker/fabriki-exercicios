

public class ContaBancaria {
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;
	public ContaBancaria(Cliente cliente) {
		super();
		ContaBancaria.contador++;
		this.saldo = 0;
		this.cliente = cliente;
		this.id = ContaBancaria.contador;
	}

	// public int getSaldo() {
	public int getSaldo() {
		return  saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		ContaBancaria.contador = contador;
	}

	public int depositar(int valorDeposito) {
		if(valorDeposito > 0) {
			this.saldo = this.saldo + valorDeposito;
		}


		return this.saldo;
	}

	public int sacar(int valorSaque) {
		if(this.saldo - valorSaque > 0) {
			this.saldo = this.saldo - valorSaque; 
		}

		return this.saldo;		
	}


}
