import java.io.PrintStream;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numero, fatorial;

		numero = entrada.nextInt();

		for (fatorial = 1; numero <= 25; numero = numero - 1) {
			fatorial = fatorial * numero;

		}
		saida.println(fatorial);
	}

}
