public abstract class Automovel extends Veiculo {
	protected boolean marchaAFrente;
	private boolean ligado;
	
	public void moverParaFrente() {
		if(ligado == false) {
			ligar();
		}
		if(marchaAFrente == false) {
			marchaAFrente = true;
		}
		if(velocidade == 0) {
			velocidade++;
		}	
	}
	
	public void ligar() {
		if(ligado == false) {
			this.ligado = true;
			
		}
		
	}
	
	public void desligar() {
		if(velocidade != 0) {
			parar();
		}
		this.ligado = false;
		
	}
	
	public boolean estaLigado() {
		if(this.ligado == true) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean estaEmMarchaAFrente() {
		if(this.marchaAFrente == true) {
			return true;
		}else {
			return false;
		}		
	}
	
	protected void engatarMarchaAFrente() {
		if(this.marchaAFrente == false && this.velocidade != 0 ) {
			parar();
			this.marchaAFrente = true;
		}else if(this.marchaAFrente == false && this.velocidade == 0) {
			this.marchaAFrente = true;
		}
		
	}

}
