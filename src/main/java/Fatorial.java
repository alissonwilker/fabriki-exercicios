

import java.util.Scanner;
import java.io.PrintStream;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int fatorial = 0, res = 1;

		fatorial = entrada.nextInt();

		for (int i = fatorial; i <= 25; i--) {
			res = res * i;

		}
		saida.println("fatotrial de = " + fatorial + "é = " + res);
	}
}
