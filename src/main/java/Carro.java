
public class Carro extends Automovel {
	
	public Carro (){
		qtdePneus = 4;
	
	}
	
	protected void engatarMarchaARe (){
		super.estaEmMarchaAFrente();
		super.parar();
			marchaAFrente = false;	
	}
	
	public void moverParaTras() {
		super.ligar();
		if( marchaAFrente == true) {
			engatarMarchaARe ();
			
		} 
		super.getVelocidade();
		if ( velocidade == 0) {
			super.mover();
			
		}
		
		
		
		
		
	}
	
	

}
