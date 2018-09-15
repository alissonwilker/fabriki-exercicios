import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = new PrintStream(System.out);

	public static void main(String[] args) {
		int num = entrada.nextInt();

		if ((num >= 0) && (num % 2 == 0)) {

			saida.println("PAR E POSITIVO");

		} else if ((num < 0) && (num % 2 == 0)) {
			saida.println("PAR E NEGATIVO");

		} else if ((num >= 0) && (num % 2 == 1)) {
			saida.println("ÍMPAR E POSITIVO");

		} else if ((num < 0) && (num % 2 == -1)) {
			saida.println("ÍMPAR E NEGATIVO");

		}

	}

}
