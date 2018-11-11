class Automovel extends Veiculo{
    protected boolean marchaAFrente = true;
    private boolean ligado = true;
    


    public void moverAFrente(){
        if(getVelocidade()==0){
            ++velocidade;
            ligado = true;
            marchaAFrente = true;
            if(getVelocidade()==0){
                ++velocidade;
            }
            
        }
    }
    public void moverParaFrente(){
        if(estaEmMovimento() == false){
            ++velocidade;
            ligado =true;
            marchaAFrente = true;
            
           
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

   
    public void ligar(){
        if(!ligado){
            ligado = true;
            
        }
    }
    
    public void desligar(){
       if(ligado){
           parar();
           ligado=false;
         
       }
    }
    
    public boolean estaLigado(){
       if(ligado){
           return true;
       }else{
        return false;
       }
    }
    
    public boolean estaEmMarchaAFrente(){
     if(marchaAFrente){
         return true;
     }else{
        return false;
     }
     
    }
    
    protected void engatarMarchaAFrente(){
        if(marchaAFrente==true){
            if(velocidade>0){
               velocidade =0; 
            }
            
         marchaAFrente = true;
           
                
    }
    
    
    
    
    
    
    
    
    
    }
}
