
public class ContaBancaria {
	
	private Cliente cliente;
	private int saldo;
	private int id;
	
	private static int contador;
	
		
	public ContaBancaria(Cliente cliente) {
		this.cliente=cliente;
		id=contador++;
		
	}
	
	public static int getContador() {
		return contador;
	}

	public Object getSaldo() {
		return saldo;
	}

	public int depositar(int valorDeposito) {
		if (valorDeposito>=0) {
			return (saldo= saldo+valorDeposito);
			}
		else {
			return (saldo);}			
	}

	public int sacar(int valorSaque) {
		if ((valorSaque>=0) && (saldo>=valorSaque)){
			return (saldo= saldo-valorSaque);
			}
		else {
			return (saldo);}			
	}
		
	

	public int getId() {
		
		return id;
	}

	public Cliente getCliente(Cliente cliente) {

		return cliente;
	}
	 	
	}
