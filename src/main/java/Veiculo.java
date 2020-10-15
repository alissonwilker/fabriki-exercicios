public class Veiculo {

	protected int velocidade;
	protected int qtdePneus;
	
	public int getVelocidade() {
		return velocidade;
	}

	public int getQtdePneus() {
		return qtdePneus;
	}	

	public Veiculo() {}
	
	public Veiculo(int velocidade, int qtdePneus) {
		this.velocidade = velocidade;
		this.qtdePneus = qtdePneus;
	}

	public void aumentarVelocidade() {}
	
	public void frear() {}
	
	public void parar() {}
	
	public void moverParaFrente() {}
	
	protected void mover() {}

	protected boolean estaEmMovimento() {
		return false;
	}
}
