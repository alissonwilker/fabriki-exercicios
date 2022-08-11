
public class Carro extends Automovel {	
	
	
	public Carro(){
		qtdePneus = 4;
	
	}	

	public void moverParaTras() {
		ligar();
		if (marchaAFrente == true) {
		engatarMarchaARe();
		}
		mover();
	}
	
	protected void engatarMarchaARe() {
		if (marchaAFrente == true){
			parar();
		}
		marchaAFrente = false;
		
	}
	

}
