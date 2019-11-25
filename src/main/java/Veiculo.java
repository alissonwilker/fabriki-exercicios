package exercicio;

public abstract class Veiculo extends java.lang.Object {
	
	protected int quantidadeDePneus = 0;
	protected int velocidade = 0;
	
	public Veiculo() {
		
	}

	public int getQuantidadeDePneus() {
		return quantidadeDePneus;
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
		//Para o veiculo, freando ate que a velocidade seja zero.
		//-1 ate ficar = 0
		while(velocidade > 0) {
			frear();
		}
	}
	
	public void moverParaFrente() {
		//Movimenta o veiculo para frente, se estiver parado.
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
