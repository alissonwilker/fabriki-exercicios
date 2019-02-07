import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Before
	public void setUp() {
		this.calculadora = new Calculadora();
	}
	
	@Test
	public void somaTest() {
		
		double resultado = this.calculadora.soma(5, 3);
		
		Assert.assertTrue(resultado == 8);
	}

}
