
public abstract class Automovel extends Veiculo {
	
	protected boolean marchaAFrente;
	private boolean ligado;
	
	
	
	public void ligar() {
		// TODO Auto-generated method stub
		ligado = true;
	}
	public void desligar() {
		// TODO Auto-generated method stub
		ligado = false;
		velocidade = 0;
	}
	public boolean estaLigado() {
		// TODO Auto-generated method stub
	if(ligado == true || velocidade > 0) {
		return true;
	}else {	
		return false;
	}
	}
	public boolean estaEmMarchaAFrente() {
		// TODO Auto-generated method stub
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


