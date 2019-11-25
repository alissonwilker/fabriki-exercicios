public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;
	private boolean ligado;
	
	public Automovel() {
		
	}

	public void desligar() {
		if (ligado==true) {
			parar();
			ligado=false;
		}
	}

	public boolean estaLigado() {
		if (ligado == true) {
			return true;
		}
		else {
			return false;	
		}
	}

	public void ligar() {
		if (ligado == false) {
			ligado = true;
		}
	}

	public boolean estaEmMarchaAFrente() {
		if (marchaAFrente == true) {
			return true;
		}
		else {
			return false;	
		}
	}

	@Override
	public void moverParaFrente() {
		ligar();
		engatarMarchaAFrente();
		super.moverParaFrente();
	}
	
	protected void engatarMarchaAFrente() {
		if (marchaAFrente==false) {
			marchaAFrente=true;
		}
	}
}
