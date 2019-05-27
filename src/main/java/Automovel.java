
public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;

	private boolean ligado;

	public void moverParaFrente() {
		if (ligado == false) {
			ligar();
		}
		if (marchaAFrente == false) {
			engataMarchaAFrente();

		}
		if (estaEmMovimento() == false) {
			mover();
		}
	}

	public void ligar() {
		if (estaLigado() == false) {
			ligado = true;
		}
	}

	public void desligar() {
		if (estaLigado() == true) {
			parar();
			ligado = false;
		}
	}

	public boolean estaLigado() {

		return ligado;
	}

	public boolean estaEmMarchaAFrente() {
		return marchaAFrente;
	}

	protected void engataMarchaAFrente() {
		if (marchaAFrente == false) {
			if (estaEmMovimento() == true) {
				parar();
			}
			marchaAFrente = true;
		}
	}
}
