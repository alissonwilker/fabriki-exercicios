public class Carro extends Automovel {
	protected boolean marchaARe;
	private boolean ligado;
	
	public Carro() {
		qtdePneus = 4;
	}

	public void moverParaTras() {
		if(ligado == false) {
		ligado = true;}
		engatarMarchaARe();
		velocidade++;
		
	}
	
	protected void engatarMarchaARe() {
		if(marchaAFrente == true) {
			marchaAFrente =false;
			marchaARe = true;
			velocidade = 0;
		}else {
			marchaARe = true;
			velocidade = 0;
		}
		
	}
}
