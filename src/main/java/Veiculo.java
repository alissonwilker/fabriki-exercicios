
public abstract class Veiculo {
	protected int qtdePneus;
	protected int velocidade;

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

	public int getQtdePneus() {
		return qtdePneus;

	}

	public int getVelocidade() {
		return velocidade;

	}

	protected void mover() {
		if (velocidade ==0) {
			velocidade++; 
		}

	}

	public void moverParaFrente() {
		if(velocidade ==0) {
			mover();
		}

	}

	public void parar() {
		while(velocidade !=0) {
			frear();
		}
    
	}
	public void frear() {
		if(estaEmMovimento()==true) {
			velocidade--;
		}
	}
}
