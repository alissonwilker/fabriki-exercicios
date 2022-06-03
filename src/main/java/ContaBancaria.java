public class ContaBancaria {
	

	private int saldo;
        private Cliente cliente;
	private int id;
	private static int contador;
	
	
	public ContaBancaria(Cliente cliente) {
		
		id= ContaBancaria.contador++;
                this.cliente = cliente;
	}
	
	
	public int getSaldo() {
		
		return saldo;
	}
	public void depositar(int valorDeposito) {
		saldo = saldo+ valorDeposito;
		
	}
	public void sacar(int valorSaque) {
		if(saldo >= valorSaque) {
		saldo = saldo-valorSaque;
		}
	}
	public Cliente getCliente() {
	
		return Cliente;
	}
	public int getId() {
	
		return id;
	}
	

}
