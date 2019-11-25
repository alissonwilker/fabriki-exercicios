
public abstract class Automovel extends Veiculo{

	//DECLARAÇÃO DE ATRIBUTOS 
	private boolean ligado;
	protected boolean marchaAFrente;

	//MÉTODO CONSTRUTOR
	public Automovel() {
		
	}
	
	//MÉTODOS GET/IS
	//Usa-se is no lugar de get quando o retorno é em booleano. 
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isMarchaAFrente() {
		return marchaAFrente;
	}

	public void setMarchaAFrente(boolean marchaAFrente) {
		this.marchaAFrente = marchaAFrente;
	}
	
	//MÉTODOS ESPECÍFICOS
	public void desligar() {
		if (isLigado() == true) {
		setLigado(false);}
		if(getVelocidade() != 0) {
		setVelocidade(0);
	}
	}
		
		
	protected void engatarMarchaAFrente() {
		if(isMarchaAFrente() == false) {
			setMarchaAFrente(true);
		}
		
	}
	
	public boolean estaEmMarchaAFrente() {
		return isMarchaAFrente();
	}
	
	public boolean estaLigado() {
		if(isLigado() == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void ligar() {
		if(isLigado() == false) {
		setLigado(true);
	}
	}
	public void moverParaFrente() {
		if(isMarchaAFrente() == false) {
			setMarchaAFrente(true);
		}
		if (getVelocidade() == 0) {
			setVelocidade(1);
		}
		if (isLigado() == false) {
			setLigado(true);
		}
	}
	
}
