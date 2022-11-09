public class ContaBancaria {
	private int saldo = 0;
	private Cliente cliente;
	private int id;
	private int contador = 0;
	
	public ContaBancaria(Cliente cliente) {
		this.setCliente(cliente);
		this.id = this.contador;
		this.contador += 1;
	}

	public int getSaldo() {
		return saldo;
	}

	public void depositar(int deposito) {
		if(deposito >= 0){
			this.saldo += deposito;
		}
	}
	
	public int sacar(int saldo) {
		if(saldo <= this.getSaldo()) {
			this.saldo -= saldo;
		}
		return this.getSaldo();
		
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

}
