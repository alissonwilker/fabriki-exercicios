public class Veiculo {
	
	protected int velocidade;
	protected int qtdePneus;

	public int getVelocidade() {
		// TODO Auto-generated method stub
		return velocidade;
	}

	public int getQtdePneus() {
		// TODO Auto-generated method stub
		return qtdePneus;
	}
	
	public void aumentarVelocidade() {
		if(estaEmMovimento() == true) {
			velocidade++;
		}
		
	}
	
	public void frear() {
		if(estaEmMovimento() == true) {
			velocidade--;
		}
	}

	public void parar() {
		while(velocidade>0) {
			velocidade--;
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
		}else {
			return false;
		}
	}

}
