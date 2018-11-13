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
		if(estaEmMovimento() == true) {
		velocidade++;
		}
	}
	
	public void frear() {
		if(estaEmMovimento()) {
			while(velocidade > 1) {
			velocidade--;
			}
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
		if(velocidade == 0) {
			velocidade = 1;
		}
	}
	
	protected void mover() {
		if(velocidade == 0){
			velocidade = 2;
		}
	}
	
	protected boolean estaEmMovimento() {
		if(velocidade > 0) {
			return true;
		} else {
			return false;
		}
	}
}
