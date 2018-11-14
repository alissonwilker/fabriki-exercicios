public class Veiculo{
	protected int velocidade;
	protected int qtdePneus;
	
	protected boolean estaEmMovimento() {
		if(velocidade>0) {
			return true;
		}else {
			return false;
		}
	}
	public void aumentarVelocidade() {
		if(estaEmMovimento()==true) {
			velocidade++;
		}
	}
	public void moverParaFrent() {
		if(estaEmMovimento()==false) {
			velocidade++;
		}
	}
	public void frear() {
		if(velocidade>0) {
			--velocidade;
		}
	}
	public void parar() {
		velocidade=0;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public int getQtdePneus() {
		return qtdePneus;
	}
	protected void mover() {
		
	}
}
