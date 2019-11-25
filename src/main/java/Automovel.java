public abstract class Automovel extends Veiculo {

	private boolean ligado = false;
	protected boolean marchaAFrente = false;

	public Automovel() {

	}

	public void desligar() {

		super.parar();
		ligado = false;
	}

	protected void engatarMarchaAFrente() {

		super.parar();
		marchaAFrente = true;
	}

	public boolean estaEmMarchaAFrente() {

		return marchaAFrente;
	}

	public boolean estaLigado() {

		if (ligado) {
			return true;

		} else
			return false;
	}

	public void ligar() {

		ligado = true;
	}

	public void moverParaFrente() {

		ligar();
		engatarMarchaAFrente();
		super.moverParaFrente();

	}

}
