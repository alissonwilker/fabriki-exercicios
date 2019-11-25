public abstract class Veiculo extends java.lang.Object {
	
	protected int velocidade;
	
	protected int qtdePneus;


	public int getVelocidade() {
		return velocidade;
	}

	public int getQtdePneus() {
		return qtdePneus;
	}
	

	
	public void aumentarVelocidade() {
		if(estaEmMovimento()==true) {
			velocidade++;
		}
		
		
	}
	
	public void frear() {
		if(velocidade>0) {
			velocidade--;
		}
	}
	
	public void parar() {
		
		while(velocidade>0) {
			
			velocidade--;
		}
	}
	
	public void moverParaFrente() {
		if(getVelocidade()==0) {
			mover();
		}
	}
	
	protected void mover() {
		if(getVelocidade()==0) {
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

