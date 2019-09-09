

import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numero = entrada.nextInt();

		// System.out.println("Informe um número");

		if (numero % 2 == 0 && numero >= 0) {
			saida.print("PAR E POSITIVO = " + numero);
		} else {
			saida.print("IMPAR E NEGATIVO = " + numero);
		}

		

	}

}
