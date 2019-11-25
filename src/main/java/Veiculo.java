
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
		if (estaEmMovimento()) {
			velocidade++;
		}
	}
	
	public void frear() {
		if (estaEmMovimento()) {
			velocidade--;
		}
	}

	public void parar() {
		if (estaEmMovimento()) {
			velocidade = 0;
		}
	}

	public void moverParaFrente() {
		if (estaEmMovimento() == false) {
			velocidade++;
		}
	}
	
	public void mover() {
		moverParaFrente();
	}

	public boolean estaEmMovimento() {
		if (getVelocidade() == 0) {
			return false;
		} else {
			return true;
		}
	}
}
