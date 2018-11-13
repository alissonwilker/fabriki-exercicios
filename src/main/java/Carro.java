
public class Carro extends Automovel{
	
	public Carro(){
		qtdePneus = 4;
	}

	public void moverParaTras() {
		// TODO Auto-generated method stub
		frear();
		parar();
		engatarMarchaARe();
		 
		
	}
	
	protected void engatarMarchaARe(){
		velocidade++;
		marchaAFrente = false;
		
	}

}
