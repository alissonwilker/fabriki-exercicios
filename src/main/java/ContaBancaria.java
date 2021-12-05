public class ContaBancaria extends java.lang.Object{
	@SuppressWarnings("unused")
	private static int contador;
	private int id;
	private int saldo;
	private Cliente cliente;
 
	public ContaBancaria(Cliente pessoaFisica) {
		// TODO Auto-generated constructor stub
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public int depositar(int valorDeposito) {
		return valorDeposito;
		// TODO Auto-generated method stub
		
	}

	public int sacar(int valorSaque) {
		return valorSaque;
		
	}

	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
