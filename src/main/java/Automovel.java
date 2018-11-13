
public abstract class Automovel extends Veiculo {

	private boolean ligado;
	protected boolean marchaAFrente;

	public void moverParaFrente() {
		if (estaLigado() == false) {
			ligar();

		}
		if (estaEmMarchaAFrente() == false) {
			engatarMarchaAFrente();
		}
		if(estaEmMovimento() == false) {
			mover();
		}
	}

	public void desligar() {
		if (estaLigado() == true) {
			ligado = false;
		}
		if(estaEmMovimento() == true) {
			parar();
		}

	}

	public void ligar() {
		if (estaLigado() == false) {
			ligado = true;
		}
		if(estaEmMovimento() == false) {
			ligado = true;
		}

	}

	public boolean estaLigado() {
		return this.ligado;
	}

	public boolean estaEmMarchaAFrente() {
		return marchaAFrente;
	}

	protected void engatarMarchaAFrente() {
		if (estaEmMarchaAFrente() == false) {
			parar();
			marchaAFrente = true;
		}
	}

}
