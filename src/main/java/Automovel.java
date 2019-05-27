

public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;
	private boolean ligado;

	public void moverParaFrente() {
		if (estaLigado() == false) {
			ligado = true;

		}
		;
		if (estaEmMarchaAFrente() == false) {
			marchaAFrente = true;
		}
		;
		if (estaEmMovimento() == false) {
			velocidade++;
		}
		;

	};

	public void ligar() {
		if (estaLigado() == false) {
			ligado = true;
		}
		;
	};

	public void desligar() {
		if (estaLigado() == true) {
			parar();
			ligado = false;
		}
		;
	};

	public boolean estaLigado() {
		if (ligado == true) {
			return true;
		} else {
			return false;
		}
	};

	public boolean estaEmMarchaAFrente() {
		if(marchaAFrente==true) {
			return true;
		}else {
			return false;
		}
	};

	protected void engatarMarchaAFrente() {
		if(estaEmMovimento()==true) {
			parar();
		};
		if(estaEmMarchaAFrente()==false) {
			marchaAFrente= true;
		};
	};

}
