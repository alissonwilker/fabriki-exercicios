import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {

	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		BigInteger graos = BigInteger.valueOf(1);
		BigInteger graosCasa = BigInteger.valueOf(1);

		for (int i = 1; i < 64; i++) {
			graosCasa = graosCasa.multiply(BigInteger.valueOf(2));
			graos = graosCasa.add(graos);
		}
		saida.println("totalGraos = "+ graos);
	}
}
