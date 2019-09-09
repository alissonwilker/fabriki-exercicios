import java.util.Scanner;
import java.io.PrintStream;

public class LDP7144.java {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int n;

		n = entrada.nextInt();
		if (n >= 0) {
			if (n % 2 == 0) {
				saida.println("PAR E POSITIVO ");
			} else {
				saida.println("ÍMPAR E POSITIVO ");
			}

		} else {
			if (n % 2 == 0) {
				saida.println("PAR E NEGATIVO ");
			} else {
				saida.println("ÍMPAR E NEGATIVO ");
			}

		}

	}

}
