public class Carro extends Automovel {
	
	public Carro() {
		qtdePneus = 4;
	}
	
	public void moverParaTras() {
		if (estaLigado() == false) {
			ligar();
		}
		if (estaEmMarchaAFrente() == true) {
			engatarMachaARe();
		}
		if(estaEmMovimento() == false) {
			mover();
		}
	}
	
	protected void engatarMachaARe() {
		if(marchaAfrente == true) {
			if(estaEmMovimento() == true) {
				parar();
			}
			marchaAfrente = false;
		}
	}

}
