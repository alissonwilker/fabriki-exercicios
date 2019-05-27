public abstract class Veiculo extends java.lang.Object {

	protected int qtdePneus;
	protected int velocidade;

	public int getVelocidade() {
		return velocidade;
	}

	public int getQtdePneus() {
		return qtdePneus;
	}

	public void aumentarVelocidade() {
		if (velocidade > 0) {
		velocidade++;
		}
	}
	
	protected boolean estaEmMovimento() {
		if (velocidade != 0) {
			return true;
		} else {
			return false;
		}

	}

	public void frear() {
		if (velocidade != 0 )
		{velocidade--;
		}
	}

	public void parar() {
		while (velocidade != 0) {
			frear();
		}

	}

	public void moverParaFrente() {
		if (estaEmMovimento() == false) {
			mover();
		}
	}

	protected void mover() {
		if (velocidade == 0) {
			velocidade++;
		}

	}

	

	public Veiculo() {

	}

}
