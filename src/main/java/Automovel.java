public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;
	private boolean ligado;

	Automovel(){};

	public void moverParaFrente() {
		if(ligado==false)
			ligado=true;

		if(marchaAFrente==false)
			marchaAFrente=true;

		velocidade++;
	}

	public void ligar() {
		if(ligado==false)
			ligado=true;
	}

	public void desligar() {
		if(ligado==true) {
			ligado=false;
			velocidade=0;
		}
	}

	public boolean estaLigado() {
		if(ligado==true)
			return ligado;
		else
			return ligado;
	}

	public boolean estaEmMarchaAFrente() {
		if (marchaAFrente==true) {
			return true;
		}else
			return false;
	}

	protected void engatarMarchaAFrente() {
		if(marchaAFrente==false)
			marchaAFrente=true;
	}
}
