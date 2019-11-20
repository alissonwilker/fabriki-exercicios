public abstract class Veiculo extends java.lang.Object{
	
	//DECLARAÇÃO DE ATRIBUTOS
	protected int velocidade = 0;
	protected int qtdePneus;
	
	//MÉTODO CONSTRUTOR
	public Veiculo() {
		
	}

	//MÉTODOS GET/SET
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public int getQtdePneus() {
		return this.qtdePneus;
}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
		}
	public void setQtdePneus (int qtdePneus) {
		this.qtdePneus = qtdePneus;
	}
		
	//MÉTODOS ESPECÍFICOS
	public void aumentarVelocidade() {		
		
		if (getVelocidade() != 0) {
			setVelocidade(velocidade++);
		}
	}
	
	protected boolean estaEmMovimento() {
		
		if (getVelocidade() != 0) {
			return true;
					}else{
						return false;
					}
					}
	
	public void frear() {
		if (getVelocidade() != 0) {
			setVelocidade(velocidade--); 
		}
	}
	
	protected void mover() {
		if (getVelocidade() == 0) {
		setVelocidade(velocidade++);
	}
}
	
	public void moverParaFrente() {
		if (getVelocidade() == 0) {
			setVelocidade(velocidade++);
		}
	}
	
	public void parar() {
		setVelocidade(0);
		
	}

}
