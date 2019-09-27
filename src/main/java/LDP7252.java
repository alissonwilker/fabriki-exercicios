import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {

	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		BigInteger graos = new BigInteger("0");
		BigInteger graosCasa = new BigInteger("1");
		int casasTabuleiro = 64;

		for (int x = 1; x < casasTabuleiro; x++) {
			graosCasa = graosCasa.multiply(BigInteger.valueOf(2));
			graos = graosCasa.add(graos);
		}
		saida.println("totalGraos = " + graos);
	}
}
