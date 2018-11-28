import java.io.PrintStream;
import java.math.BigDecimal;

public class LDP7252 {

private static PrintStream saida = System.out;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("totalGraos = "+new BigDecimal(2).pow(64).subtract(BigDecimal.ONE));
	}
}
