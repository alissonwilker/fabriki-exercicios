public abstract class Veiculo {
	protected int velocidade, qtdePneus;

	public int getVelocidade() {
		return velocidade;
	};

	public int getQtdePneus() {
		return qtdePneus;
	};

	public void aumentarVelocidade() {
		if (estaEmMovimento() == true)
			velocidade++;
	};

	public void frear() {
		if (velocidade > 0)
			velocidade--;
	};

	public void parar() {
		while (velocidade > 0) {
			velocidade--;
		}
	};

	public void moverParaFrente() {
		if (estaEmMovimento() == false) {
			mover();
		}
	};

	protected void mover() {
		if (velocidade == 0) {
			velocidade++;
		}
	};

	protected boolean estaEmMovimento() {
		if (velocidade > 0) {
			return true;
		} else
			return false;

	};

}
