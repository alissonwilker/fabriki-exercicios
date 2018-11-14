
public abstract class Automovel extends Veiculo {
	
	protected boolean marchaAFrente;
	private boolean ligado;
	
	
	
	public void ligar() {
		
		ligado = true;
	}
	public void desligar() {
		
		ligado = false;
		velocidade = 0;
	}
	public boolean estaLigado() {
	
	if(ligado == true || velocidade > 0) {
		return true;
	}else {	
		return false;
	}
	}
	public boolean estaEmMarchaAFrente() {
		
	engatarMarchaAFrente();
	ligado = true;
	if(marchaAFrente == true) {	
		return true;
	}else {
		return false;
	}
	}
	
	protected void engatarMarchaAFrente(){
		marchaAFrente = true; 
	}
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}
