
public class Automovel extends Veiculo{

	protected boolean marchaAFrente;
	private boolean ligado;
	
	public Automovel() {}
	
	public Automovel(boolean marchaAFrente, boolean ligado) {
		super();
		this.marchaAFrente = marchaAFrente;
		this.ligado = ligado;
	}

	public void moverParaFrente() {}
	
	public void ligar() {}
	
	public void desligar() {}
	
	public boolean estaLigado() {return false;}
	
	public boolean estaEmMarchaAFrente() {return false;}
	
	protected void engatarMarchaAFrente() {}
	
	
}
