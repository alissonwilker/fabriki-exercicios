import javax.swing.JOptionPane;

public class ContaBancaria extends Object {
    //Declaração das variavéis
    private int saldo;
    private int id;
    private static int contador;
    private Cliente cliente;

    //Método construtor
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //Método Getter
    public int getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public int depositar(int valor){
        if(valor>0){
            //saída de dados
            saldo += valor;
            return saldo;
        }else{
            //saída de dados
            JOptionPane.showMessageDialog(null, "Impossível realizar a operação de depósito.");
        }
        return saldo;
    }
    
    public int sacar(int valor){
        if(valor>0 && valor<=saldo){
            //saída de dados
            saldo -= valor;
            return saldo;
        }else{
            //saída de dados
            JOptionPane.showMessageDialog(null, "Impossível realizar a operação de saque.");
        }
        return saldo;
    }
}
