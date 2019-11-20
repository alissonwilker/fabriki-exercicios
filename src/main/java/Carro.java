public class Carro extends Automovel {

	//MÉTODO CONSTRUTOR
	public Carro() {
		setQtdePneus(4);
	}
	
	//MÉTODOS ESPECÍFICOS
	protected void engatarMarchaRe() {
		setVelocidade(0);
		setMarchaAFrente(false);
	}
	
	public void moverParaTras() {
		Ligar();
		engatarMarchaRe();
		setVelocidade(velocidade++);
	}
	
}
