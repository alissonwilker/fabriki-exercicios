public abstract class Automovel extends Veiculo {
	private boolean ligado;
	protected boolean marchaAFrente;
	
	public Automovel() {
		
	}
	
	public void desligar() {
		if(ligado == true) {
			ligado = false;
			velocidade = 0;
			}
		}
		
	protected void engatarMarchaAFrente() {
		if (marchaAFrente != true && velocidade!=0) {
			marchaAFrente = true;
			velocidade = 0;}
		else {
			marchaAFrente = true;
			}
		}
	
	public boolean estaEmMarchaAFrente() {
		if(marchaAFrente == true ) {
		return true;
		}else {
			return false;
		}
	}

	public boolean estaLigado() {
		if(ligado == true) {
			return true;
		}else {
			velocidade = 0;
			return false;
		}
	}
	
	public void ligar() {
		if(ligado == false) {ligado = true;
		velocidade = 0;}
	}
	
	public void moverParaFrente() {
		engatarMarchaAFrente();
		ligado = true;
