public abstract class Automovel extends Veiculo {
	
	private boolean	ligado = false;
	protected boolean marchaAFrente = false;
	
	public Automovel() {
		
	}
	
	public void	desligar() {
		//Se estiver ligado, parar o automovel se necessario, e desliga-lo.
		super.parar();
		ligado = false;
	}
	
	protected void engatarMarcha() {
		/*
		 * Se a marcha nao estiver engatada,
		 * parar o carro se necessario,
		 * e engata a marcha .*/
		super.parar();
		marchaAFrente = true;
	}
	
	public boolean estaEmMarchaAFrente() {
		//Verifica se a marcha esta engatada.
		return marchaAFrente;
	}
	
	public boolean	estaLigado() {
		
		if(ligado) {
			return true;
			
		}else return false;
	}
	
	public void	ligar() {
		
		ligado = true;
	}
	
	public void moverParaFrente() {
		
		ligar();
		engatarMarcha();
		super.moverParaFrente();
		
	}

}
