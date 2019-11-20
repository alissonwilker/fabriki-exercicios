public abstract class Veiculo extends java.lang.Object {
	protected int velocidade;
	protected int qtdePneus;
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getQtdePneus() {
		return qtdePneus;
	}
	
	public void aumentarVelocidade() {
		if(this.velocidade != 0) {
			this.velocidade++;
		}
		
	}
	
	public void frear() {
		if(this.velocidade != 0) {
			this.velocidade--;
		}
		
	}
	
	public void parar() {
		if(this.velocidade != 0) {
			this.velocidade = 0;
		}
		
	}
	
	public void moverParaFrente() {
		if(velocidade == 0) {
			velocidade++;
		}
		
		
	}
	
	protected void mover() {
		if(this.velocidade == 0) {
			this.velocidade = 1;
		}
		
	}
	
	protected boolean estaEmMovimento() {
		if(this.velocidade != 0) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
