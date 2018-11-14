public class Automovel extends Veiculo {
	
	protected boolean marchaAFrente;
	private boolean ligado;
	
	public void desligar() {
		// TODO Auto-generated method stub
		ligado = false;
		velocidade = 0;
	}
	
	public void moverParaFrent(){
		// TODO Auto-generated method stub
	engatarMarchaAFrent();
	ligado = true;
	}

	public boolean estaLigado() {
		// TODO Auto-generated method stub	
	engatarMarchaAFrent();
	if(ligado == true || velocidade > 0){
		return true;
	}else {
		 return false;
		}	
	}

	public void ligar() {
		// TODO Auto-generated method stub
		ligado = true;
	}

	public boolean estaEmMarchaAFrente() {
		// TODO Auto-generated method stub	
	if(velocidade > 0 && marchaAFrente == true ) {
		return true;
	}else {
		return false;
	}	
	}
	
	protected void engatarMarchaAFrent(){
		marchaAFrente = true;
	}

	public boolean isLigado() {
		return ligado;
	}

	public boolean setLigado(boolean ligado) {
		this.ligado = ligado;
		return ligado;
	}

}
