/**
 * Tipo que representa um Carro.
 *
 */
public class Carro extends Automovel {
    /**
     * Construtor que apenas configura a quantidade de pneus do veiculo.
     */
    public Carro() {
        this.qtdePneus = 4;
    }

    /**
     * Liga o carro se necessario, engata marcha a re se ja nao estiver engatada, e coloca o carro em
     * movimento se estiver parado.
     */
    public void moverParaTras() {
        ligar();
        engatarMarchaARe();
        mover();
    }

    /**
     * Se a marcha estiver para frente, para o carro se estiver em movimento, e muda para marcha a re.
     */
    protected void engatarMarchaARe() {
        if (estaEmMarchaAFrente()) {
            parar();
            this.marchaAFrente = false;
            System.out.println("marcha a ré: " + !marchaAFrente);
        }
    }

}
