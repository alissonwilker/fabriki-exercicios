import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int n, maior;

		n = entrada.nextInt();
		maior = n;

		for (int i = 1; n != 0; i++) {
			n = entrada.nextInt();
			if (n > maior) {
				maior = n;

			}

		}
		saida.println("maior = " + maior);

	}

}
