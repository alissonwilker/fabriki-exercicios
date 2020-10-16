public class Veiculo {

	private static final Object QtdePneus = null;
	protected int velocidade;
	protected int qtdePneus;

	public void aumentarVelocidade() {
		// TODO Auto-generated method stub
		if (estaEmMovimento() == true ) {
			velocidade++;
			}
	}

	public Object getVelocidade() {
		// TODO Auto-generated method stub
		return velocidade;
	}

	public boolean estaEmMovimento() {
		// TODO Auto-generated method stub
		if (velocidade > 0) {
		return true;
		} else {
		return false;
		}
	}

	public void moverParaFrente() {
		// TODO Auto-generated method stub
		if (estaEmMovimento() == false) {
			mover();
			}	
	}

	private void mover() {
		// TODO Auto-generated method stub
		if (estaEmMovimento() == false) {
			velocidade++;
			}	
	}

	public void frear() {
		// TODO Auto-generated method stub
		if (estaEmMovimento() == true ) {
			velocidade--;
			}
	}

	public void parar() {
		// TODO Auto-generated method stub
		while (velocidade > 0) {
			velocidade--;
			}
	}

	public Object getQtdePneus() {
		// TODO Auto-generated method stub
		return QtdePneus;
	}

}
