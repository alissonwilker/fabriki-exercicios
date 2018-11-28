import java.io.PrintStream;

public class LDP7252 {

	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		long totalGraos = 1;

		for (int quadrados = 0; quadrados < 64; quadrados++) {

			if (quadrados != 0) {
				totalGraos = totalGraos * 2;
			}
		}
		saida.println("totalGraos = " + totalGraos);
	}

}
