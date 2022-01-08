
public class ContaBancaria {
	
	private int saldo =0;
	private Cliente cliente;
	private int id;
	private static int contador;
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		contador++;
		id = contador;
	}

	public int getSaldo() {
		
		return saldo;
	}

	public void depositar(int valorDeposito) {
		int novoValor = 0;
		if (valorDeposito > 0 ) {
			novoValor = novoValor + valorDeposito;
			this.saldo = novoValor + this.saldo;
			System.out.println("Saldo atualizado: "+this.saldo);
		}else
			System.out.println("N�o aceito valor negativo, por favor informe outro valor.");
		
	}

	public void sacar(int valorSaque) {
		if ((valorSaque <= this.saldo) && (valorSaque > 0)) {
			this.saldo = this.saldo - valorSaque;
			System.out.println("Novo saldo: "+this.saldo);
		}else
			System.out.println("Valor do saque maior que valor de saldo, informe outro valor.");
		
	}

	public Cliente getCliente() {
		
		return cliente;
	}

	public int getId() {
		
		return id;
	}

}
