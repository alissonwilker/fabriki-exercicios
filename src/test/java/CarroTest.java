import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CarroTest {
    private Carro carro;

    @Before
    public void setUp() throws Exception {
        carro = new Carro();
    }

    @Test
    public void testCarro() {
        assertEquals(4, carro.getQtdePneus());
        carro.aumentarVelocidade();
        assertEquals(0, carro.getVelocidade());
        assertFalse(carro.estaEmMovimento());
        carro.frear();
        assertEquals(0, carro.getVelocidade());
        carro.moverParaFrente();
        assertEquals(1, carro.getVelocidade());
        assertTrue(carro.estaEmMovimento());
        assertTrue(carro.estaLigado());
        assertTrue(carro.estaEmMarchaAFrente());
        carro.aumentarVelocidade();
        assertEquals(2, carro.getVelocidade());
        carro.moverParaTras();
        assertFalse(carro.estaEmMarchaAFrente());
        assertEquals(1, carro.getVelocidade());
        carro.moverParaTras();
        assertEquals(1, carro.getVelocidade());
        carro.desligar();
        assertFalse(carro.estaEmMovimento());
        assertFalse(carro.estaLigado());
        carro.moverParaFrente();
        assertTrue(carro.estaLigado());
        assertTrue(carro.estaEmMarchaAFrente());
        assertEquals(1, carro.getVelocidade());
    }

}
