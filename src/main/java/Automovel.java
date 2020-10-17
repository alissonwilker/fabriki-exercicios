public class Automovel extends Veiculo {
	
	protected boolean marchaAfrente;
	private boolean ligado;

	
	public void moverParaFrente() {
		if (estaEmMovimento() == false) {
			mover();
		}
		
	}
	
	public void ligar() {
		if(ligado==false) {
			ligado=true;
		}
			
	}
	
	public void desligar() {
		if(ligado==true) {
			ligado=false;
		}
		
	}
	
	public boolean estaLigado() {
		// TODO Auto-generated method stub
		return ligado;
	}
	
	public boolean estaEmMarchaAFrente() {
	
			return marchaAfrente ;

	}
	
	protected void engatarMarchaAFrente() {
		if (marchaAfrente == false) {
			if(velocidade >0) {
				parar();
			}
			marchaAfrente =true;
		}
	}

}
