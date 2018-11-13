import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Veiculo {
	private Veiculo carro;
    private Veiculo moto;
    private Veiculo bicicleta;

    public void setUp() throws Exception {
        carro = new Carro();
        moto = new Moto();
        bicicleta = new Bicicleta();
    }
    
    private void Veiculo(Veiculo veiculo) {
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

    public void Bicicleta() {
        assertEquals(2, bicicleta.getQtdePneus());
        Veiculo(bicicleta);
    }

    
    public void testCarro() {
        assertEquals(4, carro.getQtdePneus());
        Veiculo(carro);
    }

    
    public void Moto() {
        assertEquals(2, moto.getQtdePneus());
        Veiculo(moto);
    }

}
