import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numero = entrada.nextInt();

		if (numero % 2 == 0) {// par
			if (numero >= 0) {// positivo
				saida.println("PAR E POSITIVO");

			} else {
				saida.println("PAR E NEGATIVO");
			}

		} else {// ÍMPAR
			if (numero >= 0) {// positivo
				saida.println("ÍMPAR E POSITIVO");
			} else {
				saida.println("ÍMPAR E NEGATIVO");
			}

		}
	}
}
