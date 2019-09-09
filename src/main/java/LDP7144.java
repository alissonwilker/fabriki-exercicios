import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int n;

		n = entrada.nextInt();

		if (n % 2 == 0) {
			if (n >= 0) {
				saida.println("PAR e POSITIVO");
			} else {
				saida.println("PAR e NEGATIVO");
			}

		} else {
			if (n > 0) {
				saida.println("IMPAR e POSITIVO");
			} else {
				saida.println("IMPAR e NEGATIVO");
			}
		}
	}
}
