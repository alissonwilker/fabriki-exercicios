public class Carro extends Automovel{
	public Carro(){
		qtdePneus=4;
		
	};
public void moverParaTras() {
	if(estaLigado()==false) {
		ligar();
	};if(estaEmMarchaAFrente()==true) {
		marchaAFrente= false;
		
	};if(velocidade==0) {
		aumentarVelocidade();
	};
	
	
};
protected void engatarMarchaARe() {
	if(marchaAFrente==true) {
		parar();
		marchaAFrente=false;
	};
	if(getVelocidade()>0) {
		velocidade= 0;
	}
};

	
	
}
