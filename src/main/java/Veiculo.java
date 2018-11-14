public abstract class Veiculo {
	
	protected int qtdePneus;
	protected int velocidade;
	
	public Veiculo(){
		
	}
	
	public void aumentarVelocidade() {
		if(velocidade >=1) {
			velocidade++;
		}
	}
	
	protected boolean estaEmMovimento() {
		if(velocidade >= 1) { return true;
		}else {
			return false;}
		}

	public void frear() {
		if (velocidade >= 1) {
			velocidade--;
		}
	}
	
	public void setQtdePneus(int qtdePneus) {
		this.qtdePneus = qtdePneus;
	}
	
	public int getQtdePneus() {
		return qtdePneus;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getVelocidade() {
		return velocidade;
		
	}
	
	protected void mover() {
		if(velocidade == 0) {
			velocidade++;}
		
		}
	
	public void moverParaFrente() {
		if(velocidade == 0) {
			velocidade++;}
		
		}
	
	public void parar() {
		while (velocidade != 0) {
			velocidade--;
		}
		
	}

}
	

