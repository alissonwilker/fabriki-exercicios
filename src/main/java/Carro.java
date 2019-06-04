public class Carro extends Automovel {
	Carro() {
		qtdePneus = 4;
	}

	public void moverParaTras() {
		if (!estaLigado()) {
			ligar();
		}
		if (marchaAFrente) {

			marchaAFrente = false;
		}
		velocidade = 0;
		velocidade++;

	}

	protected void engatarMarchaARe() {
		if (marchaAFrente == true)
			marchaAFrente = false;

		if (velocidade == 0)
			velocidade++;
	}
}
