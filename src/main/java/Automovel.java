public abstract class Automovel extends Veiculo {

	protected boolean marchaAFrente = true;
	private boolean ligado;


	public Automovel () {

	}
	
	
	

	public void moverParaFrente() {
		if (!ligado) {
			ligar();
		}
		if (!marchaAFrente) {
			engatarMarchaAFrente();
		}
		if (velocidade == 0) {
			mover();
		}
	}


	public void ligar() {
		if (!ligado) {
			ligado = true;
		}

	}


	public void desligar() {
		if (ligado) {
			ligado = false;
			velocidade = 0;
		}
		}


	public boolean estaLigado() {
		marchaAFrente = true;
		if (!ligado) {
			return false;
		}
		else {return true;}	
		
		}		



	public boolean estaEmMarchaAFrente() {
		 return marchaAFrente;
	}


	protected void engatarMarchaAFrente() {
		if (!marchaAFrente && velocidade !=0) {
			parar();
			marchaAFrente = true;
		}

	}


}
