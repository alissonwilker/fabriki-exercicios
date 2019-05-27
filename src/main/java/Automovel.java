public abstract class Automovel extends Veiculo {

	private boolean ligado;
	protected boolean marchaAFrente;

	public Automovel() {

	}

	public void desligar() {
		if (ligado == true) {
			parar();
			ligado = false;
		}
		
	}

	protected void engatarMarchaAFrente() {
		if (marchaAFrente == false) {
			parar();
			marchaAFrente = true;
		}

	}

	public boolean estaEmMarchaAFrente() {
		return marchaAFrente;
	}

	public boolean estaLigado() {
		return ligado;

	}

	public void ligar() {
		if (ligado == false) {
			ligado = true;
		}

	}

	public void moverParaFrente() {
		if (estaLigado() == false) {
			ligar();
		}
		
		
		if (estaEmMarchaAFrente() == false) {
			engatarMarchaAFrente();
		}
		
		if (estaEmMovimento() == false) {
			mover();
		}
	}

}
