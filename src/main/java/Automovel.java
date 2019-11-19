
public abstract class Automovel extends Veiculo{

	//DECLARAÇÃO DE ATRIBUTOS 
	private boolean ligado;
	protected boolean marchaAFrente;

	//MÉTODO CONSTRUTOR
	public Automovel() {
		
	}
	
	//MÉTODOS
	public void desligar() {
		if (velocidade != 0) {
			velocidade = 0;
		}
		if (ligado == true) {
			ligado = false;
		}
	}
	
	protected void engatarMarchaAFrente() {
		if (marchaAFrente != true) {
			frear();
			velocidade = 0;
			marchaAFrente = true;
	}
	}
	
	public boolean estaEmMarchaAFrente() {
		if(marchaAFrente == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean estaLigado() {
		return ligado;
	}
	
	public void Ligar() {
		if (velocidade != 0) {
			parar();
		}
		if (ligado != true) {
			ligado = true;
		}
	}
	
	public void moverParaFrente() {
		Ligar();
		engatarMarchaAFrente();
		velocidade ++;
		
	}
	
}
