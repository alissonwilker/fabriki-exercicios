public class Carro extends Automovel{
	
	public Carro() {
		qtdePneus=4;
	}
	public void moverparaTras() {
		frear();
		parar();
		engatarMarchaARe();
	}
	protected void engatarMarchaARe() {
		velocidades++;
		marchaParaFrente=false;
	}
}
