public class Veiculo{
	protected int velocidades;
	protected int qtdePneus;
	
	protected boolean estaEmMovimento() {
		if(velocidades>0) {
			return true;
		}else {
			return false;
		}
	}
	public void aumentarVelocidade() {
		if(estaEmMovimento()==true) {
			velocidades++;
		}
	}
	public void moverParaFrent() {
		if(estaEmMovimento()==false) {
			velocidades++;
		}
	}
	public void frear() {
		if(velocidades>0) {
			--velocidades;
		}
	}
	public void parar() {
		velocidades=0;
	}
	public int getVelocidade() {
		return velocidades;
	}
	public int getQtdePneus() {
		return qtdePneus;
	}
	protected void mover() {
		
	}
}
