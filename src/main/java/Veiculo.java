
public abstract class Veiculo {

	protected int velocidade;
	protected int qtdePneus;

	public int getVelocidade() {
		// TODO Auto-generated method stub
		return velocidade;
	}

	public int getQtdePneus() {
		// TODO Auto-generated method stub
		return qtdePneus;
	}

	public void frear() {
		// TODO Auto-generated method stub
		if (estaEmMovimento() == true) {
			velocidade--;
		}

	}

	public void parar() {
		// TODO Auto-generated method stub
		while (velocidade > 0) {
			frear();
		}
	}

	public void aumentarVelocidade() {
		// TODO Auto-generated method stub
		if (estaEmMovimento() == true) {
			velocidade++;
		}
	}

	public void moverParaFrente() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		if (getVelocidade() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
