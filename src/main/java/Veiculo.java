public abstract class Veiculo extends java.lang.Object {
	
	protected int qtdePneus = 0;
	protected int velocidade = 0;
	
	public Veiculo() {
		
	}

	public int getQtdePneus() {
		return qtdePneus;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void aumentarVelocidade() {
		if(velocidade != 0) {
			velocidade++;
		}
		
	}
	
	public void frear() {
		if (velocidade > 0) {
			velocidade--;
		}
	}
	
	public void parar() {
	
		while(velocidade > 0) {
			frear();
		}
	}
	
	public void moverParaFrente() {
		if(velocidade == 0) {
			velocidade++;
		}
	}
	
	protected void mover() {
		velocidade = 1;
	}
	
	protected boolean estaEmMovimento() {
		if(velocidade == 0) {
			return false;
		}
		else return true;
	}

	
	
}
