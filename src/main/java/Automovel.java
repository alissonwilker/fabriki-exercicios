public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;
	private boolean ligado;
	
	public Automovel() {
		
	}

	public void desligar() {
		// TODO Auto-generated method stub
		if (ligado==true) {
			parar();
			ligado=false;
		}
	}

	public boolean estaLigado() {
		// TODO Auto-generated method stub
		if (ligado == true) {
			return true;
		}
		else {
			return false;	
		}
	}

	public void ligar() {
		// TODO Auto-generated method stub
		if (ligado == false) {
			ligado = true;
		}
	}

	public boolean estaEmMarchaAFrente() {
		// TODO Auto-generated method stub
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
