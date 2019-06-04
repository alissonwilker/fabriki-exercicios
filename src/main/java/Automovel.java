public abstract class Automovel extends Veiculo {

protected boolean marchaAFrente;
private boolean ligado;

public void moverParaFrente() {
if (estaLigado() == false) {
ligar();
}

if (estaEmMarchaAFrente() == false) {
engatarMarchaAFrente();
}

super.moverParaFrente();
}

public void ligar() {
if (ligado == false) {
ligado = true;
}
}

public void desligar() {
if (estaLigado() == true) {
if (velocidade > 0) {
parar();
}
ligado = false;
}
}

public boolean estaLigado() {
return ligado;
}

public boolean estaEmMarchaAFrente() {
return marchaAFrente;
}

protected void engatarMarchaAFrente() {
if (marchaAFrente == false) {
if (velocidade > 0) {
parar();
}
marchaAFrente = true;
}

}

}
