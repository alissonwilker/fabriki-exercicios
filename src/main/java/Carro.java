
public class Carro extends Automovel{

	public Carro() {
		qtdePneus = 4;
	}
	
	public Carro(boolean marchaAFrente, boolean ligado) {
		super(marchaAFrente, ligado);
	}

	public void moverParaTras() {
		if(estaLigado() == false) {
			ligar();
		}
		
		if(estaEmMarchaAFrente() == true) {
			engatarMarchaARe();
		}
		
		if(estaEmMovimento() == false) {
			mover();
		}
	}
	protected void engatarMarchaARe() {
		if(estaEmMarchaAFrente() == true && estaEmMovimento() == true) {
			parar();
		}
		marchaAFrente = false;
	}
	
}
