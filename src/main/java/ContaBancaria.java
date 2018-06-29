public class ContaBancaria {
	
	private Cliente cliente;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		// TODO Auto-generated constructor stub
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void depositar(int valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		} else {
			System.out.println("Valor invÃ¡lido para operaÃ§Ã£o.");
		}
		// TODO Auto-generated method stub
		
	}

	public int sacar(int valor) {
		if ((saldo > 0) && (valor > 0) && (valor <= saldo)) {
			saldo = saldo - valor;
		} else {
			System.out.println("Valor invÃ¡lido para operaÃ§Ã£o.");
		}
		return saldo;
		// TODO Auto-generated method stub
		
	}

	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

}
