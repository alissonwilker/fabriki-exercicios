import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VeiculoTest {
    private Veiculo carro;
    private Veiculo moto;
    private Veiculo bicicleta;

    @Before
    public void setUp() throws Exception {
        carro = new Carro();
        moto = new Moto();
        bicicleta = new Bicicleta();
    }
    
    private void testVeiculo(Veiculo veiculo) {
        veiculo.aumentarVelocidade();
        assertEquals(0, veiculo.getVelocidade());
        assertFalse(veiculo.estaEmMovimento());
        veiculo.moverParaFrente();
        assertEquals(1, veiculo.getVelocidade());
        assertTrue(veiculo.estaEmMovimento());
        veiculo.aumentarVelocidade();
        assertEquals(2, veiculo.getVelocidade());
        veiculo.frear();
        assertEquals(1, veiculo.getVelocidade());
        assertTrue(veiculo.estaEmMovimento());
        veiculo.aumentarVelocidade();
        assertEquals(2, veiculo.getVelocidade());
        assertTrue(veiculo.estaEmMovimento());
        veiculo.parar();
        assertEquals(0, veiculo.getVelocidade());
        assertFalse(veiculo.estaEmMovimento());
        veiculo.frear();
        assertEquals(0, veiculo.getVelocidade());
        assertFalse(veiculo.estaEmMovimento());
        veiculo.aumentarVelocidade();
        assertEquals(0, veiculo.getVelocidade());
        assertFalse(veiculo.estaEmMovimento());
        veiculo.moverParaFrente();
        assertEquals(1, veiculo.getVelocidade());
        assertTrue(veiculo.estaEmMovimento());
    }

    @Test
    public void testBicicleta() {
        assertEquals(2, bicicleta.getQtdePneus());
        testVeiculo(bicicleta);
    }

    @Test
    public void testCarro() {
        assertEquals(4, carro.getQtdePneus());
        testVeiculo(carro);
    }

    @Test
    public void testMoto() {
        assertEquals(2, moto.getQtdePneus());
        testVeiculo(moto);
    }

}
