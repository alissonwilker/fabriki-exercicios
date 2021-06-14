public class ContaBancaria {

//Declaração de variáveis
	
	private int saldo; 
	
	private Cliente cliente; 
	
	private int id;
	
	private int contador;
	
//Getters & Setters

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
//Constructor	

	public ContaBancaria(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.id = this.contador++;
	}

//Outros Métodos
	
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
