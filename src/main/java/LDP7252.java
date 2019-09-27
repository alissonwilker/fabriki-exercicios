import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {
	
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		BigInteger total = BigInteger.valueOf(1);
		BigInteger matriz[][] = new BigInteger [8][8];
		BigInteger totalM = BigInteger.valueOf(0);
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				matriz[i][j] = total;
				total = total.multiply(BigInteger.valueOf(2));
			}
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				totalM = totalM.add(matriz[i][j]);
			}
		}
		saida.println("totalGraos = " + totalM);
	}
}
