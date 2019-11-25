public abstract class Automovel extends Veiculo{
	
	protected boolean marchaAFrente;
	
	private boolean ligado;
	
	
	
	@Override
	public void moverParaFrente() {
		
		
		if(ligado==false) {
			ligar();
			mover();
			if(marchaAFrente==false) {
				marchaAFrente = true;
				
				mover();
				
			}

		}else {
			marchaAFrente = true;
			mover();
		}
	}
	
	
	public void ligar() {
		if(ligado==false) {
			ligado = true;
		}
	}
	
	public void desligar() {
		if(ligado==true) {
			parar();
			ligado = false;
		}
	}
	
	public boolean estaLigado() {
		return ligado;
	}
	
	public boolean estaEmMarchaAFrente() {
		return marchaAFrente;
	}
	
	protected void engatarMarchaAFrente() {
		if(marchaAFrente==false) {
			parar();
			marchaAFrente = true;
		}
	}
	
	@Override
	public int getVelocidade() {
		// TODO Auto-generated method stub
		return super.getVelocidade();
	}
	
	@Override
	protected boolean estaEmMovimento() {
		// TODO Auto-generated method stub
		return super.estaEmMovimento();
	}
	
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		super.parar();
	}
	
	
	
}
