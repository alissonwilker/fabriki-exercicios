public class Carro extends Automovel {
    
    public Carro(){
        
    qtdePneus = 4;
    public void moverParaTras(){
    frear();
    parar();
    engatarMarchaARe();
}
    protected void engatarMarchaARe() {

velociade++;
marchaAfrente = false;
}
    }
}
