public abstract class Veiculo {
	protected int qtdePneus;
	protected int velocidade;

	public void aumentarVelocidade() {
		if (estaEmMovimento() == true) {
			velocidade++;
		}

	}

	protected boolean estaEmMovimento() {
		if (velocidade > 0) {
			return true;
		} else {
			return false;
		}

	}

	public void frear() {
		if (estaEmMovimento() == true) {
			velocidade--;
		}

	}

	public int getQtdePneus() {
		return qtdePneus;
	}
	
	public int getVelocidade() {
		return velocidade;
	}

	protected void mover() {
		if (estaEmMovimento()==false) {
			velocidade++;
		}
	}
	
	public void moverParaFrente() {
     if (estaEmMovimento()==false) {
    	 mover();
     }
	}

	public void parar() {
		while (getVelocidade()>0){
			velocidade--;
		}
			
	}
}
