import java.io.PrintStream;
import java.util.Scanner;

public class Fatorial {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int valor = entrada.nextInt();
		long fatorial = 1;
		for (int i = 2; i <= valor; i++) {
			fatorial = fatorial * i;
		}
		saida.println(fatorial);
	}
}
