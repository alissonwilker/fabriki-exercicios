
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

	@Test
	public void testSoma() {
		System.out.println("soma");
		int x = 3;
		int y = 5;
		Calculadora instance = new Calculadora();
		int expResult = 8;
		int result = instance.soma(x, y);

		assertEquals(expResult, result);
	}

	@Test
	public void testSubtracao() {
		System.out.println("subtracao");
		int x = 10;
		int y = 2;
		Calculadora instance = new Calculadora();
		int expResult = 8;
		int result = instance.subtracao(x, y);

		assertEquals(expResult, result);
	}

	@Test
	public void testMultiplicacao() {
		System.out.println("multiplicacao");
		int x = 5;
		int y = 5;
		Calculadora instance = new Calculadora();
		int expResult = 25;
		int result = instance.multiplicacao(x, y);

		assertEquals(expResult, result);
	}

	@Test
	public void testDivisao() {
		System.out.println("divisao");
		int x = 10;
		int y = 2;
		Calculadora instance = new Calculadora();
		double expResult = 5.0;
		double result = instance.divisao(x, y);

		assertEquals(expResult, result, 0.0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivisaoPorZero() {
		System.out.println("divisao por zero");
		int x = 10;
		int y = 0;
		Calculadora instance = new Calculadora();

		instance.divisao(x, y);
	}

	@Test
	public void testRaizQuadrada() {
		System.out.println("raiz quadrada");

		Calculadora instance = new Calculadora();
		assertEquals(instance.raizQuadrada(4), 2, 0.0);
		assertEquals(instance.raizQuadrada(-4), Double.NaN, 0.0);
		assertEquals(instance.raizQuadrada(0), 0, 0.0);
	}
	
	@Test
	public void testPotencia() {
		System.out.println("potencia");

		Calculadora instance = new Calculadora();
		assertEquals(instance.potencia(2, 4), 16, 0.0);
		assertEquals(instance.potencia(2, 0), 1, 0.0);
		assertEquals(instance.potencia(2, -1), 0.5, 0.0);
	}
}
