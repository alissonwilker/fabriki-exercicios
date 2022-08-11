
public class Carro extends Automovel {
	
	protected boolean marchaRe;
	
	public Carro(){
		qtdePneus = 4;
	
	}	

	public void moverParaTras() {
		ligar();
		if (marchaRe == false) {
		engatarMarchaARe();
		}
		mover();
	}
	
	protected void engatarMarchaARe() {
		if (marchaAFrente == true){
			parar();
		}
		velocidade++;
		marchaRe = true;
		
	}
	

}
