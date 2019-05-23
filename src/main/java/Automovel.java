public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;
	private boolean ligado;
	
	public void moverParaFrente() {
		if(estaLigado() == false) {
			ligar();
		}
		if(estaEmMarchaAFrente() == false) {
			engatarMarchaAFrente();
		}
		if(velocidade == 0) {
			mover();
		}
		
	}

	public void ligar() {
		if(ligado == false) {
			ligado = true;
		}
		
	}

	public void desligar() {
		if(ligado == true) {
			if(velocidade > 0) {
				parar();
			}
			ligado = false;
		}
		
	}

	public boolean estaLigado() {
		if(ligado == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected void engatarMarchaAFrente() {
		if(marchaAFrente == false) {
			if(velocidade > 0) {
				parar();
			}
			marchaAFrente = true;
		}
		
	}

	public boolean estaEmMarchaAFrente() {
		if(marchaAFrente == true) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
