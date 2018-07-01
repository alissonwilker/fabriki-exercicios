

public class ContaBancaria {
	
	private int id;
	private int saldo;
	private Cliente cliente;
	
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getSaldo() {
		return saldo;
	}

	public void depositar(int valor) {
		if (valor > 0) {
			saldo = valor + saldo;
		}
	}
	/**
	 * Saca um valor da conta bancária
	 * @param valor referente ao saque
	 * @return saldo após o saque
	 */
	public int sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			saldo = saldo - valor;
		}

		return saldo;

	}

}
