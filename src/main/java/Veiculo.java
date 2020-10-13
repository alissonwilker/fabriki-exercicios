public abstract class Veiculo {
    protected int velocidade;
    protected int qtdePneus;

    public int getVelocidade() {
        return velocidade;
    }

    public int getQtdePneus() {
        return qtdePneus;
    }
    
    public void aumentarVelocidade(){
    
    }
    public void frear(){
    
    }
    public void parar(){
        
    }
    public void moverParaFrente(){
    
    } 
    protected void mover(){
    
    }
    protected void vestaEmMovimento(){
    
    }

    boolean estaEmMovimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
