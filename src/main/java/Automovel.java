public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;
	private boolean ligado;
			
	//@Override
	//public void moverParaFrente() {
	//	if(ligado == false) {
	//		ligado = true;
	//				if(marchaAFrente == false) {
	//					marchaAFrente = true;
	//				}
	//					if(estaEmMovimento() == false){
	//						mover();
	//					}
	//	}
	//}
	
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
	}
	
	public void desligar() {
		if(ligado == true) {
			if(estaEmMovimento()) {
				parar();
				ligado = false;
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
		return marchaAFrente = true;
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
