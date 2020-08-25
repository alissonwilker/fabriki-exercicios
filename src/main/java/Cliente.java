/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elizeu Neto
 */
class Cliente {
    //Declaração das variavéis
    private String nome;
    
    //Método Construtor
    protected Cliente(String nome) {
        this.nome = nome;
    }

    //Métodos Get e Set
    public String getNome() {
        return nome;
    }   
}
