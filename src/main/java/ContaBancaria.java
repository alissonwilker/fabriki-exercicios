public class ContaBancaria {

	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;


	public Cliente getCliente() {
		return cliente;
	}
	public int getSaldo() {
		return saldo;
	}

	public int getId() {
		return id;
	}

	public ContaBancaria(Cliente cliente) {
		super();
		this.cliente =cliente;	
		this.id = contador++;
	}
	
	public void depositar(int valorDeposito) {
		if (valorDeposito > 0) {
		saldo += valorDeposito;
		}
	}
	public void sacar(int valorSaque) {
		if(valorSaque <= saldo){
		saldo -= valorSaque; 
		}
	}
}
