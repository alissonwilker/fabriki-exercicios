public class Carro extends Automovel {
	public Carro() {
		qtdPneus = 4;
	}

	public void moverParaTras() {
		// TODO Auto-generated method stub
		ligar();
		if (marchaAFrente==true) {
			engatarMarchaARe();	
		}
		if (velocidade==0) {
			mover();
		}
		
	}
	
	protected void engatarMarchaARe() {
		if (marchaAFrente==true) {
			parar();
			marchaAFrente=false;
		}
	}
}
