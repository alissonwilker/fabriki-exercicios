
public abstract class Automovel extends Veiculo {
	
	protected boolean marchaAFrente;
	private boolean ligado;
	
	
	
	public void ligar() {
	if (estaligado()== false){
		
		ligado = true;
	}
	}
	public void desligar() {
	   if(estaLigado()== true && estaEmMovimento()== true)	{
		parar();
		
		ligado = false;
	}
	}
	public boolean estaLigado() {
	
		return ligado;
	}
	public boolean estaEmMarchaAFrente() {
		
	        return MarchaAFrente();
	
	}
	
	protected void engatarMarchaAFrente(){
            if(estaEmMarchaAFrente()== false) {
		parar();
            
		marchaAFrente = true; 
	}
        }



        public void moverParaFrente(){
        if (estaligado()== false){
            ligar();
        }
        if (estaEmMarchaAFrente()== false){
            engatarMarchaAFrente();
        }
        if (estaEmMovimento()== false){
            move();
        }
        

        
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}
}

