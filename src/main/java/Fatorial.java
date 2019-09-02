import java.io.PrintStream;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		double n = entrada.nextInt();
		double fatorial = n;

		while (n > 1) {
			fatorial = fatorial * (n - 1);
			n--;
		}
		saida.println(fatorial);
	}

}
