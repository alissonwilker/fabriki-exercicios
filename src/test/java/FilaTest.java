import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilaTest {

	private Fila fila;

	@Before
	public void setUp() {
		fila = new Fila();
	}

	@Test
	public void constructorTest() {

		Assert.assertTrue(fila.getTamanho() == 0);

	}

	@Test
	public void getTamanhoTest() {
		Assert.assertTrue(fila.getTamanho() == 0);

		fila.entrarNaFila(1);
		Assert.assertTrue(fila.getTamanho() == 1);

		fila.entrarNaFila(2);
		Assert.assertTrue(fila.getTamanho() == 2);

		fila.entrarNaFila(3);
		Assert.assertTrue(fila.getTamanho() == 3);

		fila.entrarNaFila(4);
		Assert.assertTrue(fila.getTamanho() == 4);

	}

	@Test
	public void entrarNaFila() {

		fila.entrarNaFila(1);
		fila.entrarNaFila(2);
		fila.entrarNaFila(3);
		fila.entrarNaFila(4);

		Assert.assertTrue(fila.getTamanho() == 4);

		Assert.assertTrue(fila.getPosicaoNaFila(1) == 0);
		Assert.assertTrue(fila.getPosicaoNaFila(2) == 1);
		Assert.assertTrue(fila.getPosicaoNaFila(3) == 2);
		Assert.assertTrue(fila.getPosicaoNaFila(4) == 3);

	}

	@Test
	public void sairDaFila() {
		fila.entrarNaFila(1);
		fila.entrarNaFila(2);
		fila.entrarNaFila(3);
		fila.entrarNaFila(4);

		Assert.assertTrue(fila.getTamanho() == 4);

		Integer elementoPosicao = fila.getElementoDaPosicao(0);
		Integer elemento = fila.sairDaFila();
		Assert.assertTrue(fila.getTamanho() == 3);
		Assert.assertEquals(elemento, elementoPosicao);

		elementoPosicao = fila.getElementoDaPosicao(0);
		elemento = fila.sairDaFila();
		Assert.assertTrue(fila.getTamanho() == 2);
		Assert.assertEquals(elemento, elementoPosicao);

		elementoPosicao = fila.getElementoDaPosicao(0);
		elemento = fila.sairDaFila();
		Assert.assertTrue(fila.getTamanho() == 1);
		Assert.assertEquals(elemento, elementoPosicao);

		elementoPosicao = fila.getElementoDaPosicao(0);
		elemento = fila.sairDaFila();
		Assert.assertTrue(fila.getTamanho() == 0);
		Assert.assertEquals(elemento, elementoPosicao);

		// testando o -1
		elementoPosicao = fila.getElementoDaPosicao(0);
		elemento = fila.sairDaFila();
		Assert.assertTrue(fila.getTamanho() == 0);
		Assert.assertEquals(elemento, elementoPosicao);
	}

	@Test
	public void getPosicaoNaFilaTest() {
		fila.entrarNaFila(1);
		fila.entrarNaFila(2);
		fila.entrarNaFila(3);
		fila.entrarNaFila(4);

		Assert.assertTrue(fila.getTamanho() == 4);

		Integer posicao = fila.getPosicaoNaFila(0);
		Assert.assertTrue(posicao == -1);
		
		posicao = fila.getPosicaoNaFila(1);
		Assert.assertTrue(posicao == 0);
		
		posicao = fila.getPosicaoNaFila(2);
		Assert.assertTrue(posicao == 1);
		
		posicao = fila.getPosicaoNaFila(3);
		Assert.assertTrue(posicao == 2);
		
		posicao = fila.getPosicaoNaFila(4);
		Assert.assertTrue(posicao == 3);
		
		posicao = fila.getPosicaoNaFila(5);
		Assert.assertTrue(posicao == -1);
		
	}
	
	@Test
	public void getElementoDaPosicaoTest() {
		fila.entrarNaFila(1);
		fila.entrarNaFila(2);
		fila.entrarNaFila(3);
		fila.entrarNaFila(4);

		Assert.assertTrue(fila.getTamanho() == 4);

		Integer elemento = fila.getElementoDaPosicao(0);
		Assert.assertTrue(elemento == 1);
		
		elemento = fila.getElementoDaPosicao(1);
		Assert.assertTrue(elemento == 2);
		
		elemento = fila.getElementoDaPosicao(2);
		Assert.assertTrue(elemento == 3);
		
		elemento = fila.getElementoDaPosicao(3);
		Assert.assertTrue(elemento == 4);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getElementoDaPosicaoTestOutOfRange() {
		fila.entrarNaFila(1);
		fila.entrarNaFila(2);
		fila.entrarNaFila(3);
		fila.entrarNaFila(4);

		Assert.assertTrue(fila.getTamanho() == 4);

		fila.getElementoDaPosicao(4);
		fila.getElementoDaPosicao(-1);
	}

}
