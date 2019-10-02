public class ContaBancaria {
private int saldo;
private Cliente cliente;
private int id;
private static int contador;



public ContaBancaria(Cliente cliente) {
// TODO Auto-generated constructor stub
contador++;
id=contador;
this.cliente=cliente;
}

public Object getSaldo() {

return saldo;
}

public void depositar(int valorDeposito) {
if(valorDeposito>0) {
saldo += valorDeposito;
}
else {
System.out.println("Valor indispoível");
}


}

public void sacar(int valorSaque) {
if (valorSaque>saldo) {
System.out.println("Saldo indisponivel");
}
else {
saldo -= valorSaque;

}


}

public Object getCliente() {

return cliente;

}

public int getId() {

return id;
}

}
