
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import xadrez.Situacao;
import xadrez.Xadrez;

public class XadrezTest {
    @Test
    public void testXequeMateEmUmLance() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(new File("src/test/resources/xequeMateEmUmLance1.txt"));
        assertEquals(Situacao.Em_Andamento, xadrez.getSituacao());
        xadrez.jogar("C5B5");
        assertEquals(Situacao.Xeque_Mate_Pretas, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/xequeMateEmUmLance1.txt"));
        List<String> movimentosXequeMate = TestUtil.procurarMovimentosXequeMateEmUmLance(xadrez);
        assertEquals(1, movimentosXequeMate.size());
        assertTrue(movimentosXequeMate.contains("C5B5"));

        xadrez = new Xadrez(new File("src/test/resources/xequeMateEmUmLance2.txt"));
        assertEquals(Situacao.Em_Andamento, xadrez.getSituacao());
        xadrez.jogar("C2C1C");
        assertEquals(Situacao.Xeque_Mate_Brancas, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/xequeMateEmUmLance2.txt"));
        movimentosXequeMate = TestUtil.procurarMovimentosXequeMateEmUmLance(xadrez);
        assertEquals(1, movimentosXequeMate.size());
        assertTrue(movimentosXequeMate.contains("C2C1C"));

        xadrez = new Xadrez(new File("src/test/resources/xequeMateEmUmLance3.txt"));
        assertEquals(Situacao.Xeque_Brancas, xadrez.getSituacao());
        movimentosXequeMate = TestUtil.procurarMovimentosXequeMateEmUmLance(xadrez);
        assertEquals(2, movimentosXequeMate.size());
        assertTrue(movimentosXequeMate.contains("F7E8B"));
        assertTrue(movimentosXequeMate.contains("F7E8D"));
        assertTrue(xadrez.jogar(movimentosXequeMate.get(0)));
        assertEquals(Situacao.Xeque_Mate_Pretas, xadrez.getSituacao());
    }

}
