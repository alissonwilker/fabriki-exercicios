/**
 * Tipo que representa um Automovel.
 *
 */
public abstract class Automovel extends Veiculo {
    /**
     * Representa se o automovel esta em marcha a frente ou nao.
     */
    protected boolean marchaAFrente;

    /**
     * Representa se o automovel esta ligado ou desligado.
     */
    private boolean ligado;

    /**
     * Liga o carro se necessario, engata marcha a frente se ja nao estiver engatada, e coloca o carro
     * em movimento se estiver parado.
     *
     * @see Veiculo#moverParaFrente()
     */
    @Override
    public void moverParaFrente() {
        ligar();
        engatarMarchaAFrente();
        mover();
    }

    /**
     * Liga o automovel se estiver desligado.
     */
    public void ligar() {
        if (!estaLigado()) {
            this.ligado = true;
            System.out.println("ligado: " + ligado);
        }
    }

    /**
     * Se estiver ligado, para o automovel se necessario, e desliga-o.
     */
    public void desligar() {
        if (estaLigado()) {
            parar();
            this.ligado = false;
            System.out.println("ligado: " + ligado);
        }
    }

    /**
     * Verifica se o automovel esta ligado.
     *
     * @return Verdadeiro, se estiver ligado. Falso, caso contrario.
     */
    public boolean estaLigado() {
        return ligado;
    }

    /**
     * Verifica se a marcha a frente esta engatada.
     *
     * @return Verdadeiro, se a marcha a frente estiver engatada. Falso, caso contrario.
     */
    public boolean estaEmMarchaAFrente() {
        return marchaAFrente;
    }

    /**
     * Se a marcha a frente nao estiver engatada, para o carro se necessario, e engata a marcha a
     * frente.
     */
    protected void engatarMarchaAFrente() {
        if (!estaEmMarchaAFrente()) {
            parar();
            this.marchaAFrente = true;
            System.out.println("marcha a frente: " + marchaAFrente);
        }
    }

}
