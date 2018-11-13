
public abstract class Automovel extends Veiculo{
	
	
	protected boolean marchaAFrente;
	private boolean ligado;

	public Automovel() {
		
	}
	
	public void moverParaFrente() {
		if( velocidade == 0) {
			ligado = true;
		} 
		if( marchaAFrente == false) {
			marchaAFrente = true;
			velocidade++;
		} else {
			velocidade++;
		}
	}
	
	public void ligar() {
		if(ligado == false) {
			ligado = true;
		}
	}
	
	
	public void desligar() {
	if(ligado == true && velocidade != 0) {
		while(velocidade !=0) {
			velocidade--;
		}
		ligado = false;
		}
	}
		
	
		public boolean estaLigado() {
			if(ligado == true || velocidade != 0) {
				return true;
			}else {	
				return false;
			}	
	 }
		

		public boolean estaEmMarchaAFrente() {
		
		ligado = true;
		if(marchaAFrente == true) {	
			return true;
		}else {
			return false;
		}
	}
	
	protected void engatarMarchaAFrente() {
	if(marchaAFrente == false) {
		super.parar();
		marchaAFrente = true;
	}else {
		marchaAFrente = true;
	}

	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}
