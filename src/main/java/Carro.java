
public class Carro extends Automovel {

	public  Carro () {
		qtdePneus = 4;
		
	}
	

	public void moverParaTras() {
			ligar();
			mover();
		engatarMarchARe();
		marchaAFrente = false;
		
	}
	
	protected void engatarMarchARe() {
		
			parar();
		velocidade++;
		}
		
	}

