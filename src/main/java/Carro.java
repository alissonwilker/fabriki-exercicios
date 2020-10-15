public class Carro extends Automovel {

    public Carro() {
        qtdePneus = 4;
    }
    
    void moverParaTras() {
        System.out.println("Liga o carro se necessario, engata marcha a re se ja nao estiver engatada, e coloca o carro em movimento se estiver parado.");
    }

    protected void engatarMarchaARe(){
        System.out.println("Se a marcha estiver para frente, para o carro se estiver em movimento, e muda para marcha a re.");
    }
    
}
