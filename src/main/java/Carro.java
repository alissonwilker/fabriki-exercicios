public class Carro extends Automovel {
	public Carro() {
		qtdePneus = 4;
	}
	
	protected void engatarMarchaARe() {
		if (marchaAFrente == true) {
			parar();
			marchaAFrente = false;
		}
	}
	
	protected void moverParaTras() {
		if (estaLigado() == false) {
			ligar();
		}
		engatarMarchaARe();
		if (velocidade == 0) {
			mover();
		}
	}
}
