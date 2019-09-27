import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		BigInteger big = new BigInteger("0");

		for (int i = 0; i <= 63; i++) {

			big = big.add(BigInteger.valueOf((long) Math.pow(2, i)));
		}

		saida.println("totalGraos = " + big);
	}

}
