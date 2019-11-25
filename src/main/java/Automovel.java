
public abstract class Automovel extends Veiculo {
 //declaraçao de atributos
	private boolean	ligado;
	protected boolean	marchaAFrente;
	// construçãodo metodo
	public Automovel() {}
	
	public void moverParaFrente() {
		ligar();
		engatarMarchaAFrente();
		super.moverParaFrente();
		
	}
	public void ligar() {
		if(ligado==false) {
			ligado=true;
		}
		
	}
	public void desligar() {
		if (ligado==true) {
			parar();
			ligado=false;
		}
	}
	public boolean estaLigado() {
		if(ligado==true) {
			return true;
		}else {
			return false;}
	}
	
	public boolean estaEmMarchaAFrente() {
		if(marchaAFrente==true) {
			return true;
		}else {
			return false;}
	}
	protected void engatarMarchaAFrente() {
		if(marchaAFrente==false) {
			marchaAFrente= true; 
		}
	}
	
}
