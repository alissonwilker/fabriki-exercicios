import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Automovel {
    private Automovel carro;
    private Automovel moto;

    
    public void setUp() throws Exception {
        carro = new Carro();
        moto = new Moto();
    }
    

    public void Carro() {
        assertEquals(4, carro.getQtdePneus());
        testAutomovel(carro);
    }

    
    public void Moto() {
        assertEquals(2, moto.getQtdePneus());
        Automovel(moto);
    }

    private void Automovel(Automovel automovel) {
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
