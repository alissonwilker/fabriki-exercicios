
public class ContaBancaria  {
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;
	
	public ContaBancaria(Cliente cliente) {
	contador++;
	id=contador;
	};
	
	public int getId() {
		return id;
	};
	public Cliente getCliente() {
		return cliente;
	};
	public int getSaldo() {
		return saldo;
	};
	public int depositar(int valor) {
		if(valor>0) {
		saldo+=valor;
		}
		return saldo;
	};
	public int sacar(int valor) {
		if(valor>0 && saldo>valor) {
			saldo-=valor;
			
		}return saldo;
	}
;
}
