public abstract class Veiculo {
	protected int velocidade, qtdePneus;

	public int getVelocidade() {
		return this.velocidade;

	};

	public int getQtdePneus() {
		return this.qtdePneus;
	};

	public void aumentarVelocidade() {
		if (estaEmMovimento() == true) {
			this.velocidade++;
		}
		;
	};

	public void frear() {
		if (estaEmMovimento() == true) {
			this.velocidade--;
		}
		;

	};

	public void parar() {
		while (velocidade > 0) {
			velocidade--;
		}
		;

	};

	public void moverParaFrente() {
		if (estaEmMovimento() == false) {
			this.velocidade++;
		}
		;

	};

	protected void mover() {
		if (estaEmMovimento() == false) {
			velocidade++;
		}
		;

	};

	protected boolean estaEmMovimento() {
		if (velocidade != 0) {
			return true;
		} else {
			return false;
		}

	}
}
