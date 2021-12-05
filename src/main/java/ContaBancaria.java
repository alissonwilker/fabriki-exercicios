public class ContaBancaria extends java.lang.Object {
    //atributos
    private int ID;
    private Cliente cliente;
    private int saldo;
    private static int contador = 0;


    //métodos Personalisados
    public void depositar(int valorDeposito) {

        if(valorDeposito >= 0) {
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Déposito realizado na conta de: " + this.getCliente());
            System.out.println("Saldo da conta bancaria: " + this.getSaldo());
        }else {
            System.out.println("Deposito inválido!");
        }
    }

    public void sacar(int valorSaque) {
        
        if(this.getSaldo() >= valorSaque) {
            this.setSaldo(this.getSaldo() - valorSaque);
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo da conta bancaria: " + this.getSaldo());
        }else {
            System.out.println("Saldo inuficiente para saque: -R$" + (valorSaque - this.getSaldo()));
        }
    }


    //métodos especiais
    public ContaBancaria(Cliente cliente) {
        this.setCliente(cliente);
        
        contador++;
    }

    public int getID(){
        return this.ID;
    }
    public void setID(int ID){
        this.ID = contador;
    }
 
    public int getSaldo(){
        return this.saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
