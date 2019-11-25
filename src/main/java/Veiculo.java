public abstract class Veiculo {

	protected int velocidade = 0;
	protected int qtdePneus;

	public void aumentarVelocidade() {
		// TODO Auto-generated method stub
		if (estaEmMovimento() == true) {
		 velocidade = velocidade + 1;
		 } else {
			 velocidade = 0;
		 }
	}

	public int getVelocidade() {
		// TODO Auto-generated method stub
		return velocidade;
	}

	public boolean estaEmMovimento() {
		// TODO Auto-generated method stub
		if (getVelocidade() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public void moverParaFrente() {
		// TODO Auto-generated method stub
		velocidade = velocidade + 1;

	}

	public void frear() {
		// TODO Auto-generated method stub
		if (estaEmMovimento() == true) {
			 velocidade = velocidade - 1;
			 } else {
				 velocidade = 0;
			 }
	}

	public void parar() {
		// TODO Auto-generated method stub
		velocidade = 0;
	}

	public int getQtdePneus() {
		// TODO Auto-generated method stub
		return qtdePneus;
	}

}



