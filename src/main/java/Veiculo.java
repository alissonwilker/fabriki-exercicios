
public abstract class Veiculo {
	
	protected int qtdePneus;
	protected int velocidade;
	
	
	
	protected int getQtdePneus() {
		
		return qtdePneus;
	}
	

	public int getVelocidade() {
		
		return velocidade;
	}

	public void aumentarVelocidade() {
		
	}

	public void frear() {
		
	}

	public void parar() {
		
		;
	}

	public void moverParaFrente() {
	
		
	}
	
	protected void mover() {
		
		
	}

	protected boolean estaEmMovimento() {
		
		return false;
	}

}
