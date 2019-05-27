
public class Carro extends Automovel {

	public Carro() {
		qtdePneus =4;
		
	}
	public void moverParaTras(){
			ligar();
			if(estaEmMarchaAFrente()==true) {
				engatarMarchaARe();
				
			}
			if(estaEmMovimento()==false) {
				mover();
			}
		}
		
	
	protected void engatarMarchaARe() {
		if(estaEmMarchaAFrente()==true) {
			parar();
			marchaAFrente = false;
		}
		
		
	}

	
}

