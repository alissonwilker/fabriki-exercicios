
public class Carro extends Automovel {

	public  Carro () {
		qtdePneus = 4;
		
	}
	

	public void moverParaTras() {
		velocidade++;
		if (!ligado && velocidade == 0) {
			ligar();
			mover();
		}
		engatarMarchARe();
	}
	protected void engatarMarchARe() {
		if (marchaAFrente = true && velocidade !=0) {
			parar();
		velocidade++;
		}
		
	}
}
