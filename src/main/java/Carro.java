public class Carro extends Automovel{


	public Carro() {
		qtdePneus=4;
	}


	protected void engatarMarchaARe() {
		if(marchaAFrente=true) {
			if(velocidade>0) {
				parar();
			}
		marchaAFrente=false;
		}
	}

	public void moverParaTras() {
		ligar();

		if(marchaAFrente=true) {
			engatarMarchaARe();
		}

		if(velocidade==0) {
			mover();
		}



	}

}
