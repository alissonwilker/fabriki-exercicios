

public abstract class Veiculo extends java.lang.Object{
	
	
	protected int velocidade;
	
	protected int qtdePneus;
	
	public Veiculo() {
		
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getQtdePneus() {
		return qtdePneus;
	}
	
	public void aumentarVelocidade() {
		//velocidade++;
	}
	
	public void frear() {
		//velocidade--;
	}
	
	public void parar() {
		//velocidade = 0;
	}
	
	public void moverParaFrente() {
		//velocidade++;
	}
	
	public void mover() {
		//velocidade++;
	}
	
	protected boolean estaEmMovimento() {
		if (velocidade > 0){
			return true;
		}else
			return false;
	}
	
}
