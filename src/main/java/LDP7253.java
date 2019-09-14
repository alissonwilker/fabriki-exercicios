import java.util.Scanner;
import java.io.PrintStream;

public class LDP7253 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int multiplo = 10, i;

		for (i = 1; i <= 100; i++) {

			if (i % multiplo == 0) {
				saida.println("Multiplo de 10");
			}
		}

	}

}
