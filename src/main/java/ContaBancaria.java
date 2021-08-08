public class ContaBancaria {

//Declaração de variáveis
	
	private static int saldo = 0; 
	
	private Cliente cliente; 
	
	private int id;
	
	private static int contador;
	
//Getters
	public int getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}

//Constructor	

	public ContaBancaria(Cliente cliente) {
		super();
		contador++;
		this.cliente = cliente;
		this.id = contador;
	}

//Outros Métodos
	
	public int depositar(int valorDeposito) {
		if (valorDeposito > 0) {
		saldo += valorDeposito;
		}
		return valorDeposito;

	}

	public int sacar(int valorSaque) {
		if(valorSaque <= saldo){
		saldo -= valorSaque; 
		return valorSaque;
		}else
		return 0;
	} 
	
}
