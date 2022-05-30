package classes;

public class ContaBancaria {

	private int saldo = 0;
	private Cliente cliente;
	private static int contador;
	private int id = contador;
	
	public ContaBancaria(Cliente pessoaFisica) {
		this.cliente = pessoaFisica;
		ContaBancaria.contador++;
	}

	public Object getSaldo() {
		return this.saldo;
	}

	public int depositar(int valorDeposito) {
		if(valorDeposito < 0) {
			return 0;
		}
		
		this.saldo += valorDeposito;
		return this.saldo;
	}

	public int sacar(int valorSaque) {
		if(valorSaque < 0) {
			return 0;
		}
		if((this.saldo - valorSaque) < 0) {
			return 0;
		}
		
		this.saldo -= valorSaque;
		return this.saldo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public int getId() {
		return this.id;
	}

}
