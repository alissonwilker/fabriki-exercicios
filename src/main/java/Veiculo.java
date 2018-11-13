
public abstract class Veiculo {

	protected int velocidade;
	protected int qtdePneus;

	public int getVelocidade() {
		return velocidade;
	}

	public int getQtdePneus() {
		return qtdePneus;
	}

	public void aumentarVelocidade() {
		if (estaEmMovimento() == true) {
			velocidade++;
		}

	}

	public void frear() {
		if (estaEmMovimento() == true) {
			velocidade--;
		}

	}

	public void parar() {
		while (velocidade > 0) {
			frear();
		}

	}

	public void moverParaFrente() {
		if (estaEmMovimento() == false) {
			mover();
		}

	}

	protected void mover() {
		if (estaEmMovimento() == false) {
			velocidade++;
		}
	}

	protected boolean estaEmMovimento() {
		if (getVelocidade() > 0) {
			return true;
		} else {
			return false;
		}

	}

}
