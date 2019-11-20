public class Carro extends Automovel {
	public Carro() {
		qtdePneus = 4;
		
	}
	
	public void moverParaTras() {
		getVelocidade();
		ligar();
		engatarMarchaARe();
		mover();
		
	}
	
	protected void engatarMarchaARe() {
		getVelocidade();
		if(this.velocidade != 0 ) {
			frear();
		}
		if(this.marchaAFrente == true) {
			this.marchaAFrente = false;
		}
		
	}

}
