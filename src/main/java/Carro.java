public class Carro extends Automovel {

public Carro() {
qtdePneus = 4;
}

public void moverParaTras() {
if (estaLigado() == false) {
ligar();
}

if (estaEmMarchaAFrente() == true) {
engatarMarchaARe();
}

if (estaEmMovimento() == false) {
mover();
}
}

protected void engatarMarchaARe() {
if (marchaAFrente == true) {
if (estaEmMovimento() == true) {
parar();
}
marchaAFrente = false;

}
}
}
