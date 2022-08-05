public abstract class Automovel extends Veiculo {
	
	protected boolean marchaAFrente;
	
	private boolean ligado;
	
	 public Automovel() {
		 
	 }
	 
	 public void moverParaFrente() {
		 if (ligado == false) {
			 ligado = true;
		 }
		 if (marchaAFrente==false) {
			 marchaAFrente = true;
		 }
		 
		 if (estaEmMovimento()==false) {
			 velocidade++;
		 }		 
	 }
	 
	 public void ligar() {
		 if (ligado == false) {
			 ligado = true;
		 }
	 }
	 
	 public void desligar() {
		 if (ligado == true) {
			 parar();
			 ligado = false;
 		 }
	 }
	 
	 public boolean estaLigado() {
		 if (ligado == true) {
			 return true;
		 }else 
			 return false;
	 }
	 
	 public boolean estaEmMarchaAFrente() {
		 if (marchaAFrente == true) {
			 return true;
		 }else
			 return false;
	 }
	 
	 protected void engatarMarchaAFrente() {
		 if (marchaAFrente == false) {
			 parar();
			 marchaAFrente = true;
		 }
	 }

}
