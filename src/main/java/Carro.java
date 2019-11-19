
public class Carro extends Automovel {

	public Carro() {
		qtdePneus = 4;
	}
	
	protected void engatarMarchaRe() {
		if (marchaAFrente == true) {
			parar();
			
		}
	}
	
	public void moverParaTras() {
		Ligar();
		engatarMarchaRe();
		velocidade --;
	}
	
	
	
}
