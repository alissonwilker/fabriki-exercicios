import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilhaTest {
	
	private Pilha pilha;;
	
	@Before
	public void setUp() {
		this.pilha = new Pilha();
	}
	
	@Test
	public void getTamanhoTest() {
		
		Assert.assertTrue(pilha.getTamanho() == 0);
		
		pilha.entrarNaPilha(10);
		
		Assert.assertTrue(pilha.getTamanho() == 1);
		
		pilha.entrarNaPilha(11);
		pilha.entrarNaPilha(12);
		pilha.entrarNaPilha(13);
		pilha.entrarNaPilha(14);
		pilha.entrarNaPilha(15);
		
		Assert.assertTrue(pilha.getTamanho() == 6);
		
		pilha.sairDaPilha();
		
		Assert.assertTrue(pilha.getTamanho() == 5);
		
	}
	
	@Test
	public void entrarNaPilhaTest() {
		
		pilha.entrarNaPilha(11);
		pilha.entrarNaPilha(12);
		pilha.entrarNaPilha(13);
		pilha.entrarNaPilha(14);
		pilha.entrarNaPilha(15);
		
		Assert.assertTrue(pilha.sairDaPilha() == 15);
		Assert.assertTrue(pilha.sairDaPilha() == 14);
		Assert.assertTrue(pilha.sairDaPilha() == 13);
		Assert.assertTrue(pilha.sairDaPilha() == 12);
		Assert.assertTrue(pilha.sairDaPilha() == 11);
		
	}
	
	@Test
	public void sairDaPilhaTest() {
		pilha.entrarNaPilha(14);
		pilha.entrarNaPilha(15);
		
		Assert.assertTrue(pilha.sairDaPilha() == 15);
		Assert.assertTrue(pilha.sairDaPilha() == 14);
		
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void sairDaPilhaExceptionTest() {
		pilha.entrarNaPilha(15);
		
		Assert.assertTrue(pilha.sairDaPilha() == 15);
		
		Assert.assertTrue(pilha.sairDaPilha() == 100);// teste de pilha vazia
		
	}
	
	@Test
	public void getTopoTest() {
		
		pilha.entrarNaPilha(11);
		pilha.entrarNaPilha(12);
		pilha.entrarNaPilha(13);
		pilha.entrarNaPilha(14);
		pilha.entrarNaPilha(15);
		
		Assert.assertTrue(pilha.getTopo() == 15);
		Assert.assertTrue(pilha.getTopo() == 15);
		Assert.assertTrue(pilha.getTopo() == 15);
		
		pilha.sairDaPilha();
		
		Assert.assertTrue(pilha.getTopo() == 14);
		Assert.assertTrue(pilha.getTopo() == 14);
		
		pilha.sairDaPilha();
		pilha.sairDaPilha();

		Assert.assertTrue(pilha.getTopo() == 12);
		Assert.assertTrue(pilha.getTopo() == 12);
	}
}
