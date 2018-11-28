import java.io.PrintStream;
import java.math.BigDecimal;

public class LDP7252 {

	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		BigDecimal dobro = new BigDecimal(2);
		BigDecimal totalGraos = BigDecimal.ZERO;
		for (int quadrados = 0; quadrados <= 63; quadrados++) {
			totalGraos = totalGraos.add(dobro.pow(quadrados));
		}
		saida.println("totalGraos = " + totalGraos);
	}
}
