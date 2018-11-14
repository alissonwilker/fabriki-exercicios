import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MotoTest {
    private Moto moto;

    @Before
    public void setUp() throws Exception {
        moto = new Moto();
    }

    @Test
    public void testMoto() {
        assertEquals(2, moto.getQtdePneus());
        moto.aumentarVelocidade();
        assertEquals(0, moto.getVelocidade());
        assertFalse(moto.estaEmMovimento());
        moto.frear();
        assertEquals(0, moto.getVelocidade());
        moto.moverParaFrente();
        assertEquals(1, moto.getVelocidade());
        assertTrue(moto.estaEmMovimento());
        assertTrue(moto.estaLigado());
        assertTrue(moto.estaEmMarchaAFrente());
        moto.aumentarVelocidade();
        assertEquals(2, moto.getVelocidade());
        moto.desligar();
        assertFalse(moto.estaEmMovimento());
        assertFalse(moto.estaLigado());
        moto.moverParaFrente();
        assertTrue(moto.estaLigado());
        assertTrue(moto.estaEmMarchaAFrente());
        assertEquals(1, moto.getVelocidade());
    }

}
