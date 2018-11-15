public abstract class Veiculo {
	protected int velocidade;
	protected int qtdePneus;
	
	public int getVelocidade() {
		return velocidade;
	}
			
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getQtdePneus() {
		return qtdePneus;
	}
			
	public void setQtdePneus(int qtdePneus) {
		this.qtdePneus = qtdePneus;
	}

	public void aumentarVelocidade() {
		if(estaEmMovimento()) {
		velocidade++;
		}
	}
	
	public void frear() {
			if(estaEmMovimento()) {
			velocidade--;
			}
		}
	
	public void parar() {
		if(estaEmMovimento() == true) {
			while(velocidade > 0){
				velocidade--;
			}
		}
	}
		
	public void moverParaFrente() {
		if(!estaEmMovimento()) {
			velocidade++;
		}
	}
	
	protected void mover() {
		if(!estaEmMovimento()) {
			velocidade++;
		}
	}
	
	protected boolean estaEmMovimento() {
		return velocidade > 0;
	}
}
