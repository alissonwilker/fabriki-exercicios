public class ContaBancaria{
	 
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador; 

	public ContaBancaria(Cliente cliente)
	{
		this.cliente = cliente;
		this.id =  this.contador++;
	}

	public int getSaldo()
	{
		return this.saldo;
	}

	public int depositar(int valorDeposito)
	{
		if(valorDeposito > 0) {
			this.saldo = valorDeposito;	
			return  this.saldo;
		}
		return 0 ;
	}

	public int sacar(int valorDoSaque) {
		if((valorDoSaque > 0) && (valorDoSaque <= getSaldo())) {
			this.saldo -= valorDoSaque;
			return  this.saldo;	
		}
		return 0;
		
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public int getId() {
		return this.id;
	}

}
