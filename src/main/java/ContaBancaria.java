public class ContaBancaria {
    private int saldo;
    private Cliente cliente;
    private int id ;
    private int contador;
    
    public ContaBancaria(Cliente cliente) {
    }
    public int getSaldo(){
        return saldo;
    }
    public int getId(){
        return id;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public int depositar(int valorDeposito) {
        if(valorDeposito>0)
           return saldo +=valorDeposito;
        return saldo;
        
    }
    
  
    public int sacar(int valor){
       if(valor<saldo && valor >0)
           return saldo -=valor;
       return saldo;
    }
}
        
