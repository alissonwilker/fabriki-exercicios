import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {

		BigInteger[] totalGraos = new BigInteger[64];
		totalGraos[0] = BigInteger.valueOf(1);
		
		for (int i = 1; i <= 63 ; i++) {
			
			totalGraos[i] = (totalGraos[i-1].multiply(BigInteger.valueOf(2)));			
		}
		saida.println("TotaoGraos = " +totalGraos[63]); 	
	}
}
