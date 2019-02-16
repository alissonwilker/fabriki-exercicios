import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
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
    
}
