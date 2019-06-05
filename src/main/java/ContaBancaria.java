
import java.util.Scanner;

public class ContaBancaria extends Object {

	private static Scanner entrada = new Scanner(System.in);

	private Cliente cliente;
	private static int contador = 0;
	private int id;
	private int saldo;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		this.id = this.contador++;
	}

	public int depositar(int valor) {
		if (valor > 0) {
			saldo += valor; 
		}
		return saldo;
	}

	public int sacar(int valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		}
		return saldo;
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

}
