import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Carro extends Automovel {
	private Carro carro;
	
    public void setUp() throws Exception {
        carro = new Carro();
    }

    public void Carro() {
        assertEquals(4, Carro.getQtdePneus());
        Carro.aumentarVelocidade();
        assertEquals(0, Carro.getVelocidade());
        assertFalse(Carro.estaEmMovimento());
        Carro.frear();
        assertEquals(0, Carro.getVelocidade());
        Carro.moverParaFrente();
        assertEquals(1, Carro.getVelocidade());
        assertTrue(Carro.estaEmMovimento());
        assertTrue(Carro.estaLigado());
        assertTrue(Carro.estaEmMarchaAFrente());
        Carro.aumentarVelocidade();
        assertEquals(2, carro.getVelocidade());
        Carro.moverParaTras();
        assertFalse(Carro.estaEmMarchaAFrente());
        assertEquals(1, Carro.getVelocidade());
        Carro.moverParaTras();
        assertEquals(1, Carro.getVelocidade());
        Carro.desligar();
        assertFalse(Carro.estaEmMovimento());
        assertFalse(Carro.estaLigado());
        Carro.moverParaFrente();
        assertTrue(Carro.estaLigado());
        assertTrue(Carro.estaEmMarchaAFrente());
        assertEquals(1, Carro.getVelocidade());
    }

}

