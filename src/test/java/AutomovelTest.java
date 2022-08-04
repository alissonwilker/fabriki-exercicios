import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AutomovelTest {
    private Automovel carro;
    private Automovel moto;

    @Before
    public void setUp() throws Exception {
        carro = new Carro();
        moto = new Moto();
    }
    
    @Test
    public void testCarro() {
        assertEquals(4, carro.getQtdePneus());
        testAutomovel(carro);
    }

    @Test
    public void testMoto() {
        assertEquals(2, moto.getQtdePneus());
        testAutomovel(moto);
    }

    private void testAutomovel(Automovel automovel) {
        automovel.desligar();
        assertFalse(automovel.estaEmMovimento());
        assertFalse(automovel.estaLigado());
        automovel.ligar();
        assertFalse(automovel.estaEmMovimento());
        assertTrue(automovel.estaLigado());
        automovel.aumentarVelocidade();
        assertEquals(0, automovel.getVelocidade());
        assertFalse(automovel.estaEmMovimento());
        automovel.frear();
        assertEquals(0, automovel.getVelocidade());
        automovel.moverParaFrente();
        assertEquals(1, automovel.getVelocidade());
        assertTrue(automovel.estaEmMovimento());
        assertTrue(automovel.estaLigado());
        assertTrue(automovel.estaEmMarchaAFrente());
        automovel.aumentarVelocidade();
        assertEquals(2, automovel.getVelocidade());
        automovel.desligar();
        assertFalse(automovel.estaEmMovimento());
        assertFalse(automovel.estaLigado());
        automovel.parar();
        assertFalse(automovel.estaEmMovimento());
        assertFalse(automovel.estaLigado());
        automovel.moverParaFrente();
        assertTrue(automovel.estaLigado());
        assertTrue(automovel.estaEmMarchaAFrente());
        assertEquals(1, automovel.getVelocidade());
    }

}
