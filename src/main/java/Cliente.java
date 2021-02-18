
	public Cliente getCliente() {
		return cliente;
	}

	public int depositar(int valorDeposito) {

		if (valorDeposito > 0) {
			saldo += valorDeposito;
		}
		return saldo;

	}

	public int getSaldo() {
		return saldo;
	}

	public int sacar(int valorSaque) {
		if (valorSaque <= saldo && valorSaque > 0) {
			saldo -= valorSaque;
		}
		return saldo;

	}

	public int getId() {	     
		return id;
	}

}


public abstract  class Cliente {
	
	private String nome;
	
	protected  Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}


}
