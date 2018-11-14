public class Automovel extends Veiculo {
	
	protected boolean marchaAFrente;
	private boolean ligado;
	
	public void desligar() {
		ligado=false;
		velocidade=0;
	}
	
	public void moverParaFrent() {
		engatarMarchaAFrent();
		ligado = true;
	}
	
	public boolean estaLigado() {
		engatarMarchaAFrent();
		if(ligado==true ||velocidade > 0) {
			return true;
		}else {
			return false;
		}
	}
	public void ligar() {
		ligado=true;
	}
	
	public boolean estaEmMarchaAFrent(){
		if(velocidade>0 && marchaAFrente==true) {
			return true;
		}else {
		return false;
	}
	}
	protected void engatarMarchaAFrent() {
		marchaAFrente=true;
	}
	public boolean isLigado() {
		return ligado;
	}
	public boolean setLigado(boolean ligado) {
		this.ligado=ligado;
		return ligado;
	}
}
