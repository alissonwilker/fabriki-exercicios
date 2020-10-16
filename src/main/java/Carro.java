 public class Carro extends Automovel {
    public Carro() {
        qtdePneus = 4;
    }
    public void moverParaTras() {
        if (estaLigado() == false) {
            ligar();
        }
        if (estaEmMarchaAFrente() == true) {
            engateMarchaARe();
        }
        if (estaEmMovimento() == false) {
            mover();
        }
    }
    protected void engateMarchaARe() {
        if (marchaAFrente == true) {
            if (estaEmMovimento() == true) {
                parar();
            }
            marchaAFrente = false;}
    }
}
