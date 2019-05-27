/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aluno
 */
public class Carro extends Automovel {
    public Carro(){
        super.qtdePneus = 4;
    }
    public void moverParaTras(){
        if (estaLigado() == false) {
            ligar();
        }if ( estaEmMarchaAFrente() == true) {
             engatarMarchaARe();
        }if (estaEmMovimento() == false) {
           mover();
        }
    }
    
    protected void  engatarMarchaARe(){
            if ( estaEmMarchaAFrente() == true) {
                if ( estaEmMovimento() == true) {
                   parar(); 
                }
                 marchaAFrente = false;
        }
    
    }
}
