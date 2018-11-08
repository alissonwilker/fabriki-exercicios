public abstract class Automovel extends Veiculo {
	private boolean ligado;
	protected boolean marchaAFrente;
	
	public void desligar() {
		if (estaEmMovimento() == true ) {
			parar();
		}
		if (estaLigado() == true){
			this.ligado = false;			
		}				
	}
	
	protected void engatarMarchaAFrente() {
		if (estaEmMarchaAFrente() == false) {
			parar();
			this.marchaAFrente = true;			
		}		
	}
	
	public boolean estaEmMarchaAFrente() {
		return this.marchaAFrente;
	}
	
	public boolean estaLigado() {
		return this.ligado;
	}
	
	public void ligar() {
		if (estaLigado() == false){
			this.ligado = true;
		}				
	}
		
	@Override
	public void moverParaFrente() {
		if (estaLigado() == false) {
			ligar();
		}
		
		if (estaEmMarchaAFrente() == false){
			engatarMarchaAFrente();			
		}
		
		if (estaEmMovimento() == false){
			mover();
		}
	}	
}
