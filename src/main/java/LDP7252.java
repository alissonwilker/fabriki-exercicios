import java.io.PrintStream;

public class LDP7252 {

	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		long totalGraos = 0;
		for (int quadrados = 0; quadrados <= 63; quadrados++) {
			totalGraos += Math.pow(2, quadrados);
			
		}
		saida.println("totalGraos = " + totalGraos);
	}
}
