public abstract class Automovel extends Veiculo {
	
	private boolean	ligado = false;
	protected boolean marchaAFrente = false;
	
	public Automovel() {
		
	}
	
	public void	desligar() {
		//Se estiver ligado, para o automovel se necessario, e desliga-o.
		super.parar();
		ligado = false;
	}
	
	protected void engatarMarchaAFrente() {
		/*
		 * Se a marcha a frente nao estiver engatada,
		 * para o carro se necessario,
		 * e engata a marcha a frente.*/
		super.parar();
		marchaAFrente = true;
	}
	
	public boolean estaEmMarchaAFrente() {
		//Verifica se a marcha a frente esta engatada.
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
		engatarMarchaAFrente();
		super.moverParaFrente();
		
	}

}
