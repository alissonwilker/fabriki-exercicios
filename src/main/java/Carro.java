
public class Carro extends Automovel {

	
	public Carro() {
		qtdePneus=4;
	}
	
	
	
	public void moverParaTras() {
		if (estaLigado() == false) {
			ligar();
		}
    	if(estaEmMarchaAFrente()==true) {
		    engatarMarchaARe() ;
	    }
		mover();
	} 
	
	
	protected void engatarMarchaARe() {
		if (this.marchaAFrente==true) {
			if(estaEmMovimento()==true) {
				parar();
			}
			this.marchaAFrente=false;
		}
	}
}
