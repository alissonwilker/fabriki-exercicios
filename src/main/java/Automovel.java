public abstract class Automovel extends Veiculo{
	private boolean ligado;
	protected boolean marchaAFrente;
	
	
	
	public void desligar() {
		if (velocidade>0) {
			parar();
		}
		ligado=false;	
	}

	boolean estaLigado() {
		return ligado;
	}

	void ligar() {
		ligado = true;
	}

	public boolean estaEmMarchaAFrente() {
		return marchaAFrente;
	}
	
	protected void engatarMarchaAFrente() {
		if (velocidade>0) {
			parar();
		}
			marchaAFrente=true;

	}

	void moverParaFrente() {
		if (ligado==false) {
			ligado=true;
		}
		if(marchaAFrente==false) {
			engatarMarchaAFrente();
		}
		if(velocidade==0) {
		mover();
		}
		
	}



}
