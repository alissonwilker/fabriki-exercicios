
public class Carro extends Automovel {
	// construçãodo metodo
	public Carro(){
		qtdePneus =4;
	}
	
	protected void engatarMarchaARe() {
		if(marchaAFrente==true) {
			parar();
			marchaAFrente=false;
		}
	}
	
	public void moverParaTras() {
		ligar();
		if(marchaAFrente==true) {
			engatarMarchaARe();
			
		}
		if(velocidade==0) {
			mover(); 
		}
	}
	
}
