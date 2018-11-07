/**
 * Tipo que representa um Veiculo.
 *
 */
public abstract class Veiculo {
    /**
     * Representa a velocidade atual do veiculo.
     */
    protected int velocidade;

    /**
     * Representa a quantidade de pneus do veiculo.
     */
    protected int qtdePneus;

    /**
     * Recupera a velocidade atual do veiculo.
     * @return A velocidade atual do veiculo.
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * Recupera a quantidade de pneus do veiculo.
     * @return A quantidade de pneus do veiculo.
     */
    public int getQtdePneus() {
        return qtdePneus;
    }

    /**
     * Aumenta a velocidade do veiculo, caso esteja em movimento.
     */
    public void aumentarVelocidade() {
        if (estaEmMovimento()) {
            velocidade++;
            System.out.println("nova velocidade: " + velocidade);
        }
    }

    /**
     * Diminui a velocidade do veiculo, caso esteja em movimento.
     */
    public void frear() {
        if (velocidade > 0) {
            velocidade--;
            System.out.println("nova velocidade: " + velocidade);
        }
    }

    /**
     * Para o movimento do veiculo, freando o veiculo ate que a velocidade seja zero.
     */
    public void parar() {
        while (estaEmMovimento()) {
            frear();
        }
    }

    /**
     * Movimenta o veiculo para frente, caso esteja parado.
     */
    public void moverParaFrente() {
        mover();
    }

    /**
     * Coloca o veiculo em movimento, caso esteja parado.
     */
    protected void mover() {
        if (!estaEmMovimento()) {
            velocidade++;
            System.out.println("nova velocidade: " + velocidade);
        }
    }

    /**
     * Verifica se o veiculo esta em movimento.
     * @return Verdadeiro, se esta em movimento. Falso, caso contrario.
     */
    protected boolean estaEmMovimento() {
        return velocidade > 0;
    }

}
