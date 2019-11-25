
public abstract class Automovel extends Veiculo {

	protected boolean marchaAFrente;
	private boolean ligado;
	
	public void moverParaFrente() {
		this.ligado=true;
		this.marchaAFrente=true;
		super.moverParaFrente();
		
	}
	
	public void ligar() {
		this.ligado=true;
	}
	
	public void desligar() {
		if (this.ligado=true) {
			if (estaEmMovimento()== true) { 
				parar();	
			}			
			this.ligado=false;
		}
	}
	
	public boolean estaLigado() {
		return this.ligado;
	}
	
	public boolean estaEmMarchaAFrente() {
		return this.marchaAFrente;
	}
	
	protected void engatarMarchaAFrente() {
		if (this.marchaAFrente==false) {
			if (estaEmMovimento()==true) {
				parar();
			}
			this.marchaAFrente=true;
		}
	}
}
