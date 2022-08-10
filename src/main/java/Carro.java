
public class Carro extends Automovel {
	
	public Carro(){
		qtdePneus = 4;
	
	}

	
	protected void engatarMarchaARe() {
		if (marchaAFrente == true){
			parar();
		}
		
	}
	
	public void moverParaTras() {
		ligar();
		engatarMarchaARe();
		if (velocidade == 0) {
			velocidade++;
		}
	}

}
