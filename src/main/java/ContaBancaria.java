
public class ContaBancaria {
	private Cliente cliente;
	private int saldo;
	private int id;
	private static int contador;
	

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		contador ++;
		this.id = contador;
		
		
	}

	public int getSaldo() {
		return saldo;
	
	}

	public void depositar(int valorDeposito) {
		if(valorDeposito > 0) {
			System.out.println("foi depositado o valor: " + valorDeposito);
			saldo = saldo + valorDeposito;
			System.out.println("Saldo da conta: " + saldo);
			
		}
		
	}

	public void sacar(int valorSaque) {
		if(valorSaque > 0 && valorSaque <= saldo){
			saldo = saldo - valorSaque;
			System.out.println(" O valor do saque foi: " + valorSaque);
		}
		
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
	
		return id;
	}
	
	public static int  getContador() {
		return contador = contador++;
	}
	
	public static void setContador(int contador) {
		ContaBancaria.contador = contador;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}
	
	public void setId (int id) {
		this.id = id;
		
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
		
		
	}
}
