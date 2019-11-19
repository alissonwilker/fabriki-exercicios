import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest {
    private Bicicleta bicicleta;

    @Before
    public void setUp() throws Exception {
        bicicleta = new Bicicleta();
    }

    @Test
    public void testBicicleta() {
        assertEquals(2, bicicleta.getQtdePneus());
        bicicleta.aumentarVelocidade();
        assertEquals(0, bicicleta.getVelocidade());
        assertFalse(bicicleta.estaEmMovimento());
        bicicleta.frear();
        assertEquals(0, bicicleta.getVelocidade());
        bicicleta.moverParaFrente();
        assertEquals(1, bicicleta.getVelocidade());
        assertTrue(bicicleta.estaEmMovimento());
        bicicleta.aumentarVelocidade();
        assertEquals(2, bicicleta.getVelocidade());
        bicicleta.moverParaFrente();
        assertEquals(2, bicicleta.getVelocidade());
        bicicleta.frear();
        assertEquals(1, bicicleta.getVelocidade());
        bicicleta.parar();
        assertEquals(0, bicicleta.getVelocidade());
    }

}
