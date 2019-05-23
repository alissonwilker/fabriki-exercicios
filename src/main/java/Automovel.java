
public class Automovel extends Veiculo {
	private boolean ligado;

	protected boolean marchaAFrente;

	public void moverParaFrente() {
		if (estaLigado() == false) {
			ligar();
			if (estaEmMarchaAFrente() == false) {
				engatarMarchaAFrente();
			}
		}
		mover();
	};

	public void ligar() {
		if (estaLigado() == false) {
			ligado = true;
		}

	};

	public void desligar() {
		if (estaLigado() == true) {
			ligado = false;
		}
	};

	public boolean estaLigado() {
		return ligado;
	};

	public boolean estaEmMarchaAFrente() {
		return marchaAFrente;
	};

	protected void engatarMarchaAFrente() {
		if (estaEmMarchaAFrente() == false) {
			if (estaEmMovimento() == true) {
				parar();
			}
			marchaAFrente = true;
		}

	};

}
