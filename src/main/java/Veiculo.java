public abstract class Veiculo extends java.lang.Object {
	
	protected int qtdePneus = 0;
	protected int velocidade = 0;
	
	public Veiculo() {
		
	}

	public int getQtdePneus() {
		return qtdePneus;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void aumentarVelocidade() {
		//Aumenta a velocidade do veiculo, caso esteja em movimento.
		if(velocidade != 0) {
			velocidade++;
		}
		
	}
	
	public void frear() {
		//Diminui a velocidade do veiculo, caso esteja em movimento.
		if (velocidade > 0) {
			velocidade--;
		}
	}
	
	public void parar() {
		//Para o movimento do veiculo, freando o veiculo ate que a velocidade seja zero.
		//-1 ate velo = 0
		while(velocidade > 0) {
			frear();
		}
	}
	
	public void moverParaFrente() {
		//Movimenta o veiculo para frente, caso esteja parado.
		if(velocidade == 0) {
			velocidade++;
		}
	}
	
	protected void mover() {
		//Coloca o veiculo em movimento, caso esteja parado.
		velocidade = 1;
	}
	
	protected boolean estaEmMovimento() {
		//Verifica se o veiculo esta em movimento.
		if(velocidade == 0) {
			return false;
		}
		else return true;
	}

}
