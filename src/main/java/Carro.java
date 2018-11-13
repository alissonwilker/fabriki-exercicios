
public class Carro extends Automovel {
	
	public Carro (){
		super.qtdePneus = 4;
		 
	}

	public void moverParaTras() {
		frear();
		parar();
		engatarMarchaARe();
		
	}
	
	protected void engatarMarchaARe (){
		velocidade++;
	}

}
