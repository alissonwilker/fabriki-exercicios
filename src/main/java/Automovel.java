
public class Automovel extends Veiculo{

	protected boolean marchaAFrente;
	private boolean ligado;
	
	public Automovel() {}
	
	public Automovel(boolean marchaAFrente, boolean ligado) {
		super();
		this.marchaAFrente = marchaAFrente;
		this.ligado = ligado;
	}

	public void moverParaFrente() {
		if(ligado == false) {
			ligar();
		}
		if(marchaAFrente == false) {
			engatarMarchaAFrente();
		}
		
		if(estaEmMovimento() == false) {
			mover();
		}
	}
	
	public void ligar() {
		if(estaLigado() == false) {
			ligado = true;
		}
	}
	
	public void desligar() {
		if(ligado == true) {
			parar();
		}
		ligado = false;
	}
	
	public boolean estaLigado() {
		return ligado;
	}
	
	public boolean estaEmMarchaAFrente() {
		return marchaAFrente;
	}
	
	protected void engatarMarchaAFrente() {
		if(marchaAFrente == false && estaEmMovimento() == true) {
			parar();
		}
		marchaAFrente = true;
	}
	
	
}
