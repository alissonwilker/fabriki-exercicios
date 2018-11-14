import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Automovel extends Veiculo {
	
	protected boolean marchaParaFrente;
	private boolean ligados;
	
	public void desligar() {
		ligados=false;
		velocidades=0;
	}
	
	public void moverParaFrent() {
		engatarMarchaParaFrent();
		ligados = true;
	}
	
	public boolean estaLigado() {
		engatarMarchaParaFrent();
		if(ligados==true ||velocidades > 0) {
			return true;
		}else {
			return false;
		}
	}
	public void ligar() {
		ligados=true;
	}
	
	public boolean estaEmMarchaAFrent(){
		if(velocidades>0 && marchaParaFrente==true) {
			return true;
		}else {
		return false;
	}
	}
	protected void engatarMarchaParaFrent() {
		marchaParaFrente=true;
	}
	public boolean isLigados() {
		return ligados;
	}
	public boolean setLigados(boolean ligados) {
		this.ligados=ligados;
		return ligados;
	}
}
