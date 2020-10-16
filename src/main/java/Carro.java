public class Carro extends Automovel {

	public Carro() {
		}
	
	public void moverParaTras() {
		// TODO Auto-generated method stub
		if (estaLigado() == false) {
			ligar();
			}
		if (estaEmMarchaAFrente() == true) {
			engatarMarchaARe();
			}

		if (estaEmMovimento() == false) {
			mover();
			}
			}

		private void mover() {
		// TODO Auto-generated method stub
		
	}
		protected void engatarMarchaARe() {
		boolean marchaAFrente = false;
			if (marchaAFrente == true) {
			if (estaEmMovimento() == true) {
			parar();
			}
			marchaAFrente = false;

			}	
	}

}
