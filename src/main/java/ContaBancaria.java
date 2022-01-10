
public class ContaBancaria extends Cliente {

	int id;
	float saldo;
	Cliente cliente;

	ContaBancaria(Cliente cliente) {

	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void depositar(int valorDeposito) {
		saldo = this.saldo + valorDeposito;
	}

	public void sacar(int valorSaque) {
		saldo = this.saldo + valorSaque;
	}
}
