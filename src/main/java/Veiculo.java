
public class Veiculo {
    
    protected int qtdePneus;
    protected int velocidade;

    
    public void aumentarVelocidade() {
        // Aumenta a velocidade do veiculo, caso esteja em movimento.
        this.velocidade =+ 1;
    }
    
    public void frear() {
        // Diminui a velocidade do veiculo, caso esteja em movimento.
         this.velocidade =- 1;
    }
    
    public void parar() {
        // Para o movimento do veiculo, freando o veiculo ate que a velocidade seja zero.

        while (this.velocidade > 0) {
          this.velocidade =- 1;  
        }
        
    }
    
    public void moverParaFrente() {
        // Movimenta o veiculo para frente, caso esteja parado.
        if (this.velocidade == 0) {
           this.velocidade =+ 1;
        }
    }
    
    protected void mover() {
        // Coloca o veiculo em movimento, caso esteja parado.
        
        if (this.velocidade == 0) {
           this.velocidade =+ 1;
        }
    }
    
    protected boolean estaEmMovimento() {
        // Verifica se o veiculo esta em movimento.
        if ( this.velocidade > 0) {
            return true; 
        } else {
            return false;
        }
        
    }
    
}
