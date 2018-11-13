public class Veiculo {
	protected int velocidade;
	protected int qtdePneus;

	protected boolean estaEmMovimento() {
	 if(velocidade > 0){
		 return true;
	 }else	{
		return false;
	 }
	}

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

	public int getVelocidade() {
		// TODO Auto-generated method stub
		return velocidade;
	}
	
	public int getQtdePneus() {
		// TODO Auto-generated method stub
		return qtdePneus;
	}
	
	protected void mover(){
		// TODO Auto-generated method stub
		
	}

}
