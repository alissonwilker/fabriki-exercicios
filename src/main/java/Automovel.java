
public abstract class Automovel extends Veiculo {

	protected boolean marchaAFrente;

	private boolean ligado;
	

	public void moverParaFrente() {
		if (estaLigado() == false) {
			ligar();
		}
		engatarMarchaAFrente();
		super.moverParaFrente();
	}	

	public void ligar() {
		if (estaLigado() == false) {
			ligado = true;
		}
	}

	public void desligar() {
		
		if (estaLigado() == true) {
			if (estaEmMovimento() == true) {
				parar();
			}
			ligado = false;
		}
	}

	public boolean estaLigado() {
		return ligado;
	}

	public boolean estaEmMarchaAFrente() {
		return marchaAFrente;
	}
	
	protected void engatarMarchaAFrente() {
		if (estaEmMarchaAFrente() == false) {
			marchaAFrente = true;
		}

	}

}
