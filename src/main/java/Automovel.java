public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;
	private boolean ligado;
	
	public boolean getMarchaAFrente() {
		return marchaAFrente;
	}

	public void setMarchaAFrente(boolean marchaAFrente) {
		this.marchaAFrente = marchaAFrente;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void ligar() {
		ligado = true;
		velocidade = 0;
	}
	
	public void desligar() {
		if(ligado == true) {
			if(estaEmMovimento()) {
				parar();
				ligado = false;
				velocidade = 0;
			}
		}		else {
				ligado = false;
				}
	}
	
	public boolean estaLigado() {
		if(getLigado()) {
			return ligado;
		} else {
			return false;
		}
	}
	
	public boolean estaEmMarchaAFrente() {
			if(marchaAFrente == true && ligado == true){
				return true;
			} else {
				return false;
			}
	}
		
	protected void engatarMarchaAFrente() {
		if(marchaAFrente == false) {
			if(estaEmMovimento()) {
				parar();
				marchaAFrente = true;
			} else {
			marchaAFrente = true;
			  }
		}
	}
}
