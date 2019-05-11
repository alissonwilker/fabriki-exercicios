
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import xadrez.Situacao;
import xadrez.Xadrez;
import xadrez.Xadrez.OpcaoPecas;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;
import xadrez.pecas.Peca.Tipo;

public class XadrezTest {
    @Test
    public void testPosicaoPecas() {
        Xadrez xadrez = new Xadrez(OpcaoPecas.BRANCA);

        Peca pecaEmD1 = xadrez.get("D1");
        assertEquals(Cor.BRANCA, pecaEmD1.getCor());
        assertEquals(Tipo.Dama, pecaEmD1.getTipo());

        Peca pecaEmD8 = xadrez.get("D8");
        assertEquals(Cor.PRETA, pecaEmD8.getCor());
        assertEquals(Tipo.Dama, pecaEmD8.getTipo());

        xadrez = new Xadrez(OpcaoPecas.PRETA);
        pecaEmD1 = xadrez.get("D1");
        assertEquals(Cor.BRANCA, pecaEmD1.getCor());
        assertEquals(Tipo.Dama, pecaEmD1.getTipo());

        pecaEmD8 = xadrez.get("D8");
        assertEquals(Cor.PRETA, pecaEmD8.getCor());
        assertEquals(Tipo.Dama, pecaEmD8.getTipo());
    }

    @Test
    public void testMovimentoIlegal() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(OpcaoPecas.BRANCA);
        assertTrue(xadrez.jogar("A2A4"));
        assertTrue(xadrez.jogar("B7B5"));
        assertFalse(xadrez.jogar("A4A6"));

        xadrez = new Xadrez(new File("src/test/resources/movimentoIlegal1.txt"));
        assertEquals(Situacao.Xeque_Pretas, xadrez.getSituacao());

        assertFalse(xadrez.jogar("B7A6"));
        assertEquals(Situacao.Xeque_Pretas, xadrez.getSituacao());
    }

    @Test
    public void testCapturaEnPassant() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(new File("src/test/resources/capturaEnPassant1.txt"));
        assertTrue(xadrez.jogar("A2A4"));
        assertEquals("A4", xadrez.getIdCasaPeaoEnPassant());
        assertTrue(xadrez.jogar("B4A3"));
        assertNull(xadrez.get("A4"));
        assertNull(xadrez.getIdCasaPeaoEnPassant());

        xadrez = new Xadrez(new File("src/test/resources/capturaEnPassant2.txt"));
        assertEquals("A4", xadrez.getIdCasaPeaoEnPassant());
        assertTrue(xadrez.jogar("B4A3"));
        assertNull(xadrez.get("A4"));
        assertNull(xadrez.getIdCasaPeaoEnPassant());

        xadrez = new Xadrez(new File("src/test/resources/capturaEnPassant2.txt"));
        assertEquals("A4", xadrez.getIdCasaPeaoEnPassant());
        assertTrue(xadrez.jogar("E8E7"));
        assertNull(xadrez.getIdCasaPeaoEnPassant());
        assertTrue(xadrez.jogar("E1E2"));
        assertFalse(xadrez.jogar("B4A3"));
        assertNotNull(xadrez.get("A4"));
    }

    @Test
    public void testRoque() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(new File("src/test/resources/roque1.txt"));
        assertTrue(xadrez.jogar("E1G1"));
        assertNull(xadrez.get("H1"));
        assertNotNull(xadrez.get("F1"));

        assertFalse(xadrez.jogar("E8G8"));
        assertNotNull(xadrez.get("H8"));
        assertNull(xadrez.get("F8"));

        xadrez = new Xadrez(new File("src/test/resources/roque1.txt"));
        assertTrue(xadrez.jogar("E1G1"));
        assertNull(xadrez.get("H1"));
        assertNotNull(xadrez.get("F1"));

        xadrez = new Xadrez(new File("src/test/resources/roque1.txt"));
        assertTrue(xadrez.jogar("A1A2"));
        assertTrue(xadrez.jogar("E8G8"));
        assertNull(xadrez.get("H8"));
        assertNotNull(xadrez.get("F8"));

        xadrez = new Xadrez(new File("src/test/resources/roque1.txt"));
        assertTrue(xadrez.jogar("E1C1"));
        assertNull(xadrez.get("A1"));
        assertNotNull(xadrez.get("D1"));

        xadrez = new Xadrez(new File("src/test/resources/roque1.txt"));
        assertTrue(xadrez.jogar("A1A2"));
        assertTrue(xadrez.jogar("E8C8"));
        assertNull(xadrez.get("A8"));
        assertNotNull(xadrez.get("D8"));

        xadrez = new Xadrez(new File("src/test/resources/roque2.txt"));
        assertFalse(xadrez.jogar("E1G1"));

        xadrez = new Xadrez(new File("src/test/resources/roque2.txt"));
        assertTrue(xadrez.jogar("A1A2"));
        assertTrue(xadrez.jogar("E8G8"));
        assertNull(xadrez.get("H8"));
        assertNotNull(xadrez.get("F8"));

        xadrez = new Xadrez(new File("src/test/resources/roque2.txt"));
        assertFalse(xadrez.jogar("E1C1"));

        xadrez = new Xadrez(new File("src/test/resources/roque2.txt"));
        assertTrue(xadrez.jogar("A1A2"));
        assertFalse(xadrez.jogar("E8C8"));
    }

    @Test
    public void testMovimentosValidos() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(new File("src/test/resources/movimentosValidos1.txt"));
        Peca peaoEmC2 = xadrez.get("C2");
        List<String> movimentosValidosPeao = peaoEmC2.getMovimentosValidos(xadrez);
        assertEquals(8, movimentosValidosPeao.size());
        assertTrue(movimentosValidosPeao.contains("C2C1D"));
        assertTrue(movimentosValidosPeao.contains("C2C1T"));
        assertTrue(movimentosValidosPeao.contains("C2C1C"));
        assertTrue(movimentosValidosPeao.contains("C2C1B"));
        assertTrue(movimentosValidosPeao.contains("C2D1D"));
        assertTrue(movimentosValidosPeao.contains("C2D1T"));
        assertTrue(movimentosValidosPeao.contains("C2D1C"));
        assertTrue(movimentosValidosPeao.contains("C2D1B"));
    }

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

    @Test
    public void testGetIdCasa() {
        Xadrez xadrez = new Xadrez(OpcaoPecas.BRANCA);
        assertEquals("A8", xadrez.getIdCasa(0, 7));

        xadrez = new Xadrez(OpcaoPecas.PRETA);
        assertEquals("A8", xadrez.getIdCasa(0, 7));
    }

    @Test
    public void testXequeMate() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(new File("src/test/resources/xequeMatePretas1.txt"));
        assertEquals(Situacao.Xeque_Mate_Pretas, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/xequeMatePretas2.txt"));
        assertEquals(Situacao.Xeque_Pretas, xadrez.getSituacao());
        xadrez.jogar("B8A8");
        xadrez.jogar("D6B8");
        xadrez.jogar("H8B8");
        xadrez.jogar("A6C7");
        assertEquals(Situacao.Xeque_Mate_Pretas, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/xequeMatePretas3.txt"));
        assertEquals(Situacao.Xeque_Mate_Pretas, xadrez.getSituacao());
    }

    @Test
    public void testEmpateAfogamento() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(new File("src/test/resources/empateAfogamento1.txt"));
        assertEquals(Situacao.Em_Andamento, xadrez.getSituacao());
        assertTrue(xadrez.jogar("B6C6"));
        assertEquals(Situacao.Empate, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/empateAfogamento2.txt"));
        assertEquals(Situacao.Empate, xadrez.getSituacao());
    }

    @Test
    public void testEmpate50LancesSemCaptura() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(new File("src/test/resources/empate50LancesSemCaptura1.txt"));
        assertEquals(Situacao.Empate, xadrez.getSituacao());
    }

    @Test
    public void testEmpateInsuficienciaMaterial() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(new File("src/test/resources/empateInsuficienciaMaterial1.txt"));
        assertEquals(Situacao.Empate, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/empateInsuficienciaMaterial2.txt"));
        assertEquals(Situacao.Empate, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/empateInsuficienciaMaterial3.txt"));
        assertEquals(Situacao.Empate, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/empateInsuficienciaMaterial4.txt"));
        assertEquals(Situacao.Empate, xadrez.getSituacao());
    }

    @Test
    public void testXequePretas() throws FileNotFoundException {
        Xadrez xadrez = new Xadrez(new File("src/test/resources/xequePretas1.txt"));
        assertEquals(Situacao.Xeque_Pretas, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/xequePretas2.txt"));
        assertEquals(Situacao.Xeque_Pretas, xadrez.getSituacao());

        xadrez = new Xadrez(new File("src/test/resources/xequePretas3.txt"));
        assertEquals(Situacao.Xeque_Pretas, xadrez.getSituacao());
    }

}
