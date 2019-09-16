import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int numeros, maior;
		numeros = entrada.nextInt();
		maior = numeros;

		while (numeros != 0) {
			if (numeros > maior) {
				maior = numeros;
				numeros++;
			}

			numeros = entrada.nextInt();

		}
		saida.println("maior = " +maior);

	}
}
