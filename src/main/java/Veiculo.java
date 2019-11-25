public abstract class Veiculo extends java.lang.Object{
	//declaraçãode atributos
	protected int qtdePneus;
	protected int velocidade;
	
	// construçãodo metodo
	public Veiculo(){
		
	}
	
	public int getVelocidade() {
		
		return velocidade;
	}
	public int getQtdePneus() {
		return this.qtdePneus;
	}
	public void aumentarVelocidade() {
		if(getVelocidade()!=0) {
			velocidade= velocidade +1;
			}
	}
	public void frear() {
		if(getVelocidade()!=0) {
			velocidade=velocidade -1;
		}
	}
	public void parar() {
		velocidade=0;
	}
	public void moverParaFrente() {
		if(getVelocidade()==0) {
			velocidade=1;
		}
	}
	protected void mover() {
		if(getVelocidade()==0) {
			velocidade=1;
		}
	}
	protected boolean estaEmMovimento() {
		if(getVelocidade()==0) {
			return true;
		}else {
			return false;
		}
	}
}
