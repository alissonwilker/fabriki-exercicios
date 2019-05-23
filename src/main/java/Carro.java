
public class Carro extends Automovel {
	public  Carro() {
		qtdePneus=4;
	}
	protected void engatarMarchaARe() {
		if (estaEmMarchaAFrente() == true) {
			if (estaEmMovimento() == true) {
				parar();
			}
		}
		marchaAFrente = false;

	};

	public void moverParaTras() {
		if (estaLigado() == false) {
			ligar();
		}
		if (estaEmMarchaAFrente() == true) {
			engatarMarchaARe();
		}
		mover();
	};
}
