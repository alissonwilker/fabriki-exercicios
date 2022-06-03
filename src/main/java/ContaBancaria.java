
public class ContaBancaria extends Cliente {


	private Cliente	cliente;
	
	private static int contador;
	
	private int	id;
	
	private int	saldo;

	public ContaBancaria(Cliente pessoaJuridica) {
		super(pessoaJuridica);
		
		contador = contador ++;
		id = id++;	
	}

	public int depositar(int valorDeposito) {
		if (valorDeposito>0) {
			saldo = saldo+ valorDeposito;
		}
		return valorDeposito;
	}

	public Object getSaldo() {
		return this.saldo;
	}

	public int sacar(int valorSaque) {
		if(saldo>=valorSaque && valorSaque>0) {
			saldo = saldo - valorSaque;
		}
		return valorSaque;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public int getId() {
		return this.id;
	}
}
