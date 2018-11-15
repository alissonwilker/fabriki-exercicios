public class Carro extends Automovel {
	
	public Carro() {
		setQtdePneus(4);
	}
	
	public void moverParaTras() {
		ligar();
		engatarMarchaARe();
		if(!estaEmMovimento()) {
			velocidade++;
		}
	}
	
	protected void engatarMarchaARe() {
		if(marchaAFrente) {
			if(estaEmMovimento()) {
				parar();
				marchaAFrente = false;
			}
		}
	}
	
}
