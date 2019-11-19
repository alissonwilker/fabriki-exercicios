
public abstract class Veiculo extends java.lang.Object{
	
	//DECLARAÇÃO DE ATRIBUTOS
	protected int velocidade = 0;
	protected int qtdePneus;
	
	//MÉTODO CONSTRUTOR
	public Veiculo() {
		
	}

	//MÉTODOS GET
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getQtdePneus() {
		return qtdePneus;
}
	
	//MÉTODOS
	public void aumentarVelocidade() {
		getVelocidade();		
		
		if (velocidade != 0) {
			velocidade ++;
	
		}
	}
	
	protected boolean estaEmMovimento() {
		getVelocidade();
		if (this.velocidade != 0) {
			return true;
					}else{
						return false;
					}
					}
	
	public void frear() {
		getVelocidade();
		if (this.velocidade != 0) {
			velocidade--; 
		}
	}
	
	protected void mover() {
		getVelocidade();
		if (this.velocidade == 0) {
			velocidade++;
		}
		
	}
	
	public void moverParaFrente() {
		getVelocidade();
		if (this.velocidade == 0) {
			velocidade++;
		}
	}
	
	public void parar() {
		frear();
		velocidade = 0;
		
	}
	
	
	
	

}
