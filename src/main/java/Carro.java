
public class Carro.java extends Automovel {
	
	public Carro.java(){}

	
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
