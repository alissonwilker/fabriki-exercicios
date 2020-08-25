
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elizeu Neto
 */
public class ContaBancaria extends Object {
    //Declaração das variavéis
    private int saldo;
    private int id;
    private static int contador = 0;
    private Cliente cliente;

    //Método construtor
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.contador++;
        this.id = this.contador;
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
    
    public int depositar(int valorDeposito){
        if(valorDeposito>0){
            //saída de dados
            this.saldo += valorDeposito;
            return this.saldo;
        }else{
            //saída de dados
            
        }
        return this.saldo;
    }
    
    public int sacar(int valorSaque){
        if(valorSaque>0 && valorSaque<=this.saldo){
            //saída de dados
            this.saldo -= valorSaque;
            return this.saldo;
        }else{
            //saída de dados
            
        }
        return this.saldo;
    }
}
