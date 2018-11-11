class Veiculo {
    protected int qtdePneus;
    protected int velocidade;
    private boolean ligar;
    
    
    
    public int getQtdePneus(){
        return qtdePneus;
    }
    
    protected boolean estaEmMovimento(){
        if(velocidade>0 && getVelocidade()>0){
            return true;
        }
            return false;
        
    }
    
    public void aumentarVelocidade(){
        if (estaEmMovimento() == true) {
            velocidade++;
        }
        
    }
    
    public int getVelocidade(){
         return velocidade;
    }
    
    
    public void frear(){
        if (velocidade>0) {
             --velocidade;
             
        }
       
    }
    
    public void moverParaFrente(){
        if(estaEmMovimento() == false){
            ++velocidade;
            
           
        }
    }
    
    protected void mover(){
       
    }
    
    public void parar(){
       velocidade = 0;
    }
    
    
    
    
}
