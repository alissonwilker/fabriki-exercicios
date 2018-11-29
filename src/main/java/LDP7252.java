import java.io.PrintStream;
import java.math.BigDecimal;

public class LDP7252 {

	private static PrintStream saida = new PrintStream(System.out);

	public static void main(String[] args) {
		BigDecimal totalGraos = new BigDecimal(0);
		for (int i = 0; i < 64; i++) {
			totalGraos = totalGraos.add(new BigDecimal(Math.pow(2, i)));
		}
		saida.println("totalGraos = " + totalGraos);
	}
}
