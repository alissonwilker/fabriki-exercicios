/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public abstract class Cliente {
    private String Nome;
    
    protected Cliente(String Nome){
        this.Nome=Nome;
    }
    public String getNome(){
        return Nome;
        
    }
    
}
