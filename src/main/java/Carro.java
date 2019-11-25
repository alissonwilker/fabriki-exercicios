public class Carro extends Automovel {

	public Carro() {
		super.qtdePneus = 4;
	}

	protected void engatarMarchaRe() {
		super.parar();
		super.marchaAFrente = false;
	}

	public void moverParaTras() {
		super.ligar();
		engatarMarchaRe();
		super.mover();
	}
}
