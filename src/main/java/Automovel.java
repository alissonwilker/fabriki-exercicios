/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aluno
 */
public abstract class Automovel extends Veiculo  {
    protected boolean marchaAFrente;
    private boolean ligado;
    
    public void moverParaFrente(){
        if (estaLigado() == false) {
            ligar();
        }
        
        if (estaEmMarchaAFrente() == false) {
            engatarMarchaAFrente();
        }
        if (estaEmMovimento() == false) {
            mover();
                    
        }
            
        
        
    }
    
    public void ligar(){
        if(estaLigado() == false){
          ligado = true;  
        }
    }
    
    public void desligar(){
        if ( estaLigado() == true) {
           if(estaEmMovimento() == true) {
        	   parar();
           }
           ligado = false;
        }
    }
     
    public boolean estaLigado(){
        return ligado;
    }
    
    public boolean estaEmMarchaAFrente(){
       return marchaAFrente;
    }
    
    protected void engatarMarchaAFrente(){
          if ( estaEmMarchaAFrente() == false) {
            if (estaEmMovimento() == true) {
                 parar();
            }     
                marchaAFrente = true;       
        }
    } 
    
    
}
