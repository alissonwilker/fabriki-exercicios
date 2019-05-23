
public abstract class Veiculo {
	protected int velocidade;
	protected int qtdePneus;
	
	
	public int getVelocidade() {
		
		return velocidade;
	}


	public int getQtdePneus() {
		
		return qtdePneus;
	}


	public void aumentarVelocidade() {
		
		if(velocidade > 0) {
			velocidade++;
		}
		
	}


	public void frear() {
		if(estaEmMovimento() == true) {
			velocidade--;
		}
	}


	public void parar() {
		if(velocidade > 0) {
			velocidade = 0;
		}
		
	}


	public void moverParaFrente() {
		if(estaEmMovimento() == false) {
			mover();
		}
		
	}
	protected void mover() {
		if(estaEmMovimento() == false) {
			velocidade++;
		}
		
	}


	protected boolean estaEmMovimento() {
		if(velocidade>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	

}
