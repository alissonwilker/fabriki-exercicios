public abstract class Veiculo
        extends java.lang.Object {

    protected int velocidade;
    protected int qtdePneus;

    int getVelocidade() {
        return velocidade;
    }
    
    int getQtdePneus() {
        return qtdePneus;
    }
    
    void aumentarVelocidade() {
        System.out.println("Aumenta a velocidade do veiculo, caso esteja em movimento.");
    }
    
    void moverParaFrente() {
        System.out.println("Movimenta o veiculo para frente, caso esteja parado.");
    }

    void frear() {
        System.out.println("Diminui a velocidade do veiculo, caso esteja em movimento.");
    }

    void parar() {
        System.out.println("Para o movimento do veiculo, freando o veiculo ate que a velocidade seja zero.");
    }

    protected void mover() {
        System.out.println("Coloca o veiculo em movimento, caso esteja parado.");
    }
    protected boolean estaEmMovimento() {
        return false;
    }

}
