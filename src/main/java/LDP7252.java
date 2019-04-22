
import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {
	private static PrintStream saida = System.out;

	private static int numeroQuadro;
	private static BigInteger graosQuadro, totalGraos;

	public static void main(String[] args) {
		numeroQuadro = 1;
		graosQuadro = new BigInteger("1");
		totalGraos = new BigInteger("1");

		do {
			numeroQuadro++;
			graosQuadro = graosQuadro.multiply(new BigInteger("2"));
			totalGraos = totalGraos.add(graosQuadro);
		} while (numeroQuadro < 64);

		saida.println("totalGraos = " + totalGraos);
	}

}
