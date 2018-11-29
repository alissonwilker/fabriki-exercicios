iimport java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {

	private static PrintStream saida = new PrintStream(System.out);

	public static void main(String[] args) {

		BigInteger totalGraos = new BigInteger("0");
		for (int quadrados = 0; quadrados <= 63; quadrados++) {
			totalGraos = totalGraos.add(new BigInteger("2").pow(quadrados));
			
		}
		saida.println("totalGraos = " + totalGraos.toString());
	}
}
