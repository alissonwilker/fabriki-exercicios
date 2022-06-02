public class ContaBancaria {
	

	private int saldo;
	private int id;
	private static int contador;
	private Cliente Cliente;
	
	public ContaBancaria(Cliente pessoaFisica) {
		
		contador++; 
	}
	
	
	
	public int getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	public void depositar(int valorDeposito) {
		saldo = saldo+ valorDeposito;
		
	}
	public void sacar(int valorSaque) {
		if(saldo >= valorSaque) {
		saldo = saldo- valorSaque;
		}
	}
	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return Cliente;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	

	

}
