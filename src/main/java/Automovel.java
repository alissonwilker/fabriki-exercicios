
public abstract class Automovel extends Veiculo {

	protected boolean marchaAFrente;
	protected boolean ligado;
	

	public Automovel () {
		
	}

	public void moverParaFrente() {
		if (!ligado) {
			ligar();
		}
		if (!marchaAFrente) {
			engatarMarchaAFrente();
		}
		if (velocidade == 0) {
			mover();
		}
	}


	public void ligar() {
		if (!ligado) {
			ligado = true;
		}
		
	}


	public void desligar() {
		if (ligado) {
			ligado = false;
			velocidade = 0;
		}
		}


	public boolean estaLigado() {
		if (!ligado) {
			return false;
		}
		else {return true;}	
		}		
	


	public boolean estaEmMarchaAFrente() {
		
		if (!marchaAFrente == false) {
		 return false;}
		else {return true;}
		}
			
			
		
	
	
	protected void engatarMarchaAFrente() {
		if (!marchaAFrente && velocidade !=0) {
			parar();
			marchaAFrente = true;
		}
	
	}
	
	
}
