import java.io.PrintStream;
import java.util.Scanner;

public class LDP7253 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int contador = 10, i;

		for (i = 1; i <= 100; i++) {
			if (i % contador == 0) {
				saida.println("multiplo de 10");
			}
		}

	}
}
