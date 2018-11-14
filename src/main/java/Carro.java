import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class Carro extends Automovel{
	
	public Carro() {
		qtdePneus=4;
	}
	public void moverparaTras() {
		frear();
		parar();
		engatarMarchaARe();
	}
	protected void engatarMarchaARe() {
		velocidades++;
		marchaParaFrente=false;
	}
}
