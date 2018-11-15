public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;
	private boolean ligado;
	
	@Override
	public void moverParaFrente() {
		ligar();
		engatarMarchaAFrente();
		mover();
	}
	
	public void ligar() {
		if(!estaLigado()) {
			ligado = true;
		}
	}
	
	public void desligar() {
		if(estaLigado()) {
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
		
	protected void engatarMarchaAFrente() {
		if(!estaEmMarchaAFrente()) {
			parar();
			marchaAFrente = true;
			}
		}
}
