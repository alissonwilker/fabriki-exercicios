import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int n,maior;

		n = entrada.nextInt();
		maior = n;

		while (n != 0) {

			n = entrada.nextInt();

			if (n > maior && n != 0) {
				maior = n;
			}

		}
		saida.println("maior = " +maior);

	}

}
