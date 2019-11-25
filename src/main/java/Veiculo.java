
public abstract class Veiculo {

	protected int qtdePneus;
	protected int velocidade;
	
	public Veiculo() {
		this.velocidade=0;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	
	public int getQtdePneus() {
		return this.qtdePneus;
	}
	
	public void aumentarVelocidade() {
		if(this.velocidade>0) {
		    this.velocidade++;
		}
	}
	
	public void frear() {
		if(velocidade>0) {
		this.velocidade = velocidade - 1;}
	}
	
	public void parar() {
		this.velocidade = 0;
	}
	
	public void moverParaFrente() {
		if (getVelocidade() == 0) {
			this.velocidade = 1;
		}		
	}
	
	protected void mover() {
		if (estaEmMovimento()==false) {
			velocidade++;		
		} 
	}
	
	protected boolean estaEmMovimento() {
		if (getVelocidade() > 0) {
			return true;
		} else {
			return false;
		}
		 
	}
}
