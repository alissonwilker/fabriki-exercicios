public class Veiculo {
	protected int velocidade;
	protected int qtdePneus;

	public void aumentarVelocidade() {
		// TODO Auto-generated method stub
	if (estaEmMovimento() == true){
		velocidade++;
	}	
		
	}

	public void moverParaFrente() {
		// TODO Auto-generated method stub
		if (estaEmMovimento() == false){
			velocidade++;
		}
	}
	
	protected boolean estaEmMovimento() {
		 if(velocidade > 0){
			 return true;
		 }else	{
			return false;
		 }
		}
	
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
		if(velocidade > 0){
			--velocidade;
		}
	}

	public void parar() {
		// TODO Auto-generated method stub
		velocidade = 0;
	}
	
	protected void mover(){
		// TODO Auto-generated method stub
		
	}

}
