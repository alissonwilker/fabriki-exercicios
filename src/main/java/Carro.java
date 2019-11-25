
public class Carro extends Automovel{
	
	public Carro() {
		super.qtdePneus = 4;
	}
	
	protected void	engatarMarchaARe() {
		super.parar();
		super.marchaAFrente = false;
	}
	
	public void moverParaTras() {
		super.ligar();
		engatarMarchaARe();
		super.mover();
	}
}
