public class Veiculo {
	protected int velocidade;
	protected int qtdePneus;

	public int getVelocidade() {
		return velocidade;
	}

	public int getQtdePneus() {
		return qtdePneus;
	}

	public void aumentarVelocidade () {
		if (estaEmMovimento()) {
			velocidade++;	
		}		
	}

	public void frear () {
		if (estaEmMovimento()) {
			velocidade--;
		}
	}

	public void parar () {
		while (velocidade > 0) {
			frear();
		}
		velocidade = 0;
	}

	public void moverParaFrente () {
		if (!estaEmMovimento()) {
			mover();
		}
	}

	protected void mover () {
		if (!estaEmMovimento()) {
			velocidade++;
		}
	}

	protected boolean estaEmMovimento () {
		return velocidade != 0;
	}
}
