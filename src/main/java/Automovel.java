
public abstract class Automovel extends Veiculo {

	protected boolean marchaAFrente;
	private boolean ligado;

	public void ligar() {
		// TODO Auto-generated method stub
		if (estaLigado() == false) {
			ligado = true;
		}
	}

	public void desligar() {
		if (estaLigado() == true && estaEmMovimento() == true) {
			parar();
			ligado = false;
		}

	}

	public boolean estaLigado() {
		return ligado;
	}

	public boolean estaEmMarchaAFrente() {
		// TODO Auto-generated method stub
		return marchaAFrente;
	}

	protected void engatarMarchaAFrente() {
		if (estaEmMarchaAFrente() == false) {
			parar();
			marchaAFrente = true;
		}
	}

	public void moverParaFrente() {
		// TODO Auto-generated method stub
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
