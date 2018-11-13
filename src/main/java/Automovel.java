import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Automovel extends Veiculo {
	private Automovel carro;
    private Automovel moto;
    
    public void setUp() throws Exception {
        carro = new Carro();
        moto = new Moto();
    }
    
    public void Carro() {
        assertEquals(4, carro.getQtdePneus());
        Automovel(carro);
    }
    
    public void Moto() {
        assertEquals(2, moto.getQtdePneus());
        Automovel(moto);
    }

    private void Automovel(Automovel automovel) {
        Automovel.desligar();
        assertFalse(Automovel.estaEmMovimento());
        assertFalse(Automovel.estaLigado());
        Automovel.ligar();
        assertFalse(Automovel.estaEmMovimento());
        assertTrue(Automovel.estaLigado());
        Automovel.aumentarVelocidade();
        assertEquals(0, Automovel.getVelocidade());
        assertFalse(Automovel.estaEmMovimento());
        Automovel.frear();
        assertEquals(0, Automovel.getVelocidade());
        Automovel.moverParaFrente();
        assertEquals(1, Automovel.getVelocidade());
        assertTrue(Automovel.estaEmMovimento());
        assertTrue(Automovel.estaLigado());
        assertTrue(Automovel.estaEmMarchaAFrente());
        Automovel.aumentarVelocidade();
        assertEquals(2, Automovel.getVelocidade());
        Automovel.desligar();
        assertFalse(Automovel.estaEmMovimento());
        assertFalse(Automovel.estaLigado());
        Automovel.parar();
        assertFalse(Automovel.estaEmMovimento());
        assertFalse(Automovel.estaLigado());
        Automovel.moverParaFrente();
        assertTrue(Automovel.estaLigado());
        assertTrue(Automovel.estaEmMarchaAFrente());
        assertEquals(1, Automovel.getVelocidade());
    }

}
