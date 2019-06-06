/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aluno
 */
public class ContaBancaria {
    private Cliente cliente;
    private int Saldo;
    private int Id;
    private static int contador;

    public ContaBancaria(Cliente cliente) {
        this.cliente=cliente;
        this.Id = contador++;
        
    }

    public void depositar(int valor) {
        if (valor > 0) {
            Saldo = Saldo + valor;
        }
    }

    public int sacar(int valor) {
        if (valor > 0 && valor <= Saldo) {
            Saldo = Saldo - valor;

        }
        return Saldo;
    }
    public Cliente getCliente(){
        return cliente;
    }

    public int getSaldo(){
        return Saldo;
    }
    public int getId() {
    	return Id;
    }

} 
