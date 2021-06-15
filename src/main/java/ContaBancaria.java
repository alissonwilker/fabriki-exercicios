public class ContaBancaria extends ContaBancariaTest {

	private Cliente cliente;
	private static int contador;
	private int id;
	private int saldo;
	
	public ContaBancaria(Cliente pessoaJuridica) {
	}

	public ContaBancaria(PessoaFisica pessoaFisica) {
	}

	public ContaBancaria() {
	}

	public Object getCliente() {
		return this.cliente;
	}
	public Object getSaldo() {
		return this.saldo;
	}

	public int depositar(int valorDeposito) {
		return (saldo + valorDeposito);
	}

	public int sacar(int valorSaque) {
		return(saldo - valorSaque);
	}

	public int getId() {
		return id;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		ContaBancaria.contador = contador;
	}

}
