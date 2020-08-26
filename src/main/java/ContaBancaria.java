public class ContaBancaria {

	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;
	
	
	
	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		contador = contador +1;
		id = contador;
	}
	
    

	public int getSaldo() {
		
		return saldo;
	}

	public void depositar(int valorDeposito) {
		if(valorDeposito > 0) {
			System.out.println("Depositado valor: " + valorDeposito);
			saldo = saldo + valorDeposito;
			System.out.println("Saldo em conta: " + saldo);
		} else{
			System.out.println("Deposito um valor positivo por favor");
		}
		
	}

	public void sacar(int valorSaque) {
		if(valorSaque > 0 && valorSaque <= saldo) {
			saldo = saldo - valorSaque;
			System.out.println(" VALOR SACADO FOI: " + valorSaque);
		}
		
	}

	public Cliente getCliente() {
		
		return cliente;
	}

	public int getId() {
		
		return id;
	}

	public static int getContador() {
		return contador = contador++;
	}

	public static void setContador(int contador) {
		ContaBancaria.contador = contador;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setId(int id) {
		this.id = contador;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
