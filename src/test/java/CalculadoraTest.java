
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
        System.out.println("divisao");
        int x = 10;
        int y = 0;
        Calculadora instance = new Calculadora();
        
        instance.divisao(x, y);
    }
}
