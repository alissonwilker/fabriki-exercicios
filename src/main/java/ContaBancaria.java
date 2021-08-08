
public class ContaBancaria {
    private int saldo;
    private Cliente cliente;
    private int id;
    private static int contador;
	
	public ContaBancaria(Cliente cliente) {
		 id = ContaBancaria.contador++;
	     this.cliente = cliente;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public Object getCliente() {
		return cliente;
	}
	

	public Object getSaldo() {
		return saldo;
	}

	public int depositar(int valorDeposito) {
		if (valorDeposito > 0) {
            this.saldo = this.saldo + valorDeposito;
            return this.saldo;
        } else {
            return this.saldo;
        }
	}

	public int sacar(int valorSaque) {
		if (this.saldo >= valorSaque) {
            this.saldo = this.saldo - valorSaque;
            return this.saldo;
        } else {
            return this.saldo;
        }
	}

}
