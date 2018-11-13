public class Carro extends Automovel {

	private boolean marchaARe;
	
	public Carro() {
		setQtdePneus(4);
	}
	
	public boolean getMarchaARe() {
		return marchaARe;
	}

	public void setMarchaARe(boolean marchaARe) {
		this.marchaARe = marchaARe;
	}
	
	public void moverParaTras() {
		if(estaLigado() == false) {
			ligar();
			engatarMarchaARe();
			mover();
			
		}else {
			ligar();
			engatarMarchaARe();
			mover();
		}
	}
	
	protected void engatarMarchaARe() {
		if(marchaAFrente == true) {
			if(estaEmMovimento() == true) {
				parar();
				marchaARe = true;
			} else {
				marchaARe = true;
			}
		}
	}
	
}
