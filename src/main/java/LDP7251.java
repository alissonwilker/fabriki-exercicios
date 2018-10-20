import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	private static int numero, maior;

	public static void main(String[] args) {
		numero = entrada.nextInt();

		maior = numero;

		while (numero != 0) {
			if (numero > maior) {
				maior = numero;
			}

			numero = entrada.nextInt();
		}
		
		saida.println("maior = " + maior);
	}

}