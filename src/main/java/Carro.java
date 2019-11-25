import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Carro extends Automovel {

	public Carro() {

		qtdePneus = 4;
	}

	public void moverParaTras() {
		ligar();
		engatarMarchaARe();
		if (estaEmMovimento() == false) {
			velocidade++;
		}
	}

	protected void engatarMarchaARe() {
		if (estaEmMarchaAFrente() == true) {
			if (estaEmMovimento() == true) {
				parar();
			}
			marchaAFrente = false;
		}
	}

}
