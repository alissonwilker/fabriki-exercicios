public abstract class Automovel extends Veiculo {
protected boolean marcha = true;
 	private boolean ligado;


 	public Automovel () {

 	}




 	public void moverParaFrente() {
 		if (!ligado) {
 			ligar();
 		}
 		if (!marcha) {
 			engatarmarcha();
 		}
 		if (velocidade == 0) {
 			mover();
 		}
 	}


 	public void ligar() {
 		if (!ligado) {
 			ligado = true;
 		}

 	}


 	public void desligar() {
 		if (ligado) {
 			ligado = false;
 			velocidade = 0;
 		}
 		}


 	public boolean estaLigado() {
 		marcha = true;
 		if (!ligado) {
 			return false;
 		}
 		else {return true;}	

 		}		



 	public boolean estaEmmarcha() {
 		 return marcha;
 	}


 	protected void engatarmarcha() {
 		if (!marcha && velocidade !=0) {
 			parar();
 			marcha = true;
 		}

 	}


 }
