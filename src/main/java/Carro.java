public class Carro extends Automovel {
	
	
	
	@Override
	public int getQtdePneus() {
		return 4;
	}
	
	public void moverParaTras() {
		if(estaLigado()==false) {
			ligar();
				
				
		}
		marchaAFrente=false;
		velocidade=1;
	}
	
	protected void engatarMarchaARe() {
		if(marchaAFrente==true) {

			if(estaEmMovimento()==true) {
				parar();
			}
			
		}
	}
	

}

