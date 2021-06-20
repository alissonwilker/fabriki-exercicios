public class ContaBancaria {

	private int saldo=0;
	private Cliente cliente;
	private int id;
	private static int contador;
	
	public ContaBancaria(Cliente cliente) {
		this.cliente=cliente;
		ContaBancaria.contador++;
		this.id = contador;
	}

	public int getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}
	
	public void depositar(int valor) {
		if(valor>=0) {
			this.saldo+=valor;	
		}
	}
	
	public int sacar(int valor) {
		if(valor>=0 && valor<=this.saldo) {
			this.saldo-=valor;
			return valor;	
		}
		return 0;
	}
	
}
