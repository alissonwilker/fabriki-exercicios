public class Carro extends Automovel {
	public Carro () {
		qtdePneus = 4;
	}
	
	public void moverParaTras () {
		ligar();
		engatarMarchaARe();
		mover();
	}
	
	protected void engatarMarchaARe () {
		if (marchaAFrente ) {
			parar();
			marchaAFrente = false;
		}
	}
}
