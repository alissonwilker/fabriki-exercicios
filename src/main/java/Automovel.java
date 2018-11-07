
public class Automovel extends Veiculo {
	private boolean ligado;
	protected boolean marchaAFrente;
	
	public void moverParaFrente () {
		ligar();
		engatarMarchaAFrente();
		mover();
	}
	
	public void ligar () {
		if (!estaLigado()) {
			ligado = true;
		}
	}
	
	public void desligar() {
		if (estaLigado()) {
			parar();
		}
		ligado = false;
	}
	
	public boolean estaLigado() {
		return ligado;
	}
	
	public boolean estaEmMarchaAFrente () {
		return marchaAFrente;
	}
	
	protected void engatarMarchaAFrente () {
		if (!estaEmMarchaAFrente() ){
			parar();
			marchaAFrente = true;
		}
	}
	
}
