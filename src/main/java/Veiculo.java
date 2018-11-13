
public abstract class Veiculo { 
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
	
	

	public void frear() {
		// TODO Auto-generated method stub
	if(velocidade > 0) {	
		velocidade--;
	}else {
		velocidade = 0;
	}
		
	}

	public void parar() {
		// TODO Auto-generated method stub
		velocidade = 0;
	}



	public void aumentarVelocidade() {
		// TODO Auto-generated method stub
	if(estaEmMovimento() == true) {	
		velocidade++;
	}
	}



	public void moverParaFrente() {
		// TODO Auto-generated method stub
	if(velocidade <= 0) {	
		velocidade++;
	}
	}
	
	
	protected void mover(){
		
	}



	protected boolean estaEmMovimento() {
		// TODO Auto-generated method stub
		if(velocidade >0) {
			return true;
		}else {
		return false;
		}
	}
	

}
