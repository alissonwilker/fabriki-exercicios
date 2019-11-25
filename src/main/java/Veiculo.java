public abstract class Veiculo extends java.lang.Object {
	
	protected int quantidadeDePneus = 0;
	protected int velocidade = 0;
	
	public Veiculo() {
		
	}

	public int getQuantidadeDePneus() {
		return quantidadeDePneus;
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
		//-1 ate ficar = 0
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
