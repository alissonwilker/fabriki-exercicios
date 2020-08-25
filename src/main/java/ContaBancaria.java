package projetolp2;


public class ContaBancaria {
private Cliente cliente;
private static int contador;
private int id;
private int saldo;


public ContaBancaria(Cliente cliente) {
	this.cliente = cliente;
	contador = contador +1;
	
}

public int depositar(int valor) {
	if(valor>0) {
		saldo= saldo+valor;
	}
	return this.saldo;
	
}

public int sacar(int valor) {
	if(valor> 0)
		if(valor<= saldo) {
			saldo = saldo - valor;
		}
	return this.saldo;
}

public Cliente getCliente() {
	return cliente;
}

public int getId() {
	return id;
}

public Cliente getSaldo() {
	// TODO Auto-generated method stub
	return null;
}
}
