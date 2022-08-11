

public class Veiculo{	
	
	protected int velocidade;
	
	protected int qtdePneus;
	
	public Veiculo() {	
		
	}
	
	public int getQtdePneus() {
		
		return qtdePneus;
	}
	
	public int getVelocidade() {
		return velocidade;
	}	
	
	public void aumentarVelocidade() {
		if (velocidade != 0) {
		velocidade++;
		}
	}
	
	public void frear() {
		if (velocidade != 0) {
			velocidade--;
			}
	}
	
	public void parar() {
		while (velocidade != 0) {
			velocidade--;
		}
	}
	
	public void moverParaFrente() {
		if (velocidade == 0) {
			velocidade++;
			}
	}
	
	protected void mover() {
		if (velocidade == 0) {
			velocidade++;
			}
	}
	
	protected boolean estaEmMovimento() {
		if (velocidade != 0) {
			return true;
		}else 
			return false;
		
		
	}
	
}
