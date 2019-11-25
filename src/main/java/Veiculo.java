public abstract class Veiculo {
	protected int velocidade;
	protected int qtdPneus;
	
	public int getVelocidade() {
		// TODO Auto-generated method stub
		return velocidade;
	}
	
	public int getQtdePneus() {
		return qtdPneus;
		
	}

	public void aumentarVelocidade() {
		// TODO Auto-generated method stub
		if (estaEmMovimento()==true) {
			velocidade=velocidade+1;
		}
	}

	protected boolean estaEmMovimento() {
		if (velocidade ==0) {
			return false;
		} else {
			return true;
		}
	}

	public void moverParaFrente() {
		// TODO Auto-generated method stub
		if(velocidade==0) {
		velocidade=1;
		}
		}
	

	public void frear() {
		// TODO Auto-generated method stub
		if (velocidade!=0) {
		velocidade=velocidade-1;
		}
	}

	public void parar() {
		// TODO Auto-generated method stub
		velocidade=0;
	}
	
	protected void mover () {
		if(velocidade==0) {
			velocidade=1;
			}
	}
	
	
}
