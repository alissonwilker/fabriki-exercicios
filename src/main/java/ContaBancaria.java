public class ContaBancaria {

	private static int contador = 0;
	private int id;
	private int saldo;
	private Cliente cliente;

	public ContaBancaria(Cliente cliente) {
		this.id = contador++;
		this.cliente = cliente;
	}
